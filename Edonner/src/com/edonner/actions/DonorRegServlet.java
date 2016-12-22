package com.edonner.actions;
import com.edonner.actors.Donor;
import com.edonner.dao.DonorDao;
import com.edonner.services.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DonorRegServlet
 */
@WebServlet("/DonorRegServlet")
public class DonorRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorRegServlet() {
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
		//Server Side Validation service to be performed...
		Donor d=new Donor();
		PrintWriter writer = response.getWriter();
d.setFirstName(request.getParameter("firstname"));
		String msg;
		d.setLastName(request.getParameter("lastname"));
		d.setDob(request.getParameter("dob"));
		d.setPhoneNo(request.getParameter("phn"));
		d.setEmail(request.getParameter("email"));
		d.setPassword(request.getParameter("pwd1"));
		d.setAddress(request.getParameter("address"));
		d.setPincode(request.getParameter("pincode"));
		int flag;
		ValidateService v=new ValidateService();
		flag=v.validatedonor(d);
		if (flag==0)
		{
			
		}
		else
		{
			DonorDao rd=new DonorDao();
			msg=rd.donorreg(d);
			writer.println(msg);
			
		}
		}
	}


