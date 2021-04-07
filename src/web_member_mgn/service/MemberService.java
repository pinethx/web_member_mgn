package web_member_mgn.service;

import java.util.List;

import web_member_mgn.dao.impl.MemberDaoImpl;
import web_member_mgn.ds.JndiDS;
import web_member_mgn.dto.Member;

public class MemberService {
	private MemberDaoImpl dao;

	public MemberService() {
		dao = MemberDaoImpl.getInstance();
		dao.setCon(JndiDS.getConnection());
	}
	
	public Member loginMember(Member member) {
		return dao.selectMemberById(member);
	}
	
	public Member confirmMember(Member member) {
		return dao.selectMemberByIdforAdmin(member);
	}
	
	public void joinMember(Member member) {
		dao.insultMember(member);
	}

	public List<Member> showMembers() {
		return dao.selectMemberbyAll();
	}
	
	public void upMember(Member member) {
		dao.updateMember(member);
	}
	
	public void removeMember (String id) {
		dao.deleteMember(id);
	}
}
