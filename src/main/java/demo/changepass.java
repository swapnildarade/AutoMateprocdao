package demo;

import javax.servlet.http.*;
import java.io.*;

public class changepass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        String pass = req.getParameter("passwordEntered");
        if (!Login.isLoggedIn){
            out.println("login first");
        }
        else if (pass.equals("")){
            out.println("enter password");
        }
        else if (Login.isLoggedIn && !pass.equals("")){
            Login.password = pass;
            out.println("changed");
        }
        else {
            out.println(" wrong");
        }
        out.close();
    }
}