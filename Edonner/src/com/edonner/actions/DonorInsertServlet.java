package com.edonner.actions;
import com.edonner.actors.*;

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
import javax.sql.DataSource;/**
 * Servlet implementation class DonorInsertServlet
 */
@WebServlet("/DonorInsertServlet")
public class DonorInsertServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	//private User u;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("Hello World");
		//User u = new User();
		//u=null;
		/*
		int flag;
		u.setFirstName(request.getParameter("firstname"));
		
		u.setLastName(request.getParameter("lastname"));
		u.setDob(request.getParameter("dob"));
		u.setPhoneNo(request.getParameter("phn"));
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));
		u.setAddress(request.getParameter("address"));
		u.setPincode(request.getParameter("pincode"));
		//System.out.println(u.getFirstName());
		  flag=validate();
		  if(flag==0)
		  {
			 // request.setAttribute("a",u);
			  d.Regester(u);
			  
		  }
		  else
		  {
			  
		  }*/
		 /*
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
		System.out.println(u.getDob());
		*/
		PrintWriter writer = response.getWriter();
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/MyLocalDB");
			Connection conn = ds.getConnection();
			Statement statement = conn.createStatement();
			String sql = "select fname, lname from donors";
			ResultSet rs = statement.executeQuery(sql);
			
			int count = 1;
			while (rs.next()) {
				writer.println(String.format("User #%d: %-15s %s", count++, 
						rs.getString("fname"), rs.getString("lname")));
				
			}
			/*if(rs.next())
			{
				System.out.println("data");
			}
			else
			{
				System.out.println("no data");
			}*/
			
		} catch (NamingException ex) {
			System.err.println(ex);
		} catch (SQLException ex) {
			System.err.println(ex);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
/*	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	int validate()
	{
		if(u.getAddress()==null ||u.getDob()==null||u.getEmail()==null||u.getFirstName()==null||u.getLastName()==null||u.getPassword()==null||u.getPhoneNo()==null||u.getPincode()==null)
			
		{
			return 0;
		}
		return 1;
	}*/
	

}
