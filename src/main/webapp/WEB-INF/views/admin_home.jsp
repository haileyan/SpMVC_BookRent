<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
</head>

<style>
<%@ include file="/css/admin_home.css"%>
</style>

<body>
<section>
<article id="admin-title">
		<h3 id="title-text">ABC RENTAL SHOP(Admin Page)</h3>
</article>		
	<article id="admin-body">
		<aside>
			<ul>
				<li><a href="${rootPath}/">도서대여</a></li>
				<li><a href="${rootPath}/admin/user">회원관리</a></li>
				<li><a href="${rootPath}/admin/book">도서관리</a></li>
				<li><a href="">대여관리</a></li>
			</ul>
		</aside>
		<article>
			<c:choose>
				<c:when test="${ fn:startsWith(BODY, 'USER')}">
					<c:if test="${BODY=='USER_LIST'}" >
					<p style="text-align:center;color:white;font-size:15pt;text-decoration:underline;text-shadow:0 0 2px #000000;">회원정보 관리</p>
						<div class="user_write">
							<%@ include file="/WEB-INF/views/admin_body/admin_user_write.jspf" %>
						</div>
						<div>
							<%@ include file="/WEB-INF/views/admin_body/admin_user_list.jspf" %>
						</div>
					</c:if>
				</c:when>
				<c:when test="${BODY =='BOOK_LIST'}">
					<p style="text-align:center;color:white;font-size:15pt;text-decoration:underline;text-shadow:0 0 2px #000000;">도서정보 관리</p>
						<div class="book_write">
							<%@ include file="/WEB-INF/views/admin_body/admin_book_write.jspf" %>
						</div>
						<div>
							<%@ include file="/WEB-INF/views/admin_body/admin_book_list.jspf" %>
						</div>				
				</c:when>
			<c:otherwise>
				<h3>&nbsp; 메뉴를 선택하세요</h3>
			</c:otherwise>
			</c:choose>
		</article>
	</article>	
</section>
</body>
</html>