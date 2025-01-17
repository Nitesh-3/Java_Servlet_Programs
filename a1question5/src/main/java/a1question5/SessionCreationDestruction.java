package a1question5;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTrackingServlet")
public class SessionCreationDestruction extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);
        String visitStatus;

        if (session.isNew()) {
            visitStatus = "This is your first visit to this page.";
        } else {
            visitStatus = "You have already visited this page earlier.";
        }

        out.println("<h1>Session Tracking</h1>");
        out.println("<h2>" + visitStatus + "</h2>");

        out.close();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
