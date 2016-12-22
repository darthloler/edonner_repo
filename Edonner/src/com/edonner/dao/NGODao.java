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

public class NGODao {
	public NGO ngologin(String username,String password)
	{
		NGO n=new NGO();
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/MyLocalDB");
			Connection conn = ds.getConnection();
			Statement statement = conn.createStatement();
			 java.sql.PreparedStatement ps=null;
			
			
			 
			 String sql1="select * from ngo where email='"+username+"' and password='"+password+"'";
			 ps=conn.prepareStatement(sql1);
			//ps=conn.prepareStatement(sql);
			
			//ResultSet rs = statement.executeQuery(sql);
			ResultSet rs=ps.executeQuery(sql1);
			while(rs.next())
			{
				n.setAddress(rs.getString("address"));
				//d.setDob(rs.getString("dob"));
				n.setPhoneno(rs.getString("phoneno"));
				n.setName(rs.getString("name"));
				return n;
			}
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		
		}

		return null;

	}

	public String  ngoreg(NGO n)
	{
		String msg="kuchbhi";
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/MyLocalDB");
			Connection conn = ds.getConnection();
			Statement statement = conn.createStatement();
			 java.sql.PreparedStatement ps=null;
			
			
			 
			String sql="insert into ngo(name,yearofestd,pincode,address,phoneno,altphone,email,password)values(?,?,?,?,?,?,?,?)"; 
			 ps=conn.prepareStatement(sql);
			 ps.setString(1, n.getName());
		        ps.setString(2, n.getYearofestd());
		        ps.setString(3, n.getPincode());
		        ps.setString(4, n.getAddress());
		        ps.setString(5, n.getPhoneno());
		        ps.setString(6, n.getAltphone());
		        ps.setString(7,n.getEmail());
		         ps.setString(8,n.getPassword());

			ps.executeUpdate();
		msg="success";
			
			
			
		} catch (Exception ex) {
			msg=ex.toString();
		
		}

		return msg;
	}
}
