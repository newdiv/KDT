<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${path}/resources/css/board.css" rel="stylesheet"/> 
</head>
<body>
<h1>나는 게시판이다.</h1>
${sessionScope.login.id}님 환영합니다.
<a href="/">메인으로 이동</a>
<table border="1">
<tr>
<td>no.</td>
<td>제목</td>
<td>작성일</td>
<td>조회수</td>
<td>작성자</td>
</tr>
<c:forEach items="${boardlist}" var="boardlist">
<tr>
<td>${boardlist.bno}</td>
<td><a href="http://localhost:8080/board/detail?bno=${boardlist.bno}">${boardlist.title}</a></td>
<td>${boardlist.regdate}</td>
<td>${boardlist.cnt}</td>
<td>${boardlist.id}</td>
</tr>
</c:forEach>

</table><br>
<!-- prev(이전)이 true이면 이전버튼 활성화 -->
<c:if test="${pageMaker.prev}">
	<a href="/board?type=${pageMaker.cri.type}&keyword=${pageMaker.cri.keyword}&pageNum=${pageMaker.startPage-1}&amount=${pageMaker.cri.amount}">이전</a>
</c:if>

<!-- begin(1)이 end(10)될 동안 반복(1일 10일 될 동안 반복) -->
<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="num">
 	<a href="/board?type=${pageMaker.cri.type}&keyword=${pageMaker.cri.keyword}&pageNum=${num}&amount=${pageMaker.cri.amount}">${num}</a>
</c:forEach>

<!-- next(다음)이 true이면 다음버튼 활성화 -->
<c:if test="${pageMaker.next}">
	<a href="/board?type=${pageMaker.cri.type}&keyword=${pageMaker.cri.keyword}&pageNum=${pageMaker.endPage+1}&amount=${pageMaker.cri.amount}">다음</a>
</c:if>



<c:if test="${sessionScope.login.id ne null}">
<input type="button" value="글쓰기" onclick="location.href='http://localhost:8080/write'">
</c:if>



</body>
</html>