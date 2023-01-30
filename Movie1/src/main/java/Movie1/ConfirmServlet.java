package Movie1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfirmServlet
 */
@WebServlet("/confirm")
public class ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("<html><body text=green><center><h2>");
		pw.println("Your Tickets Are Booked Successfully :)");
		/*Cookie[] c1=request.getCookies();
		for(Cookie c2:c1)
		{
			pw.println(c2.getValue());
		}*/
		/*String s2=request.getParameter("movie");
		String s3=request.getParameter("theatre");
		String s4=request.getParameter("date");
		String s5=request.getParameter("time");
		String s6=request.getParameter("nooftic");
		pw.println(s2);
		pw.println(s3);
		pw.println(s4);
		pw.println(s5);
		pw.println(s6);*/
		/*if(!s2.equals("null"))
		{
			pw.println(s2+"<br>");
		}
		if(!s3.equals("null"))
		{
			pw.println(s3+"<br>");
		}
		if(!s4.equals("null"))
		{
			pw.println(s4+"<br>");
		}
		if(!s5.equals("null"))
		{
			pw.println(s5+"<br>");
		}
		if(!s6.equals("null"))
		{
			pw.println(s6+"<br>");
		}*/
		pw.println("</h2></center></body></html>");
		RequestDispatcher rd=request.getRequestDispatcher("Booked.html");
		rd.include(request, response);
	}

}
