<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공감도서 로그인</title>
</head>
<body>
<form role="form" method="post" 
        style="width:300px; margin:50px auto;">
            <div class="form-group">
                <label for="">아이디</label>
                <input type="text" class="form-control"  placeholder="아이디를 입력하세요" id="" name="MBR_ID">
            </div>
            <div class="form-group">
                <label for="">비밀번호</label>
                <input type="password" class="form-control"  placeholder="비밀번호를 입력하세요" id="" name="MBR_PSWD">
            </div> 

            <button type="button" class="btn" onclick="location.href='/login.do'">로그인</button>
            <button type="button" class="btn" onclick="location.href='/member/create.do'">회원가입</button>
            <div class="forgot-password">
                <a href="#">아이디/비밀번호 찾기</a>
            </div>
             <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}">
        </form>

</body>
</html>