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
	margin-right: 2px;
}

ul#nav li a:hover,ul#nav li a:focus,ul#nav li.selected a,ul#nav li.selected a:hover,ul#nav li.selected a:focus
	{
	color: #B30303;
	text-shadow: none;
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
	<div class="main">
		<div class="header">
			<div class="header_resize">
				<div class="searchform">
					<form id="formsearch" name="formsearch" method="post" action="#">
						<span> <input name="editbox_search" class="editbox_search"
							id="editbox_search" maxlength="80" value="Search our ste:"
							type="text" /> </span> <input name="button_search"
							src="images/search.gif" class="button_search" type="image" />
					</form>
				</div>
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
			<div class="content_resize" >


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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page  language="java" import="java.util.*,java.text.*"%>
<%!
public int nullIntconv(String inv)
{   
	int conv=0;
		
	try{
		conv=Integer.parseInt(inv);
	}
	catch(Exception e)
	{}
	return conv;
}
%>
<%
// int a;
// int x=nullIntconv(request.getParameter("day_"));
 int iYear=nullIntconv(request.getParameter("iYear"));
 int iMonth=nullIntconv(request.getParameter("iMonth"));

 Calendar ca = new GregorianCalendar();
 int iTDay=ca.get(Calendar.DATE);
 int iTYear=ca.get(Calendar.YEAR);
 int iTMonth=ca.get(Calendar.MONTH);

 if(iYear==0)
 {
	  iYear=iTYear;
	  iMonth=iTMonth;
 }

 GregorianCalendar cal = new GregorianCalendar (iYear, iMonth, 1); 

 int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
 int weekStartDay=cal.get(Calendar.DAY_OF_WEEK);
 
 cal = new GregorianCalendar (iYear, iMonth, days); 
 int iTotalweeks=cal.get(Calendar.WEEK_OF_MONTH);
  
%>
<head>
<script>
function goTo()
{
  document.frm.submit()
}
</script>
<style type="text/css">
th
{
background-color:#0ffff0;
}
</style>
</head>
<body bgcolor = "#1a1d1e"text="white">
<form name="frm" method="get">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="6%"><font color=black size=3>Year</font></td>
        <td width="7%">
		<select name="iYear" onchange="goTo()">
        <%
		// start year and end year in combo box to change year in calendar
	    for(int iy=iTYear-70;iy<=iTYear+70;iy++)
		{
		  if(iy==iYear)
		  {
		    %>
          <option value="<%=iy%>" selected="selected"><%=iy%></option>
          <%
		  }
		  else
		  {
		    %>
          <option value="<%=iy%>"><%=iy%></option>
          <%
		  }
		}
	   %>
        </select></td>
        <td width="73%" align="center"><h3><font size=5 color=black><b><%=new SimpleDateFormat("MMMM").format(new Date(2008,iMonth,01))%> <%=iYear%></b></font></h3></td>
        <td width="6%"><font color=black size=3>Month</font></td>
        <td width="8%">
		<select name="iMonth" onchange="goTo()">
        <%
		// print month in combo box to change month in calendar
	    for(int im=0;im<=11;im++)
		{
		  if(im==iMonth)
		  {
	     %>
          <option value="<%=im%>" selected="selected"><%=new SimpleDateFormat("MMMM").format(new Date(2008,im,01))%></option>
          <%
		  }
		  else
		  {
		    %>
          <option value="<%=im%>"><%=new SimpleDateFormat("MMMM").format(new Date(2008,im,01))%></option>
          <%
		  }
		}
	   %>
        </select></td>
      </tr>
 
    </table></td>
  </tr>
  <tr>
    <td><table align="center" border="1" cellpadding="3" cellspacing="0" width="50%" bgcolor = "#f0f0f0">
      <tbody>
        <tr>
          <th><font size = 4.5 color = "brrowen">Sun</font></th>
          <th><font size = 4.5 color = "brrowen">Mon</font></th>
          <th><font size = 4.5 color = "brrowen">Tue</font></th>
          <th><font size = 4.5 color = "brrowen">Wed</font></th>
          <th><font size = 4.5 color = "brrowen">Thu</font></th>
          <th><font size = 4.5 color = "brrowen">Fri</font></th>
          <th><font size = 4.5 color = "brrowen">Sat</font></th>
        </tr>
        <%
        int cnt =1;
        for(int i=1;i<=iTotalweeks;i++)
        {
		%>
        <tr>
          <% 
	        for(int j=1;j<=7;j++)
	        {
		        if(cnt<weekStartDay || (cnt-weekStartDay+1)>days)
		        {
		         %>
                <td align="center" height="35">&nbsp;</td>
               <% 
		        }
		        else
		        {
		        	int x=(cnt-weekStartDay+1);
		        	//System.out.println("cell value is "+(cnt-weekStartDay+1));
		         %>
		         <td align="center" height="35" id="day_<%=(cnt-weekStartDay+1)%>"><span><a href="../DisplayDiary?dt=<%=x%>&yr=<%=iYear%>&m=<%=iMonth+1%>"><%=(cnt-weekStartDay+1)%></a></span></td>
                
               <% 
		        }
		        cnt++;
		      }
	        %>
	        
        </tr>
        <% 
	    }
	    %>
	    
      </tbody>
      
    </table>
    </td><td>
 <a href="readdiary.jsp"><font size=5 color=red></font><img src="images/diary.jpeg" width="100" height="100" " alt="a cat" title="Read Your Diary!" ></a>
 
    </td>
  </tr>
  
</table>
</form>

</body>
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
