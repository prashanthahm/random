package com.xworkz.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = {"/company", "/show Details"})
public class CompanyServlet extends HttpServlet{
	
	public CompanyServlet() {
		
		System.out.println("default servlet constructor-------------");
	}
	
	List<CompanyDTO> dtos = new ArrayList<CompanyDTO> ();
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
	
		System.out.println("Running -----------------");
		
		res.setContentType("text/html");
		
		String name = req.getParameter("Name");
		String company = req.getParameter("Founder");
		String since = req.getParameter("Since");
		String employees = req.getParameter("employees");
		String address = req.getParameter("address");
		String business = req.getParameter("business");
		
		System.out.println("Name :"+name);
		System.out.println("Founder :"+company);
		System.out.println("Since :"+since);
		System.out.println("employees :"+employees);
		System.out.println("address :"+address);
		System.out.println("business :"+business);
		
		PrintWriter writer=res.getWriter();
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Details")
		.append("</h1>")
		.append("Name :"+name)
		.append("Founder :"+company)
		.append("Since :"+since)
		.append("employees :"+employees)
		.append("address :"+address)
		.append("business :"+business)
		.append("</body>")
		.append("</html>");
		
		CompanyDTO dto = new CompanyDTO(name,company,since,employees,address,business);
		dtos.add(dto);
		
	}
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("running the do get method");
			
			resp.setContentType("text/html");
			
			PrintWriter writer = resp.getWriter();
			
			writer.append("<html>")
			.append("<body>")
			.append("<h1>")
			
			.append("Details")
			.append("</h1>")
			.append("<table>");
			
			for (CompanyDTO companyDTO : dtos) {
			writer.append("<tr>")
			
			.append("<td>")
			.append(companyDTO.getName())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getFounder())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getSince())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getEmployees())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getAddress())
			.append("</td>")
			.append("<td>")
			.append(companyDTO.getBusiness())
			.append("</td>")
			.append("</tr>");
			}
			
			writer.append("</table>")
			.append("</body>")
			.append("</html>");
		

		
		
	}

}
