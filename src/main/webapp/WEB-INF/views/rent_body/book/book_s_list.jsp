<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<style>
	.b_select {
		cursor:pointer;
	}
	
	th{
		text-align:center;
		color: #0404B4;
	}
	
	td {
		text-align:center;
	}
	
	.book-tr {
		border-bottom: 2px dashed #A9BCF5;
	}

</style>
<script>
$(function(){
	$(".b_select").on("click", function(){
		let seq = $(this).attr("data-seq")
		let title = $(this).text()
		let price = $(this).attr("data-price")
		
		$("#rent_book_seq").val(seq)
		$("#book_title").text(title)
		$("#rent_book_price").val(price)
	})
})	
</script>  
<table>
<tr><th>도서명</th><th>저자</th></tr>
<tr style="border-bottom:2px dashed #A9BCF5;"><th>가격</th><th>대여</th></tr>
<c:choose>
	<c:when test="${empty BOOKS}">
		<tr><td colspan="2">도서목록이 없습니다</td></tr>
	</c:when>
	<c:otherwise>
		<c:forEach var="book" items="${BOOKS}">
			<tr>
				<td class="b_select" data-seq="${book.book_seq}"
					data-price="${book.book_price}">${book.book_title}</td>
				<td>${book.book_author}</td>
			</tr>
			<tr class="book-tr">
				<td>${book.book_price}</td>
				<td>
					<c:if test="${book.book_rent_yn == 'Y'}">대여가능</c:if>
					<c:if test="${book.book_rent_yn == 'N'}">대여불가</c:if>
				</td>	
			</tr>
		</c:forEach>
	</c:otherwise>
</c:choose>
</table>