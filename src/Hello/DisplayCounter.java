package Hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayCounter")
public class DisplayCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DisplayCounter() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ServletContext servletContext = getServletContext();
			Integer counter = (Integer) servletContext.getAttribute("counter");
			
		
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html><head><title>Display Counter</title></head><body>");
			out.println("<h2> You are visitor #" +counter +".</h2>");
			out.println("</body></html>");
	}


}
