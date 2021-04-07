package web_member_mgn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logoutProcess")
public class LogoutProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogoutProcess() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.invalidate();
		
		response.setHeader("Cache-Control","no-cache");
	    response.setHeader("Pragma","no-cache");
	    response.setDateHeader("Expires",0);
		
		response.sendRedirect("logout.jsp");
//		request.getRequestDispatcher("logout.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
