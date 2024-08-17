package a1question7;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/datetime")
public class CurrentDateTime extends HttpServlet{
	 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		    //res.setIntHeader("refresh");
		    res.setContentType("text/html");
		    PrintWriter out=res.getWriter();
		    java.util.Date date=new java.util.Date();
		    out.println("<html><body bgcolor='black'>");
		    out.println("<h1 style='color:red;text-align:center'>"+date+"</h1>");  
		    
		    out.println("</body></html>");
	  }

}
