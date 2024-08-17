package a1question9;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/Refresh")
public class RefreshPage extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		
		  res.setIntHeader("refresh", 10);
	      res.setContentType("text/html");
	      PrintWriter out=res.getWriter();
		    java.util.Date date=new java.util.Date();
		    out.println("<html><body bgcolor='black'>");
		    out.println("<h1 style='color:blue;text-align:center'>"+date+"</h1>");  
		    
		    out.println("</body></html>");
		}   
	}
