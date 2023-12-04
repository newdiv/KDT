<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 페이지 입니다.(member폴더를 생성 안함.)</h1>
<a href="/">메인으로 이동</a>

<form action="member" method="post">
<table border="1">

<tr>
<td>아이디</td><td><input type="text" name="id"></td>
</tr>
<tr>
<td>비밀번호</td><td><input type="password" name="pw"></td>
</tr>
<tr>
<td>이름</td><td><input type="text" name="name"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="회원가입">
<a href="memberlist">회원목록리스트(관리자)</a>
</td>
</tr>
</table>



</form>
</body>
</html>