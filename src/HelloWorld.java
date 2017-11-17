
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class HelloWorld extends HttpServlet{
	
	private String message;
	
	public void init() throws ServletException{
		//Do required initialization
		message = "Hello World";
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
					throws ServletException, IOException{
	
		//Set response content type
		res.setContentType("text/html");
		
		//Acturl logic goes here
		//-------------------------------------------------------------------
		PrintWriter out = res.getWriter();
		out.println("<h1>" + message + "</h1>");
	}
	
	public void destroy(){
		
		//donothing.
	}
}