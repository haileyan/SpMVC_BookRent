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
@import url(//fonts.googleapis.com/earlyaccess/jejuhallasan.css);
*{
	box-sizing:border-box;
	font-family: 'Jeju Hallasan', cursive;
}

body{
	display:flex;
	margin: 0 10px 0;
	padding-top:60px;
	background-image:url("https://images.unsplash.com/photo-1533756102515-155e3863ee1c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2134&q=80");
	background-repeat:none;
	background-position:center;
	background-size:inherit;
}

#main-nav{
	position:fixed;
	top:0;
	left:0;
	width:100%;
	padding: 0 0 auto;
	font-size:15pt;
	text-shadow:1px 1px black;
	
	display:flex;
	
	background-color: rgba(0,0,0,0.4);
	box-shadow: 5px 8px 8px rgba(88,88,88,0.8);
	
	border-radius: 5px;
	transition: top 0.3s ease-in-out;
}

#main-nav a {
	flex:0 1 auto;
	display: block;
	color:blue;
	
	text-align:center;
	font-size:15px;
	text-decoration:none;
	padding: 1rem;
}

#main-nav a:nth-child(1) {
	background-color:blue;
	font-weight: bold;
	font-style:italic;
	color:white;
}

#main-nav a:nth-child(2) {
	margin-left:auto;
}

#main-nav a:hover {
	background-color: #ddd;
	color:black;
}

#main-container {
	display:flex;
	flex-direction:column;	
	flex-wrap:nowrap;
	width:100%;
	padding: 15px 15px 2000px;
	border:2px dashed blue;
}

.body-box {
	box-shadow: 5px 8px 8px rgba(88,88,88,0.8);
	border-radius: 5px;
	flex: 1 1 auto;
	overflow:auto;
	margin: 16px 8px 16px 16px;
	padding:10px;
	background-color:rgba(255,255,255,0.6);
		
}

.main-info{
	display:flex;
	flex-direction:row;
}

 .promo-slide, .counter, .contact {
	width:100%;
	height:300px;
	display:flex;
	margin-bottom:50px;
}

.colum{
	width:25%;
	float:left;
	padding:0 5px;
}

@media screen and (max-width: 600px) {
  .column {
    width: 100%;
    display: block;
    margin-bottom: 10px;
  }
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  padding: 16px;
  text-align: center;
  background-color: #444;
  color: white;
}

.promo-slide {
	width:100%;
	height:300px;
}
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
	
<article class="promo-slide">
<img src="images/1.jpg" style="width:100%">
</article>

<article class="counter">
<div class="colum">
<div class="card">
<p><img src="https://img.icons8.com/ultraviolet/60/000000/groups.png"></p>
<p>100+
<p>Partners
</div>
</div>

<div class="colum">
<div class="card">
<p><img src="https://img.icons8.com/ultraviolet/60/000000/groups.png"></p>
<p>100+
<p>Partners
</div>
</div>

<div class="colum">
<div class="card">
<p><img src="https://img.icons8.com/ultraviolet/60/000000/groups.png"></p>
<p>100+
<p>Partners
</div>
</div>

<div class="colum">
<div class="card">
<p><img src="https://img.icons8.com/ultraviolet/60/000000/groups.png"></p>
<p>100+
<p>Partners
</div>
</div>
</article>

<article class="contact">
<div class="column-1">
<p style="font-size:20pt;text-decoration:underline;">Contact Us</p>

<p style="font-size:15pt;">We're always welcome your attention!</p><br/>
<p><img src="https://img.icons8.com/ultraviolet/30/000000/marker.png">&nbsp; Gwangju, South Korea
<p><img src="https://img.icons8.com/ultraviolet/30/000000/phone.png">&nbsp; +82 123-4567
<p><img src="https://img.icons8.com/ultraviolet/30/000000/secured-letter.png">&nbsp; cocojey02@gmail.com
</div>

<div class="column-2">
<form class="feedback-form" action="" autocomplete="off">

<label for="form-name">Name</label>
<input class="form-name" type="text" name="name" required><br/>

<label for="form-email">Email</label>
<input class="form-email" type="text" name="email" required><br/>

<label for="form-name">Message</label>
<input class="form-message" type="text" name="message" required><br/>

<label for="form-check">It's an useful web:)</label>
<input class="form-check" type="checkbox" name="Like">

<div class="btn_submit"><img src="https://img.icons8.com/color/48/000000/filled-sent.png"></div>
</form>
</div>
</article>	
</section>
</body>
</html>