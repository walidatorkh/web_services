package a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		System.out.println("got request from " + req.getParameter("name"));
		// print console
		PrintWriter out = res.getWriter();
		out.write("<html>");
		out.write("<h1>");
		out.write("got a request " + req.getParameter("name"));
		out.write("</h1>");
		out.write("</html>");
	}
}
