<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<% 
if(session.getAttribute("uid")!=null)
{
%>

<head>
<title>Time Calibrator |</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-titillium-250.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
<link href="style1.css" rel="stylesheet" type="text/css" />
<script>
function logout()
{
	alert("Logged out successfully");
	return true;
}
</script>

</head>
<style>
/* Configuration of menu width */
html body ul.sf-menu ul,html body ul.sf-menu ul li {
	width: 200px;
	z-index: 1;
}

html body ul.sf-menu ul ul {
	margin: 0 0 0 200px;
}

/* Framework for proper showing/hiding/positioning */
ul.sf-menu,ul.sf-menu * {
	margin: 0;
	padding: 0;
	background: #ddd;
}

ul.sf-menu {
	display: block;
	position: relative;
	width: 100%;
}

ul.sf-menu li {
	display: block;
	list-style: none;
	float: left;
	position: relative;
}

ul.sf-menu li:hover {
	visibility: inherit; /* fixes IE7 'sticky bug' */
}

ul.sf-menu a {
	display: block;
	position: relative;
}

ul.sf-menu ul {
	position: absolute;
	left: 0;
	width: 100px;
	top: auto;
	left: -999999px;
}

ul.sf-menu ul a {
	zoom: 1; /* IE6/7 fix */
}

ul.sf-menu ul li {
	float: left;
	/* Must always be floated otherwise there will be a rogue 1px margin-bottom in IE6/7 */
	width: 150px;
}

ul.sf-menu ul ul {
	top: 0;
	margin: 0 0 0 150px;
}

ul.sf-menu li:hover ul,ul.sf-menu li:focus ul,ul.sf-menu li.sf-hover ul,ul.sf-menu ul li:hover ul,ul.sf-menu ul li:focus ul,ul.sf-menu ul li.sf-hover ul,ul.sf-menu ul ul li:hover ul,ul.sf-menu ul ul li:focus ul,ul.sf-menu ul ul li.sf-hover ul,ul.sf-menu ul ul ul li:hover ul,ul.sf-menu ul ul ul li:focus ul,ul.sf-menu ul ul ul li.sf-hover ul
	{
	left: auto;
}

ul.sf-menu li:hover ul ul,ul.sf-menu li:focus ul ul,ul.sf-menu li.sf-hover ul ul,ul.sf-menu ul li:hover ul ul,ul.sf-menu ul li:focus ul ul,ul.sf-menu ul li.sf-hover ul ul,ul.sf-menu ul ul li:hover ul ul,ul.sf-menu ul ul li:focus ul ul,ul.sf-menu ul ul li.sf-hover ul ul,ul.sf-menu ul ul ul li:hover ul ul,ul.sf-menu ul ul ul li:focus ul ul,ul.sf-menu ul ul ul li.sf-hover ul ul
	{
	left: -999999px;
}

/* autoArrows CSS */
span.sf-arrow {
	width: 7px;
	height: 7px;
	position: absolute;
	top: 20px;
	right: 5px;
	display: block;
	background: url(../images/arrows-black.png) no-repeat 0 0;
	overflow: hidden;
	/* making sure IE6 doesn't overflow and expand the box */
	font-size: 1px;
}

ul ul span.sf-arrow {
	right: 5px;
	top: 20px;
	background-position: 0 100%;
}

/* Theming the menu */
ul#nav {
	float: left;
}

ul#nav ul {
	background: #ddd;
	margin-top: 5px;
	padding-bottom: 15px;
}

ul#nav li a {
	padding: 7px 25px 6px 25px;
	font: 150% 'Yanone Kaffeesatz', arial, sans-serif;
	text-shadow: 1px 1px #fff;
	text-decoration: none;
	color: #222;
}

ul#nav li a:hover,ul#nav li a:focus,ul#nav li.selected a,ul#nav li.selected a:hover,ul#nav li.selected a:focus
	{
	color: #B30303;
	text-shadow: none;
	margin-right: 2px;
}

ul#nav ul li a {
	color: #222;
}

ul#nav ul li a:hover {
	color: #B30303;
	margin-right: 2px;
}
</style>
<script type="text/javascript">
	window.history.forward();
	function noBack()
	{
		window.history.forward();

	}
</script>

