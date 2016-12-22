package com.edonner.actions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edonner.actors.NGO;
import com.edonner.dao.NGODao;

/**
 * Servlet implementation class NGOLoginServlet
 */
@WebServlet("/NGOLoginServlet")
public class NGOLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NGOLoginServlet() {
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
		 PrintWriter out = response.getWriter();
         /* TODO output your page here. You may use following sample code. */
     String username,password;
     username=request.getParameter("uname");
     password=request.getParameter("upassword");
    NGODao nd=new NGODao();
    NGO n=new NGO();
    n=nd.ngologin(username, password);
    if(n==null)
    {
    	out.println("Not Logged IN");
    }
    else
    {
    	out.println("Successfully Logged In");
    }
    }
    
	}


