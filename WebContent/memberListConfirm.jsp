<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<style>
	table {
		margin: auto;
		width: 400px;
		border: 1px solid gray;
		text-align: center;
	}
	
	.td_title {
		font-weight: blod;
		font-size: x-large;
	}
</style>
</head>
<body>
<form name="memberupdate" action="MemberUpdateServlet" method="get">
	<table border=1>
		<tr>
			<td><label for="id">아이디 : </label></td>
			<td><input type="text" name="id" id="id" value='${member.id}' readonly /></td>
		</tr>
		<tr>
			<td><label for="name">이름 : </label></td>
			<td><input type="text" name="name" id="name" value='${member.name}' /></td>
		</tr>
		<tr>
			<td><label for="age">나이 : </label></td>
			<td><input type="text" name="age" id="age" value='${member.age}' /></td>
		</tr>
		<tr>
			<td><label for="gender1">성별 : </label></td>
			<td>
				<c:choose>
					<c:when test ="${member.gender eq '남자'}">
						<input type="radio" name="gender" value="남자" checked id="gender1" />남자
						<input type="radio" name="gender" value="여자" id="gender2" />여자
					</c:when>
					<c:when test = "${member.gender eq '여자'}">
						<input type="radio" name="gender" value="남자" id="gender1" />남자
						<input type="radio" name="gender" value="여자" checked id="gender2" />여자
					</c:when>
				</c:choose>
			</td>
		</tr>
		<tr>
			<td><label for="email">이메일 주소 : </label></td>
			<td><input type="text" name="email" id="email" value='${member.email}' /></td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="javascript:memberupdate.submit()">수정하기</a>&nbsp;&nbsp;
				<a href="MemberDeleteServlet?id=${member.id}">탈퇴 시키기</a>&nbsp;&nbsp;
				<a href="MemberlistLoad">목록으로</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>