<body onLoad="noBack();" onpageshow="if(event.persited) noBack();" onUnload="">
	<div class="main" >
		<div class="header">
			<div class="header_resize">
				<div class="logo">
					<h1>
						<a href="home.jsp">Time<span>Calibrator</span><small>&nbsp;&nbsp;&nbsp;	Welcome&nbsp;&nbsp;&nbsp;<%=(String)session.getAttribute("welcome")%></small> 
						
						
						
						</a>
					</h1>
				</div>
				<div class="clr"></div>
				<nav>
				<ul class="sf-menu" id="nav">
					<li class="selected"><a href="home.jsp">Home</a>
					</li>
					
					<li><a href="#">Task</a>
						<ul style="height: 70px; margin-top: -5px;">
							<li><a href="addtask.jsp">Add Task</a>
							</li>
							<li><a href="../DisplayTask">Show All Task</a>
							</li>
							<li><a href="../TodayEmail">Email Today Task</a>
							</li>
						</ul></li>
					
					
					<li><a href="#">Reminder</a>
						<ul style="height: 70px; margin-top: -5px;">
							<li><a href="../AddNewReminder">Add Reminder</a>
							</li>
							<li><a href="showremindertask.jsp">Show Reminder</a>
							</li>
						</ul></li>
					
					
					<li><a href="#">Contact</a>
						<ul style="height: 80px; margin-top: -5px;">
							<li><a href="addcontact.jsp">Add Contact</a>
							</li>
							<li><a href="showcontact.jsp">Show Contact</a>
							</li>
							<li><a href="searchcontact.jsp">Search Contact</a>
							</li>
							
						</ul></li>

						<li><a href="#">Report</a>
						<ul style="height: 300px; margin-top: -5px;">
							<li><a href="viewtaskrange.jsp">View All Task</a> 
							<a href="completetaskrange.jsp">Completed Task</a>
							 <a href="incompletetaskrange.jsp">Incomplete Task</a> 
							 <a href="completedpriorityrange.jsp">View Priority Wise Completed Task</a> 
							 <a href="incompletedpriortyrange.jsp">View Priority Wise InCompleted Task</a>
							 <a href="calendar.jsp">Display Particular day Task</a>
							  <a href="search.jsp">Search Task</a></li>
						</ul></li>
					
					
					<li class="selected"><a href="diarycalender.jsp"><font color="black">Diary</font></a>
					</li>


					<li class="selected"><a href="../Notification"><font color="red">Notification</font></a>
					</li>


					<li><a href="#">Setting</a>
						<ul style="height: 150px; margin-top: -5px;">
							<li><a href="editinfo.jsp">Edit Profile</a>
							</li>
							<li><a href="changepassword.jsp">Change password</a>
							</li>
							<li><a href="../DeactivateAccount" onclick="return confirm('Are you sure you want to delete this Task?');">Deactivate Account</a>
							</li>
							<li><a href="../DeleteAccount" onclick="return confirm('Are you sure you want to delete this Task?');">Delete Account</a>
							</li>
						</ul></li>

					
					<li class="selected"><a href="../Logout"><img src="images/logout.png" width="18" height="20"></a>
					</li>


				</ul>
				</nav>

				<div class="clr"></div>
				<div class="slider">
					<div id="coin-slider">
						<a href="#"><img src="images/slide1.jpg" width="920"
							height="320" alt="" />
						</a> <a href="#"><img src="images/slide2.jpg" width="920"
							height="320" alt="" />
						</a> <a href="#"><img src="images/slide3.jpg" width="920"
							height="320" alt="" />
						</a>
					</div>
					<div class="clr"></div>
				</div>
				<div class="clr"></div>
			</div>
		</div>
		<div class="content">
			<div class="content_resize" style="height:700px;">
				<%@ page language="java" contentType="text/html; charset=UTF-8"
					pageEncoding="UTF-8"%>
				<%@page import="java.sql.ResultSet"%>
				<%@page import="javax.swing.JOptionPane"%>
				<%@page import="java.util.Date"%>
				<%@page import="java.text.SimpleDateFormat"%>
				<%@page import="java.util.StringTokenizer" %>
				<%@ page import="DB.DB"%>
				
<%
int uid=(Integer)session.getAttribute("uid");
DB Db=(DB)session.getAttribute("DB");
Db.loadDriver();
Db.getConnection();
response.setIntHeader("Refresh",40);

String s1,s2,s3,s4,s5,s6,r_time,s_time;
Date d=new Date();
StringTokenizer st=new StringTokenizer(d.toString()," ");
s1=st.nextToken();
s2=st.nextToken();
s3=st.nextToken();
s4=st.nextToken();
s5=st.nextToken();
s6=st.nextToken();
//System.out.println("value of s4 "+s4);

String qry="select Rtime,Tname from Reminder,Task where Reminder.Tid=Task.Tid and datediff(sysdate(),Rdate)=0 and Task.uid="+uid;
//System.out.println(qry);
ResultSet rsRem = Db.select(qry);
//ResultSet rsRem=(ResultSet)session.getAttribute("RsRem");
while(rsRem.next())
{
	StringTokenizer st1=new StringTokenizer(rsRem.getString(1),":");
	r_time=st1.nextToken()+":"+st1.nextToken();
	System.out.println("Reminder time "+r_time);	
	
	StringTokenizer st2=new StringTokenizer(s4,":");
	s_time=st2.nextToken()+":"+st2.nextToken();
	System.out.println("System time "+s_time);
	
	if(r_time.equals(s_time))
	{	//JOptionPane.showMessageDialog(null,rsRem.getString(2));
	String name=(String)session.getAttribute("welcome");
	String msg="You Have Reminder:\\n\\n\""+rsRem.getString(2)+"\" \\n\\n Hurry Up "+name+"!!";
	
	out.println ("<html><head><script>alert('"+msg+"');</script></head></html>");
	}
	
}
	

