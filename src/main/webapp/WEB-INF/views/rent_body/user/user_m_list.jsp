<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
	.u_select {
		cursor:pointer;
	}
	
	th, td {
		text-align:center;	
	}
	
	
</style>
<script>
$(function(){
	$(".u_select").click(function(){
		let seq = $(this).attr("data-seq")
		let name = $(this).val()
		
		$("#user_name").text(name)
		$("#rent_user_seq").val(seq)
	})
})
</script>
<table>
<tr>
	<th>이름</th>
	<th>전화번호</th>
</tr>
<c:choose>
	<c:when test="${empty USERS}">
		<tr><td colspan="2">해당하는 사용자가 없습니다</td></tr>
	</c:when>
	<c:otherwise>
		<c:forEach var="users" items="${USERS}">
		<tr>
			<td class="u_select" data-seq="${users.user_seq}">${users.user_name}</td>		
			<td>${users.user_phone}</td>
		</tr>
		</c:forEach>
	</c:otherwise>
</c:choose>

</table>