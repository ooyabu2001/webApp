<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="info.searchman.*"%>
070040のソース


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員更新画面</title>
<style>
.form-input {
	width: 100%;
}

.form-table td {
	padding: 5px;
}

.form-table label {
	text-align: right;
}

.form-button {
	margin-top: 10px;
}
</style>
</head>



<%-- shainBeanから社員情報を取得する --%>
<%
ShainBean shainBean = (ShainBean)request.getAttribute("shainBean");
%>
<body>
	<h1>社員更新画面</h1>
	<form action="ShainInsertComplete" method="post">
		<table class="form-table">
			<tr>
				<td><label for="id">ID:</label></td>
				<td>
				<%= shainBean.getId() %>
				</td>
			</tr>
			<tr>
				<td><label for="name">名前:</label></td>
				<td><%= shainBean.getName() %></td>
			</tr>
			<tr>
				<td><label for="sei">姓:</label></td>
				<td><select id="sei" name="sei" class="form-input" required>
						<option value="">選択してください</option>
						<option value="男">男</option>
						<option value="女">女</option>
				</select></td>
			</tr>
			<tr>
				<td><label for="nen">年:</label></td>
				<td><select id="nen" name="nen" class="form-input" required>
						<option value="">選択してください</option>
						<%
						for (int year = 2001; year <= 2024; year++) {
						%>
						<option value="<%=year%>"><%=year%></option>
						<%
}
%>
				</select></td>
			</tr>
			<tr>
				<td><label for="address">住所:</label></td>
				<td><input type="text" id="address" name="address"
					class="form-input" required></td>
			</tr>
		</table>
		<button type="submit" class="form-button">更新</button>
	</form>
</body>
</html>


powerd by SearchMan
