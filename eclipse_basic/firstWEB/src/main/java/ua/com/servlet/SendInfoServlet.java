package ua.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendInfoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		System.out.println(req.getParameter("username"));
		System.out.println(req.getParameter("password"));
		
		
		req.getRequestDispatcher("home.jsp").forward(req, resp);
		
 }
	
}
