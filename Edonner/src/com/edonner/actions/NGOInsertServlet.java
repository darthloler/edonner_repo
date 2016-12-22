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
import com.edonner.services.ValidateService;

/**
 * Servlet implementation class NGOInsertServlet
 */
@WebServlet("/NGOInsertServlet")
public class NGOInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NGOInsertServlet() {
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
		NGO n=new NGO();
	      String address;
	        address=request.getParameter("addr1")+request.getParameter("addr2");
	        PrintWriter out = response.getWriter();
	        n.setAddress(address);
	        n.setAltphone(request.getParameter("altphn"));
	        n.setEmail(request.getParameter("email"));
	        n.setName(request.getParameter("nponame"));
	        n.setPhoneno(request.getParameter("phn"));
	        n.setPincode(request.getParameter("pincode"));
	        n.setYearofestd(request.getParameter("yrestd"));
	        n.setPassword(request.getParameter("pwd1"));
	        ValidateService v=new ValidateService();
	  int flag;
	  String msg;
	  flag=v.validatengo(n);
		if(flag==0)
		{
			out.println("Failed");
		}
		else
		{
			NGODao nd=new NGODao();
			msg=nd.ngoreg(n);
			out.println();
		}
		}
	}


