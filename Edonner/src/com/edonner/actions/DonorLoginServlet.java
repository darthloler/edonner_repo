package com.edonner.actions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edonner.actors.Donor;
import com.edonner.dao.DonorDao;

/**
 * Servlet implementation class DonorLoginServlet
 */
@WebServlet("/DonorLoginServlet")
public class DonorLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 String username,password;
	        username=request.getParameter("uname");
	        password=request.getParameter("upassword");
	        PrintWriter writer = response.getWriter();
	Donor d=new Donor();
	DonorDao dd=new DonorDao();
	d=dd.donorlogin(username, password);
	if(d==null)
	{
		writer.println("Username or password  did not matched");
	}
	else
	{
		writer.println("Successfully Logged In");	
	}
	}
		
	}

