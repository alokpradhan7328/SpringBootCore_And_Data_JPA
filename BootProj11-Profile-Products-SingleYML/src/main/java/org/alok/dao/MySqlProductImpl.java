package org.alok.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.alok.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("MysqlSAO")
@Profile({"dev","test"})
public class MySqlProductImpl implements IProductDAO
{
	//inject DataSource
	@Autowired 
	private DataSource ds;
	
	public MySqlProductImpl() 
	{
		System.out.println("MySqlProductImpl::0-ParamConstructor");
	}
	
	private static final String GET_PRODUCT_INFO="SELECT PNO,PNAME,PRICE FROM PRODUCT WHERE PNO= ?";

	@Override
	public List<Product> getProductDetails(int pid) throws Exception 
	{
		ArrayList<Product> al = new ArrayList();
		
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_PRODUCT_INFO);)
		{
			//get the parameter values into query
			
			ps.setInt(1, pid);
			
			//execute query
			try(ResultSet rs = ps.executeQuery();)
			{
				while(rs.next())
				{
					//create product Object
					Product p = new Product();
					//store the rs obj into product
					p.setPid(rs.getInt(1));
					p.setPname(rs.getString(2));
					p.setPrice(rs.getDouble(3));
					
					//add the produc obj to List
					al.add(p);
				}
			}
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

}
