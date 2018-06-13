package com.sai.helloworld;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class HelloWorldServlet extends HttpServlet{
	final static Logger logger = LogManager.getLogger(HelloWorldServlet.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("entered method doGet");
		
		resp.setContentType("text/html");

		String FName = (String) req.getParameter("FirstName");
		String LName = (String) req.getParameter("LastName");
	      // Actual logic goes here.
	      PrintWriter out = resp.getWriter();
	      out.println("<html>");
	      out.println("<h1>" + "Hello " +FName+", "+LName+ "</h1>");
	      out.println("</html>");
	}

}
