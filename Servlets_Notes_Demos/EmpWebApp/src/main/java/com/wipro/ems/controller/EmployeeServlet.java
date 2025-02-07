package com.wipro.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.wipro.ems.model.EmployeeModel;
import com.wipro.ems.pojo.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeModel model = new EmployeeModel();

	public EmployeeServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.print("<h1 style='color:red' >Welcome Employee Servlet</h1> <br>");

		String id = request.getParameter("eid");
		String ename = request.getParameter("ename");
		String sal = request.getParameter("salary");

		out.print(id + " " + ename + "  " + sal);

		int eid = Integer.parseInt(id);
		double salary = Double.parseDouble(sal);

		Employee emp = new Employee(eid, ename, salary);

	 int count =	model.addEmp(emp);
	 
	     if(count > 0) {
	    	 
	    	 out.print("<h2 style='color:green'>Employee Registration Successful...</h2>");
	    	 
	     }
	     else {
	    	 
	    	 out.print("<h2 style='color:red'>Employee Registration Failed...</h2>");
	    	 
	     }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
