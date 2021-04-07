package web_member_mgn.dao.impl;

import java.sql.Connection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import web_member_mgn.dto.Member;
import web_member_mgn.util.JdbcUtil;

public class MemberDaoImplTest {
	private static Connection con;
	private MemberDaoImpl dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// MemberdaoTest.java가 수행되기 전 호출
		con = JdbcUtil.getConnection();
	}

	@Before
	public void setUp() throws Exception {
		// Test method가 호출되기 전 호출
		dao = MemberDaoImpl.getInstance();
		dao.setCon(con);
	}

	@After
	public void tearDown() throws Exception {
		// Test method 호출된 후 호출
		dao = null;
	}

	@Test
	public void testSelectMemberByIdSuccess() {
		System.out.println("testSelectMemberById() Test (Success)");
		Member member = new Member("1", "1111");
		Member memberLogin = dao.selectMemberById(member);
		System.out.println("memberLogin : " + memberLogin);
		
		Assert.assertNotNull(memberLogin);
	}
	
	@Test
	public void testSelectMemberByIdFail() {
		System.out.println("testSelectMemberById() Test (Fail)");
		Member member = new Member("1", "1112");
		Member memberLogin = dao.selectMemberById(member);
		
		Assert.assertNull(memberLogin);
	}
	
	@Test
	public void testInsertMember() {
		System.out.printf("%s()%n", "testInsertMember");	
		Member newMember = new Member("34", "1111", "이름", 20, "여자", "test01@test.co.kr");	//추가할 데이터가 담긴 객체 생성
		int res = dao.insultMember(newMember);	// 해당 객체를 매개변수로 넘겨서 데이터 추가하는 메소드를 호출(실행)하고 그 결과값을 받아서(성공하면 1, 실패하면 0) 변수에 저장
		Assert.assertEquals(1, res);		// 결과값이 1인지 비교한다. 1이면 성공, 0이면 실패
		System.out.println(dao.selectMemberById(newMember)); // 추가된 결과를 출력한다.		
	}
	
}
