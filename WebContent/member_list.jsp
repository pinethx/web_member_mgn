<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<style>
	table{
		margin : auto; width:400px; border:1px solid gray; text-align : center;
	}
	.td_title { font-weight: bold; font-size:x-large;}
</style>
</head>
<body>
	<table>
		<tr><td colspan=2 class="td_title">회원 목록</td></tr>
		<tr><td colspan=2> </td></tr>
		<c:forEach var="member" items="${list}">
			<tr><th scope="row">${member.id}</th>
				<td>
					<a href="MemberGetServlet?id=${member.id}"><button>확인</button></a>
					<a href="MemberDeleteServlet?id=${member.id}"><button>삭제</button></a>
		 		</td>
			</tr>
		</c:forEach>
		<tr><td colspan=2> </td></tr>
		<tr><td colspan=2>
			<a href="CreateUser.jsp">회원 추가</a>&nbsp;&nbsp;
			<a href="logoutProcess">로그 아웃</a>
		</td></tr>
	</table>
</body>
</html>