<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script type="text/javascript" src="/resources/js/reply.js"></script>
    
</head>
<body>
<form action="" method="post">
<table border="1">
<tr>
<td>작성자</td>
<td><input type="text" name="id" value="${detail.id}" readonly>
<input type="hidden" name="bno" value="${detail.bno}">
</td>
</tr>
<tr>
<td>제목</td>
<td><input type="text" name="title" value="${detail.title}"></td>
</tr>
<tr>
<td>내용</td><td><textarea rows="30" cols="50" name="content">${detail.content}</textarea></td>
</tr>
<tr>
<td><input type="button" value="목록보기" onclick="location.href='http://localhost:8080/board'"></td>
<td>
<c:if test="${sessionScope.login.id ne null && detail.id eq sessionScope.login.id}">
<input type="submit" value="수정하기" formaction="boardmodify">
<input type="submit" value="삭제하기" formaction="boardremove">
</c:if>
</td>
</tr>
</table>
</form>
<c:if test="${sessionScope.login.id ne null}">
<div>
댓글<input type="hidden" id="id" value="${sessionScope.login.id}">
</div>
<div>

<textarea rows="5" cols="50" id="reply">
</textarea>
</div>
<div>
<input type="button" value="댓글쓰기" id="add">
</div>
</c:if>


<div id="chat">
		<ul id="replyUL">
		</ul>
	</div>


</body>
</html>