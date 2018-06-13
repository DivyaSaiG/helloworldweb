package com.sai.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubmitFormServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/HTML");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='/helloworldweb/register' method='GET'>");
		out.println("First name:"+ "<input type='text' name='FirstName' value='Sai'><br>");
		out.println("Last name:"+ "<input type='text' name='LastName' value='Chai'><br>");
		out.println("<input type='submit' value='button'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}
	
}
