package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/XYZ")
public class DeskServlet extends HttpServlet {
	
	public DeskServlet() {
	System.out.println("desk servlet constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service outlet");
	resp.setContentType("text/html");
	PrintWriter writer = resp.getWriter();
	writer.append("<html><body bgcolor='yellow'> <h1> edu yellow" + "</h1></body></html>");
	}
	
}
