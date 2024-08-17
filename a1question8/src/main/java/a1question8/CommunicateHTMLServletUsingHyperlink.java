package a1question8;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class CommunicateHTMLServletUsingHyperlink extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		 String action = req.getParameter("action");
	        
	        res.setContentType("text/html");
	        res.getWriter().println("<html><body>");
	        
	        if ("hello".equals(action)) {
	        	res.getWriter().println("<html><body bgcolor='blue'>");
	            res.getWriter().println("<h1 style=color:red >Hello ! How are you doing?</h1>");
	            res.getWriter().println("</body></html>");
	            
	        } else if ("greet".equals(action)) {
	        	res.getWriter().println("<html><body bgcolor='yellow'>");
	            res.getWriter().println("<h1 style=color:blue> Goodmorning! Have a nice day .</h1>");
	            res.getWriter().println("</body></html>");
	        }
	        else if("wonderful".equals(action)) {
	        	res.getWriter().println("<html><body bgcolor='aqua'>");
	        	 res.getWriter().println("<h1 style=color:green>The view of mountains and rivers is wonderful</h1>");
	        	 res.getWriter().println("</body></html>");
	        }
	        
	        
	        res.getWriter().println("</body></html>");
		
	}

}
