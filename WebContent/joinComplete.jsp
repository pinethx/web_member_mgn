<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료</title>
</head>
<body>
	<h3>${sessionScope.member.id}님 회원가입이 완료되었습니다.</h3>
	<a href="loginForm.jsp">로그인 하러가기</a><br>
</body>
</html>