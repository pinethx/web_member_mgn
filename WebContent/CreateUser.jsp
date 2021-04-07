<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 추가</title>
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
<form name="createUser" action="joinProcess" method="get">
	<table border=1>
		<tr>
			<td><label for="id">아이디 : </label></td>
			<td><input type="text" name="id" id="id" /></td>
		</tr>
		<tr>
			<td><label for="pass">비밀번호 : </label></td>
			<td><input type="password" name="password" id="password" /></td>
		</tr>
		<tr>
			<td><label for="name">이름 : </label></td>
			<td><input type="text" name="name" id="name" /></td>
		</tr>
		<tr>
			<td><label for="age">나이 : </label></td>
			<td><input type="text" name="age" id="age" /></td>
		</tr>
		<tr>
			<td><label for="gender1">성별 : </label></td>
			<td>
				<input type="radio" name="gender" value="남자" checked id="gender1" />남자
				<input type="radio" name="gender" value="여자" id="gender2" />여자
			</td>
		</tr>
		<tr>
			<td><label for="email">이메일 주소 : </label></td>
			<td><input type="text" name="email" id="email" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="javascript:createUser.submit()">회원추가</a>&nbsp;&nbsp;
				<a href="javascript:createUser.reset()">다시 작성</a>&nbsp;&nbsp;
				<a href="MemberlistLoad"><input type="button" value="취소"></a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>