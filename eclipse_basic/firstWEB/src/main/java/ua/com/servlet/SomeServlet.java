package ua.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String param = req.getParameter("some");
		
		req.setAttribute("in", param);
		
		req.getRequestDispatcher("some.jsp").forward(req, resp);
		
}
}
