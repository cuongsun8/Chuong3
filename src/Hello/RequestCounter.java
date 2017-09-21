package Hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestCounter")
public class RequestCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public RequestCounter() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		int counter;
		counter=0;
		getServletContext().setAttribute("counter", counter);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get counter
		 ServletContext servletContext = getServletContext();
		Integer counter = (Integer) getServletContext().getAttribute("counter");
		//increment counter
		counter++;
		//set counter to application scope 
		getServletContext().setAttribute("counter", counter);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Request Counter</title></head><body>");
		out.println("<h2> The counter is incremented .</h2>");
		out.println("</body></html>");
		
	}

}
