package org.alok.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.alok.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO implements IStudentDAO 
{
	@Autowired
	private DataSource ds;
	

	private final static String GET_STUDENT_DEPT = "SELECT * FROM STUDENT WHERE GENDER =? ";

	@Override
	public List<Student> getStudentInfo(String gender1) throws Exception
	{
		ArrayList<Student> list = new ArrayList<>();
		
		try(Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(GET_STUDENT_DEPT);)
		{
			//set values into query
			ps.setString(1, gender1);
			
			
			//execute the query
			try(ResultSet rs = ps.executeQuery();)
			{
				
				while(rs.next())
				{
					//create Students obj
					Student std = new Student();
					//loads the values rs obj to std
					std.setSid(rs.getInt(1));
					std.setSname(rs.getString(2));
					std.setCity(rs.getString(3));
					std.setDept(rs.getString(4));
					std.setGender(rs.getString(5));
					
					//store std obj into list
					
					list.add(std);
				}
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;	
	}
	
}
