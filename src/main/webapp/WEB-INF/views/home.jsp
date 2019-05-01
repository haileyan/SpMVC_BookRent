<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>ABC RENTAL SHOP</title>

<link href="${rootPath}/css/list.css?ver=3" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
<%@ include file="/css/home.css"%>
</style>
<script>
$(function(){
	var preScroll = $(window).scrollTop() 		// 현재 윈도우의 전체 높이를 갖는 값
	$(window).scroll(function(){ 				// 현재 화면에 스크롤이 발생하면
		
		let currScroll = $(window).scrollTop()
		if(preScroll > currScroll){
			$("#main-nav").css("top", "0");
		} else {
			$("#main-nav").css("top", "-60px")			
		}
		preScroll = currScroll
	})
})
</script>
</head>
<body>
<nav id="main-nav">
	<a href="#">ABC RENTAL</a>
	<a href="#">로그인</a>
	<a href="${rootPath}/admin/">관리자</a>
</nav>

<section id="main-container">
<div class="main-info">
	<article id="user" class="body-box"><p style="text-align:center;font-size:15pt;">회원정보
		<%@ include file="/WEB-INF/views/rent_body/user/user_body.jspf" %>
	</article>
	<article id="rent" class="body-box"><p style="text-align:center;font-size:15pt;text-decoration: underline;text-shadow:0 0 2px #0040FF;">대여정보
		<%@ include file="/WEB-INF/views/rent_body/rent/rent_body.jspf" %>
	</article>
	<article id="book" class="body-box"><p style="text-align:center;font-size:15pt;">도서정보
		<%@ include file="/WEB-INF/views/rent_body/book/book_body.jspf" %>
	</article>
</div>

<br/>	
<div class="promo-slide">
<img src="images/1.jpg" style="width:100%;height:450px;">
</div>

<br/>
<hr/>
<br/>
<br/>
<div class="counter">
<div class="counter-first">
<p style="font-size:30pt;font-weight:bold;text-align:center;color:white;text-shadow:0 0 3px #000000;">ABC RENTAL IS...</p>
</div>

<div class="counter-second">
<div class="colum">
<div class="card">
<p><img src="https://img.icons8.com/ultraviolet/70/000000/literature.png"></p>
<p>1000+
<p>Books
</div>
</div>

<div class="colum">
<div class="card">
<p><img src="https://img.icons8.com/ultraviolet/70/000000/reading.png"></p>
<p>500+
<p>Customers
</div>
</div>

<div class="colum">
<div class="card">
<p><img src="https://img.icons8.com/ultraviolet/70/000000/handshake.png"></p>
<p>20+
<p>Partners
</div>
</div>

<div class="colum">
<div class="card">
<p><img src="https://img.icons8.com/ultraviolet/70/000000/ferris-wheel.png"></p>
<p>100+
<p>Events
</div>
</div>

</div>
</div>

<br/>
<br/>
<hr/>
<br/>

<div class="main_image" >
<a href="http://magazine-b.com/en/tsutaya/"><img src="images/main_image01.jpg" style="width:100%;height:98%;"></a>
</div>

<div class="contact">
<div class="column-1">
<p style="font-size:20pt;text-decoration:underline;">Contact Us</p>

<p style="font-size:15pt;">We're always welcome your attention!</p>
<p><img src="https://img.icons8.com/ultraviolet/30/000000/marker.png">&nbsp; Gwangju, South Korea
<p><img src="https://img.icons8.com/ultraviolet/30/000000/phone.png">&nbsp; +82 123-4567
<p><img src="https://img.icons8.com/ultraviolet/30/000000/secured-letter.png">&nbsp; cocojey02@gmail.com
</div>

<div class="column-2">
<form class="feedback-form" action="" autocomplete="off">

<label for="form-name">Name &nbsp; &nbsp;</label>
<input class="form-name" type="text" name="name" style="width:85%;" required><br/>

<label for="form-email">Email &nbsp; &nbsp;</label>
<input class="form-email" type="text" name="email" style="width:85%;" required><br/>

<label for="form-name">Message</label>
<input class="form-message" type="text" name="message" style="width:85%;" required><br/>
<br/>
<input class="form-check" type="checkbox" name="Like">
<label for="form-check" style="margin-top:10px;">It's an useful web:)</label>
<img src="https://img.icons8.com/color/48/000000/filled-sent.png" id="sending">
</form>
</div>
</div>

<div class="sns">
<p style="font-size:30pt;font-weight:bold;text-align:center;color:white;text-shadow:0 0 3px #000000;">FIND MORE!<br/>
<a href=""><img src="https://img.icons8.com/office/40/000000/facebook.png"></a>
<a href=""><img src="https://img.icons8.com/office/40/000000/twitter.png"></a>
<a href=""><img src="https://img.icons8.com/ultraviolet/40/000000/instagram-new.png"></a>
<a href=""><img src="https://img.icons8.com/ultraviolet/40/000000/google-plus.png"></a>
</div>
</section>	

</body>
</html>