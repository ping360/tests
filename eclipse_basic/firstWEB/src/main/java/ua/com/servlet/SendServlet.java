package ua.com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(req.getParameter("Username"));
		System.out.println(req.getParameter("Password"));
		System.out.println(req.getParameter("Email"));
		
		req.setAttribute("arrr", "friday");
		 req.getRequestDispatcher("drakeWEB.jsp").forward(req, resp);
	}
}
