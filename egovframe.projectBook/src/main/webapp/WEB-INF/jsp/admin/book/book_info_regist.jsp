<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--도서등록페이지  -->
<div class="body">
	<h1> 도서 등록 </h1>
	<form method="post">
		<p> 제목 : <input type="text" name="BOOK_NM"/></p>
		<p> 상세설명 : <input type="text" name="BOOK_DTL_EXPLN"/></p>
		<p> 출판사 : <input type="text" name="PUBLIS_NM"/></p>
		<p> 도서수량 : <input type="number" name="BOOK_NO"/></p>
		<p> 저자 : <input type="text" name="AUT_NM"/></p>
		<p> 도서대출가능코드 : <input type="text" name="BOOK_LOAN_PSBLTY_CD"/></p>
		<p> <button>저장</button></p>
	</form>


</div>