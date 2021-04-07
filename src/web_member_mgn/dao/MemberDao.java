package web_member_mgn.dao;

import java.util.List;

import web_member_mgn.dto.Member;

public interface MemberDao {
	Member selectMemberById(Member member);
	Member selectMemberByIdforAdmin(Member member);
	int insultMember(Member member);
	int deleteMember(String id);
	int updateMember(Member member);
	List<Member> selectMemberbyAll();
}
