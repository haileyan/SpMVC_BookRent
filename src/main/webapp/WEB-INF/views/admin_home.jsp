<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>        
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>ABC RENTAL SHOP(Admin)</title>
<link href="${rootPath}/css/list.css?ver=1" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- jQuery를 이용해서 만든 3rd Party Library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-contextmenu/2.7.1/jquery.contextMenu.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-contextmenu/2.7.1/jquery.contextMenu.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-contextmenu/2.7.1/jquery.ui.position.js"></script>
<style>
body,html {
	height:100%;
}

section {
	display:flex;
	flex-flow:column;
	hight:100%;
}

#main-title {
	height: 70px;
	background-color:blue;
	color:white;
	text-align:center;
}

article {
	flex: 1;
}

#admin-body{
	display:flex;
}

#admin-body li {
	list-style:none;
	margin:0;
}

#admin-body aside {
	width:250px;
	background-color: #5882FA;
	color:white;
	padding:0;
	text-align:center;
}

#admin-body ul {
	width:250px;
	padding:0px;
}

#admin-body a {
	color:white;
	text-decoration:none;
	display:block;
	padding: 5% 5%;
	font-size:15px;
}

#admin-body a:hover {
	background-color: #ddd;
	color:black;
}

</style>
</head>
<body>
<section>
<article id="main-title">
		<h3>ABC RENTAL SHOP(Admin Page)</h3>
</article>		
	<article id="admin-body">
		<aside>
			<ul>
				<li><a href="${rootPath}/">판매관리</a></li>
				<li><a href="${rootPath}/admin/user">회원관리</a></li>
				<li><a href="${rootPath}/admin/book">도서관리</a></li>
				<li><a href="">대여관리</a></li>
			</ul>
		</aside>
		<article>
			<c:choose>
				<c:when test="${ fn:startsWith(BODY, 'USER')}">
					<p style="text-align:center;font-weight:bold;color:#FE2E64;font-size:15pt;">▶ 회원정보 관리 ◀</p>
					<div>
					<%@ include file="/WEB-INF/views/admin_body/admin_user_write.jspf" %>
					</div>
					<h3></h3>
					<div>
					<%@ include file="/WEB-INF/views/admin_body/admin_user_list.jspf" %>
					</div>
				</c:when>
				<c:when test="${BODY =='BOOK_LIST'}">
					<p style="font-weight=bold;color:purple;">도서정보 관리</p>
					<div>
					<%@ include file="/WEB-INF/views/admin_body/admin_book_write.jspf" %>
					</div>
					<div>
					<%@ include file="/WEB-INF/views/admin_body/admin_book_list.jspf" %>
					</div>				
				</c:when>
			<c:otherwise>
				<h3>COMING SOON....</h3>
			</c:otherwise>
			</c:choose>
		</article>
	</article>	
</section>
</body>
</html>