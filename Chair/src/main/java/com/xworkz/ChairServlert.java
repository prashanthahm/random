package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/prashanth")
public class ChairServlert extends HttpServlet {
	
	public ChairServlert() {
		System.out.println("this is default");
	
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service outlet");
	resp.setContentType("text/html");
	PrintWriter writer = resp.getWriter();
	writer.append("<html><body bgcolor='green'> <h1> edu green" + "</h1></body></html>");
	}
	
}
