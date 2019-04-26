<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/> 
<style>
	#cart_item_delete {
		cursor : pointer;
	}
	
	#cart_title {
		text-align:center;
		font-size:15pt;
		text-decoration:underline;	
		text-shadow:0 0 2px #0040FF;
	}
	
	.cart_button {
		text-align:center;
		margin-top:10pt;
		margin-bottom:10pt;
	}
</style>
<script>
$(function(){
		$("#btn_cart_clear").click(function(){
			$.get("${rootPath}/rent/cart_clear", function(result){
				$("#cart_box").html(result)
			})
		})
		
		$(".cart_item_delete").click(function(){
			let seq = $(this).attr("data-seq")
			$.get("${rootPath}/rent/cart_seq_delete/" + seq, function(result){
				$("#cart_box").html(result)
			})
		})
	
		$("#btn_check_out").click(function(){
			$.get("${rootPath}/check_out", function(result){
				if(result == 'Check_out') {
					$("#cart_box").html("결제 해주셔서 감사합니다:)")
					alert("결제가 완료 되었습니다!!!!!")
				}
			})
	})
})
</script>    
<p id="cart_title">장바구니</p>

<table>
	<tr>
		<th>No</th>
		<th>도서명</th>
		<th>가격</th>
		<th></th>
	</tr>
	<c:choose>
		<c:when test="${empty CART}">
			<tr><td colspan="4">장바구니가 비었습니당!!!</td></tr>
		</c:when>
		<c:otherwise>
			<c:forEach var="item"  items="${CART}" varStatus="i">
				<tr>
					<td>${i.count}</td>
					<td class="b_title">${item.cart_book_title}</td>
					<td>${item.cart_book_price}</td>
					<th class="cart_item_delete" data-index="${i.count}" data-seq="${item.cart_seq}">x</th>				
				</tr>			
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>

<div class="cart_button">
	<span id="btn_check_out"><img src="https://img.icons8.com/ultraviolet/40/000000/cash-in-hand.png"></span>
	<span id="btn_cart_clear"><img src="https://img.icons8.com/ultraviolet/40/000000/clear-shopping-cart.png"></span>
</div>
