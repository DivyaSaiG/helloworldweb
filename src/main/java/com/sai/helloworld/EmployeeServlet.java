package com.sai.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sai.helloworld.model.Employee;
import com.sai.helloworld.services.EmployeeService;

public class EmployeeServlet extends HttpServlet {
	
	private EmployeeService employeeService = new EmployeeService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out = resp.getWriter();
	List<Employee> outputList = employeeService.getAllEmployees();
	resp.setContentType("text/html");
	  out.println("<html>");
	  out.println("<body>");
      out.println("<table>");
      out.println("<th>");
      out.println("<td> Employee ID </td>");
      out.println("<td> Department </td>");
      out.println("<td> First Name </td>");
      out.println("<td> Last Name </td>");
      out.println("</th>");
      for(Employee employee: outputList ){
    	  out.println("<tr>");
    	  out.println("<td>");
    	  out.print(employee.getEmployeeId());
    	  out.println("</td>");
    	  out.println("<td>");
    	  out.print(employee.getDepartment());
    	  out.println("</td>");
    	  out.println("<td>");
    	  out.print(employee.getFirstName());
    	  out.println("</td>");
    	  out.println("<td>");
    	  out.print(employee.getLastname());
    	  out.println("</td>");
    	  out.println("<td>");
    	  out.print("<a href='EditEmployee?eid="+employee.getEmployeeId()+"'>edit</a>");
    	  out.println("</td>");
    	  out.println("<td>");
    	  out.print("<a href='delete'>delete</a>");
    	  out.println("</td>");
    	  out.println("</tr>");
      }    
      out.println("</table>");
      out.println("</body>");
      out.println("</html>");
	}
}
