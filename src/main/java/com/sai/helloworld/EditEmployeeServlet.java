package com.sai.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sai.helloworld.model.Employee;
import com.sai.helloworld.services.EmployeeService;

public class EditEmployeeServlet extends HttpServlet {
	final static Logger logger = LogManager.getLogger(EditEmployeeServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		resp.setContentType("text/html");
		int empId = Integer.parseInt(req.getParameter("eid"));
		EmployeeService employeeService = new EmployeeService();
		Employee emp = employeeService.getEmployeeById(empId);
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='/helloworldweb/EditEmployee' method='POST'>");
		out.println("Employee Id:"+ "<input type='hidden' name='EmpId' value='"+emp.getEmployeeId()+"'><br>");
		out.println("First name:"+ "<input type='text' name='FirstName' value='"+emp.getFirstName()+"'><br>");
		out.println("Last name:"+ "<input type='text' name='LastName' value='"+emp.getLastname()+"'><br>");
		out.println("Last name:"+ "<input type='text' name='Department' value='"+emp.getDepartment()+"'><br>");
		out.println("<input type='submit' value='Edit'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeService employeeService = new EmployeeService();
		int empId = Integer.parseInt(req.getParameter("EmpId"));
		String FirstName = req.getParameter("FirstName");
		String Lastname = req.getParameter("LastName");
		String Department = req.getParameter("Department");
		Employee emp = new Employee(empId, FirstName, Lastname, Department);
		
		employeeService.updateEmployee(emp);
	}

}
