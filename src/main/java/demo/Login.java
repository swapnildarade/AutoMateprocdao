package demo;

	import javax.servlet.http.*;
	import java.io.IOException;
	import java.io.PrintWriter;

	public class Login extends HttpServlet {
	    public static boolean isLoggedIn = false;
	    public static String username = "swapnil@gmail.com";
	    public static String password = "pass";

	    @Override
	    public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException {
	        PrintWriter out = resp.getWriter();

	        String email = req.getParameter("emailEntered");
	        String pass = req.getParameter("passwordEntered");

	        if (username.equals(Login.username) && pass.equals(Login.password)){
	            isLoggedIn = true;
	            out.println("You have LoggedIn");
	            resp.sendRedirect("/admin-dashboard.jsp");
	        }
	        else {
	            isLoggedIn = false;
	            out.println("Login Failed : Incorrect email or Password");
	        }
	        out.close();
	    }
	}

