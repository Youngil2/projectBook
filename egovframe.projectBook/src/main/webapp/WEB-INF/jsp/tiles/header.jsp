<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div class="Header">
<c:if test="${sessionScope.admin=='n'}">
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">공감도서사이트</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">

        <li class="nav-item">
          <a class="nav-link" href="/member/booklist.do">도서보기</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/member/mypage.do">마이페이지</a>
        </li>
		[<span><%=(String)session.getAttribute("mbr_id") %></span>]님 환영합니다.
    </div>
  </div>
</nav>
</c:if>


<c:if test="${sessionScope.admin=='y'}">
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">공감도서관리프로그램</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">

        <li class="nav-item">
          <a class="nav-link" href="/admin/findAllBookInfo.do">도서관리</a>
        </li>
		<li class="nav-item">
          <a class="nav-link" href="/admin/bookloan.do">대여관리</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/admin/memberlist.do">회원리스트</a>
        </li>
[<span><%=(String)session.getAttribute("mbr_id") %></span>]페이지
    </div>
  </div>
</nav></div>
</c:if>





</div>