package web_member_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_member_mgn.dto.Member;
import web_member_mgn.service.MemberService;

@WebServlet("/joinProcess")
public class JoinProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service;
     
    public JoinProcess() {
    	service = new MemberService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id").trim();
		String password = request.getParameter("password").trim();
		String name = request.getParameter("name").trim();
		int age = Integer.parseInt(request.getParameter("age").trim());
		String gender = request.getParameter("gender").trim();
		String email = request.getParameter("email").trim();

		Member member = new Member(id, password, name, age, gender, email);
		System.out.println(member);
		service.joinMember(member);
		
		if(request.getSession().getAttribute("id")!=null) {
			if(request.getSession().getAttribute("id").equals("admin")) {
				request.getRequestDispatcher("MemberlistLoad").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("joinComplete.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
