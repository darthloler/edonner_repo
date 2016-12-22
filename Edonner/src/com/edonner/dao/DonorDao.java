package com.edonner.dao;

import com.edonner.actors.*;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class DonorDao {
	public Donor donorlogin(String username,String password)
	{
		
		String msg="kuchbhi";
		Donor d=new Donor();
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/MyLocalDB");
			Connection conn = ds.getConnection();
			Statement statement = conn.createStatement();
			 java.sql.PreparedStatement ps=null;
			
			
			 
			 String sql1="select * from donors where email='"+username+"' and password='"+password+"'";
			 ps=conn.prepareStatement(sql1);
			//ps=conn.prepareStatement(sql);
			
			//ResultSet rs = statement.executeQuery(sql);
			ResultSet rs=ps.executeQuery(sql1);
			if(rs.next())
			{
				d.setAddress(rs.getString("address"));
				//d.setDob(rs.getString("dob"));
				d.setFirstName(rs.getString("fname"));
				d.setLastName(rs.getString("lname"));
				d.setPincode(rs.getString("pincode"));
				d.setPhoneNo(rs.getString("phoneno"));
				d.setEmail(username);
				d.setPassword(password);
				return d;
			}
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		
		}

		return null;
	}

	
	public String  donorreg(Donor u)
	{
		String msg="kuchbhi";
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/MyLocalDB");
			Connection conn = ds.getConnection();
			Statement statement = conn.createStatement();
			 java.sql.PreparedStatement ps=null;
			
			//String sql ="insert into donors(fname,lname,email,password,phoneno,address,pincode)values('"+d.getFirstName()+"','"+d.getLastName()+"','"+d.getEmail()+"','"+d.getPassword()+"','"+d.getPhoneNo()+"','"+d.getAddress()+"','"+d.getPincode()+"')";
			 
			 String sql1="insert into donors(fname,lname,email,password,phoneno,address,pincode)values(?,?,?,?,?,?,?)";
			 ps=conn.prepareStatement(sql1);
			//ps=conn.prepareStatement(sql);
			ps.setString(1, u.getFirstName());
	        ps.setString(2, u.getLastName());
	        ps.setString(3, u.getEmail());
	        ps.setString(4, u.getPassword());
	        ps.setString(5, u.getPhoneNo());
	        ps.setString(6, u.getAddress());
	        ps.setString(7,u.getPincode());
	 
			//ResultSet rs = statement.executeQuery(sql);
			ps.executeUpdate();
		msg="success";
			
			//int count = 1;
			
			/*if(rs.next())
			{
				System.out.println("data");
			}
			els
			re
			{
				System.out.println("no data");
			}*/
			
		} catch (Exception ex) {
			msg=ex.toString();
		
		}

		return msg;
	}
}
