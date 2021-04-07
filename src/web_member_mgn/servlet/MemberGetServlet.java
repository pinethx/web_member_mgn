package web_member_mgn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web_member_mgn.dto.Member;
import web_member_mgn.service.MemberService;

@WebServlet("/MemberGetServlet")
public class MemberGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service;

    public MemberGetServlet() {
    	service = new MemberService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
    	String id = request.getParameter("id").trim();
    	Member member = service.confirmMember(new Member(id));
    	System.out.println(member);
    	request.setAttribute("member", member);
    	
    	request.getRequestDispatcher("memberListConfirm.jsp").forward(request, response);
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