%>


				<center style="margin-top:-30px;"><p>
				<font size=12 color="#D8AA46"><center><b></>Today Task</b>	</center></font></p>
					<div class="text-box">
					
						<div class="headline1">
							<h1>Important</h1>
							<h2>YES&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;NO</h2>
						</div>
					
						<div class="headline">
							<h1>Urgent</h1>
							<h2>NO&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; YES</h2>
						</div>

						<div class="Row">
							<div class="Cell1">
								<%-- <p>Row 1 Column 1</p>--%>
								<table bgcolor="red">
									<tr>
										<td align="center"><font color="black" size="3"></font>
										</td>
									</tr>
									<tr>
										<th><h2></>Task Name</h2></th>
									</tr>
									<tr>
									
<%
try
{
	ResultSet rs1=Db.select("select Tid,Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'important-urgent' and Tstatusdate='1909-09-09' and Uid="+uid+" order by Ttime");
	//System.out.println("In 1st Result Set");
	while(rs1.next())
	{
		%>
										<tr>
											<td><font size=3.5 color=white >-></font></h5><a href="../ViewTask?tid=<%=rs1.getString("Tid") %>"><font size=4.5 color="black"><%=rs1.getString("Tname")%></font></a>
											</td>
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
								<table bgcolor="#87CEEB">
									<tr>
										<td align="center"><font color="black" size="3"></font>
										</td>
									</tr>
									<tr>
										<th><h2></>Task Name</h2></th>
									</tr>
									<tr>
<%
try
{
	ResultSet rs2=Db.select("select Tid,Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'not important-urgent' and Tstatusdate='1909-09-09' and Uid="+uid+" order by Ttime");
	//System.out.println("In 2nd Result Set");
	while(rs2.next())
	{
		%>
										<tr>
									
											<td><font size=3.5 color=white >-></font><a href="../ViewTask?tid=<%=rs2.getString("Tid") %>"><font size=4.5 color="black"><%=rs2.getString("Tname")%></font></a>
											</td>
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
								<table bgcolor="orange">
									<tr>
										<td align="center"><font color="black" size="3"></font>
										</td>
									</tr>
									<tr>
										<th><h2>Task Name</h2></th>
									</tr>
									<tr>
<%
try
{
	ResultSet rs3=Db.select("select Tid,Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'important-not urgent' and Tstatusdate='1909-09-09' and Uid="+uid+" order by Ttime");
	//System.out.println("In 3rd Result Set");
	while(rs3.next())
	{
		%>
										<tr>
											<td><font size=3.5 color=white >-></font><a href="../ViewTask?tid=<%=rs3.getString("Tid") %>"><font size=4.5 color="black"><%=rs3.getString("Tname")%></font></a>
											</td>
										
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
								<table bgcolor="#f27c91">
									<tr>
										<td align="center"><font color="black" size="3"></font>
										</td>
									</tr>
									<tr>
										<th><h2>Task Name</h2></th>
									</tr>
									<tr>
<%
try
{
	ResultSet rs4=Db.select("select Tid,Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'not important-not urgent' and Tstatusdate='1909-09-09' and Uid="+uid+" order by Ttime");
//	System.out.println("In 4th Result Set");
	while(rs4.next())
	{
		%>

										<tr>
											<td><font size=3.5 color=white >-></font><a href="../ViewTask?tid=<%=rs4.getString("Tid") %>"><font size=4.5 color="black"><%=rs4.getString("Tname")%></font></a>
											</td>
										
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
			</center>

			</div>

</div>



<div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        <h2><span>Image</span> Gallery</h2>
        <a href="#"><img src="images/gal1.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal2.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal3.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal4.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal5.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal6.jpg" width="75" height="75" alt="" class="gal" /></a> </div>
      <div class="col c2">
        <h2><span>Services</span> Overview</h2>
        
        <ul class="fbg_ul">
        <font color=black size=2.5>
<li>- Online application.</li>
<li>- You can Add Task</li>
<li>- You can view Today Task in Eisenhower Matrix.</li>
<li>- You can Add Reminder to Task</li>
<li>- You can Create Your Personal Diary</li>
<li>- You can give priority to tasks.</li>
<li>- You can send Task via Mail</li>
<li>- You can delete any Task or Reminder.</li>
<li>- Your daily schedule is added then finally you can see your performances in reports.</li></font>
</ul>
		
      </div>
      <div class="col c3">
        <h2><span>Contact</span> Us</h2>
        <p>
        
        
        
        </p>
        <p class="contact_info"> 
        <span>Name :</span><font color=black size=3>Gaurav Agarwal;<br/>
        		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        		Sunil Hiray;<br/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        		kiranraj swamy.</font><br/>
				 <h3><span><font color=balck></>E-mail:</font></span><font color=black size=3> timecalibrator2015@gmail.com</font></h3>
<a href="feedback.jsp"><font color=red><img src="images/feedback.jpeg" height="40" width="150"></font></a>
		<a href="https://www.facebook.com/pages/Time-Calibrator/653801504726520"><img src="images/fb.png" height="50" width="100"></a>
      		 
		 </p>
				</div>
      <div class="clr"></div>
    </div>
  </div>



</body>
<%
}
else
{
	response.sendRedirect("error1.jsp");
}
%>
</html>
