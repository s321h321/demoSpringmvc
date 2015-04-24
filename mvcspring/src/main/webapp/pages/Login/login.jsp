<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/pages/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript"></script>
<head>
<title>Login Pages</title>
<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/login/login.js"></script>
</head>
<body>

	<form
		action="${pageContext.request.contextPath}/loginController/login.html"
		method="post">
		<table align="center">
			<tr align="center">
				<td>用户名:</td>
				<td><input type="text" name="username" value="" /></td>
			</tr>
			<tr>
				<td>密&emsp;码:</td>
				<td><input type="password" name="password"
					onpaste="return false" /></td>
			</tr>
			<tr>
				<td>验证码:</td>
				<td><input type="text" name="vcodetxt" maxlength="6"
					style="width: 60px;" /> &emsp; <a href="#" id="vcodeurl"> <img
						id="vcode" border="0" height="20px" 
						src="${pageContext.request.contextPath}/pages/Login/image.jsp" /></a>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					name="login" value="登   录" class="btn" /></td>
			</tr>
		</table>
	</form>

</body>
</html>