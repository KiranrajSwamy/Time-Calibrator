<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String password=(String)session.getAttribute("password");
session.invalidate();

%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Password</title>
</head>
<script type="text/javascript">
	window.history.forward();
	function noBack()
	{
		window.history.forward();

	}
</script>

<body onLoad="noBack();" onpageshow="if(event.persited) noBack();" onUnload="">

<center>
<table>
<tr><td>Your Password is :<%=password %>

<tr>
	<td><a href="login.jsp">Login</a></td>
	</tr>
<tr>

</table>
</center>
</form>
</body>
</html>