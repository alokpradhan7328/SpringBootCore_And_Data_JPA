package com.alok.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.alok.model.Employee;

@Repository("Ora-empDAO")
@Profile({"uat","prod"})
public class OracleEmployeeImpl implements IEmployeeDAO 
{

	private final String GET_EMPS_QUERY = "SELECT EID,ENAME,SAL,DEPTNO,DESG FROM EMPLOYEE WHERE DESG IN (?,?,?) ORDER BY DEPTNO";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception 
	{

		List<Employee> list = new ArrayList<>() ;
		
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY);)
		{
			// set values to query stmnt
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			// execute the sql query
			try (ResultSet rs = ps.executeQuery()) {
				// copy each record of the RS obj to employee Class Obj
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEid(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setSalary(rs.getDouble(3));
					emp.setDeptno(rs.getInt(4));
					emp.setDesg(rs.getString(5));

					// ad each model class obj to rs
					list.add(emp);
				} // while
			} // try1
		} // end of try2
		catch (SQLException se) 
		{
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		} // catch01

		return list;
	}

}
