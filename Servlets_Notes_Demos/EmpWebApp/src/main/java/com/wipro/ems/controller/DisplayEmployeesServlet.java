package com.wipro.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.wipro.ems.model.EmployeeModel;
import com.wipro.ems.pojo.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayEmployeesServlet
 */
@WebServlet("/DisplayEmployeesServlet")
public class DisplayEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	EmployeeModel model = new EmployeeModel();
	
    /**
     * Default constructor. 
     */
    public DisplayEmployeesServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");

		List<Employee> list =		 model.getAllEmployees();
		
			out.print("<h1>DisplayEmployeeServlet redirected to display page...</h1>");
		
				//out.print("List of Employees <br>");
				
				//list.forEach((emp)->{ out.print(emp +"<br>"); });
			
			
			  	HttpSession session =	request.getSession();
			  	
			  			session.setAttribute("empList", list);
			  	
			
		
		RequestDispatcher  rd =		request.getRequestDispatcher("/views/display.jsp");
		
				//rd.forward(request, response);
		
				rd.include(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
