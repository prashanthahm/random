package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/abc")
public class MetalServlet extends HttpServlet {
	
	public MetalServlet() {
	System.out.println("metal servlet constructor started");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service outlet");
	resp.setContentType("text/html");
	PrintWriter writer = resp.getWriter();
	writer.append("<html><body bgcolor='black'> <h1 style=color:white> edu black" + "</h1></body></html>");
	}
}
