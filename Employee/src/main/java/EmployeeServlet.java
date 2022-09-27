import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/prashantha")
public class EmployeeServlet extends HttpServlet {
	
	public EmployeeServlet() {
	System.out.println("default constructor----------------------");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String name=req.getParameter("employee");
		String name1=req.getParameter("company");
		String name2=req.getParameter("package");
		
		
		System.out.println("employee data-------------");
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>");
		writer.append("Employee").append(name);
		writer.append("<br>");
		writer.append("Company").append(name1);
		writer.append("<br>");
		writer.append("Package").append(name2);
		writer.append("</h1>");
		writer.append("</body>");
		writer.append("</html>");
		
		
		
		
	}

}
