package a1question1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Calculator extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		int i=Integer.parseInt(req.getParameter("a"));
		int j=Integer.parseInt(req.getParameter("b"));
		String q=(req.getParameter("c"));
		PrintWriter out=res.getWriter();
		switch(q.charAt(0)) {
		 case '+':
		       int k1=i+j;
		       out.println("Sum of numbers is : "+k1);
		       break;
		 case '-':
			 int m1=i-j;
			 out.println("Difference of numbers is "+m1);
			 break;
		 case '*':
			 int k2=i*j;
			 out.println("Product of numbers is " +k2);
			 break;
		 case '/':
			 double k4=i/j;
			 out.println("Division of numbers is:"+k4);
			 break;
			 
		 default:
			System.out.println("Invalid operator");
		}
	
		
		
	}
	

}
