<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="DB.DB"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
int uid=(Integer)session.getAttribute("uid");
DB Db=(DB)session.getAttribute("DB");
Db.loadDriver();
Db.getConnection();
%>



<html>
<script type="text/javascript">
	window.history.forward();
	function noBack()
	{
		window.history.forward();

	}
</script>

<body onLoad="noBack();" onpageshow="if(event.persited) noBack();" onUnload="">

<link href="style1.css" rel="stylesheet" type="text/css" />
<center>
 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><font size="6.5">Important</font></b></p>
    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><font size="4">YES
    &nbsp; &nbsp; &nbsp;&nbsp;
    &nbsp; &nbsp;&nbsp; &nbsp;
    &nbsp;&nbsp; &nbsp; &nbsp;
    &nbsp; &nbsp; &nbsp;&nbsp; 
    &nbsp;&nbsp;&nbsp; &nbsp;
    NO</font></b></p>
<div class="text-box">
 <div class="headline">
 				<h1>Urgent</h1>
                <h3>NO&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; YES</h3>
                </div>
       
    <div class="Row">
        <div class="Cell1">
           <%-- <p>Row 1 Column 1</p>--%>        
<table bgcolor = "red">
<tr> <td align="center"><font color="black" size="3"></font></td></tr>
<tr><th>Task Name</th></tr>
<tr>
<%
try
{
	ResultSet rs1=Db.select("select Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'important-urgent' and Uid="+uid);
	System.out.println("In 1st Result Set");
	while(rs1.next())
	{
		%>
		<tr>
			<td><font size = 4.5 color = "black"><%=rs1.getString("Tname")%></font></td>
		</tr>	
	<%
	}
	rs1.close();
			
}catch(Exception e)
{
	System.out.println("exception in 1st try:"+e);
}
%>
	</table>
        </div>
        <div class="Cell2">
         <%--  <p>Row 1 Column 2</p>--%>
<table bgcolor = "green">
<tr> <td align="center"><font color="black" size="3"></font></td></tr>
<tr><th>Task Name</th></tr>
<tr>
<%
try
{
	ResultSet rs2=Db.select("select Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'not important-urgent' and Uid="+uid);
	System.out.println("In 2nd Result Set");
	while(rs2.next())
	{
		%>
		<tr>
			<td><font size = 4.5 color = "black"><%=rs2.getString("Tname")%></font></td>
		</tr>		
	<%
	}
			
}catch(Exception e)
{
	System.out.println("exception in "+e);
}
%>

	
			</table>
        </div>
    </div>
    <div class="Row">
        <div class="Cell3">
            <%-- <p>Row 2 Column 1</p>--%>
<table bgcolor = "orange">
<tr> <td align="center"><font color="black" size="3"></font></td></tr>
<tr><th>Task Name</th></tr>
<tr>
<%
try
{
	ResultSet rs3=Db.select("select Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'important-not urgent' and Uid="+uid);
	System.out.println("In 3rd Result Set");
	while(rs3.next())
	{
		%>
		<tr>
			<td><font size = 4.5 color = "black"><%=rs3.getString("Tname")%></font></td>
		
		</tr>		
	<%
	}
			
}catch(Exception e)
{
	System.out.println("exception in "+e);
}
%>


	</table>
            
        </div>
        <div class="Cell4">
 		<%-- <p>Row 2 Column 2</p> --%>
<table bgcolor = "pink">
<tr> <td align="center"><font color="black" size="3"></font></td></tr>
<tr><th>Task Name</th></tr>
<tr>
<%
try
{
	ResultSet rs4=Db.select("select Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'not important-not urgent' and Uid="+uid);
	System.out.println("In 4th Result Set");
	while(rs4.next())
	{
		%>
		<tr>
			<td><font size = 4.5 color = "black"><%=rs4.getString("Tname")%></font></td>
			
		</tr>		
	<%
	}
			
}catch(Exception e)
{
	System.out.println("exception in "+e);
}

%>



	</table>
 		
        </div>
    </div>
</div>
</div>
</center>
</html>