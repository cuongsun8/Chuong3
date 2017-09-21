package Hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addnumber
 */
@WebServlet("/Add")
public class addnumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addnumber() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		if(a==null||a.trim().length()==0 ||b==null|| b.trim().length()==0)
		{
			response.sendRedirect("AddForm.html");
			return;
		}
	
	int sum = Integer.parseInt(a)+Integer.parseInt(b);
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.print("<html><head><title>Add</title></head><body>");
	out.print("<p> the sum of "+a+" and "+b+" is "+sum +".</p>");
	out.println("</body></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
