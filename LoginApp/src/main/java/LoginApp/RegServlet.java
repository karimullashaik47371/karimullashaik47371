package LoginApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection con;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","karimulla");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			try {
				String s1=request.getParameter("fname");
				String s2=request.getParameter("lname");
				String s3=request.getParameter("uname");
				String s4=request.getParameter("pword");
				PreparedStatement pstmt=con.prepareStatement("insert into uinfo values(?,?,?,?)");
				pstmt.setString(1, s1);
				pstmt.setString(2, s2);
				pstmt.setString(3, s3);
				pstmt.setString(4, s4);
				pstmt.executeUpdate();
				PrintWriter pw=response.getWriter();
				pw.println("<html><body bgcolor=red text=yellow><h1>");
				pw.println("user register is successfully done !!!");
				pw.println("</h1></body></html>");
				pw.println("<a href=login.html>Login</a>");
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

}
