package web_member_mgn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web_member_mgn.dto.Member;
import web_member_mgn.service.MemberService;

@WebServlet("/MemberlistLoad")
public class MemberlistLoad extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService service;

    public MemberlistLoad() {
        service = new MemberService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		if((id!=null)&&(id.equals("admin"))) {
			List<Member> list = service.showMembers();
			list.stream().forEach(System.out::println);
			
			request.setAttribute("list", list);
			request.getRequestDispatcher("member_list.jsp").forward(request, response);
		}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
