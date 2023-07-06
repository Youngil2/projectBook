<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--도서목록조회  -->
<div class="body">
<p><a href="/create">도서등록</a></p>
<h1>도서목록</h1>
<table>
	<tr>
		<th>제목</th> <th>카테고리</th> 
	</tr>
	<c:forEach var="row" items="${list }">
	<tr>
		<td>
			<a href="/detail?bookid=${row.book_id }">${row.title }</a>
		</td>
		<td>${row.category }</td>
		<td>
		
		</td>
	</tr>
	</c:forEach>
</table>
[출처] Spring(book) 최종본|작성자 html java공부방


</div>