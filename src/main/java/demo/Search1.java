package demo;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class Search1 extends HttpServlet {

	    @Override
	    public void service (HttpServletRequest req, HttpServletResponse resp) throws IOException {
	        Search1.date = req.getParameter("date");
	        Search2.source = req.getParameter("source");
	        Search2.destination = req.getParameter("destination");
	        Search2.persons = Integer.parseInt(req.getParameter("persons"));

	        if (Search.date.equals("")) {
	            PrintWriter out = resp.getWriter();
	            out.println("enter valid date");
	        }
	        else {
	            Search.day = getDay(Search.date);
	            resp.sendRedirect("/search-results.jsp");
	        }
	    }

	    public String getDay(String dateInp) {
	        LocalDate dt = LocalDate.parse(dateInp);
	        return dt.getDayOfWeek().toString();
	    }
	}
}
