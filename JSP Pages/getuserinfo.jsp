<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<center>
<table>
<head><h1>User Registration</h1><title>User Registration</title>
<style>
	.separator{height:20px}
</style>

<script>

function validate()
	{
	//String numToken="[\\p{Digit}&&[123456789]]+";
			if(!check_username(document.myform.uname.value) ||document.myform.uname.value=="" || document.myform.uname.value==null)
			{
				alert("Check the user name...!!!");
				return false;
			}
		else
			if(!check_name(document.myform.lname.value)|| document.myform.lname.value=="" || document.myform.lname.value==null)
			{
				alert("Check the login name...!!!");
				return false;
			}
		else
			if(!check_pwd(document.myform.password.value)|| document.myform.password.value=="" || document.myform.password.value==null)
			{
				alert("Check the Login password...!!!");
				return false;
			}
		
			else
				if(!check_pwd(document.myform.cpass.value)|| document.myform.cpass.value=="" || document.myform.cpass.value==null)
				{
					alert("Check the Login cpassword...!!!");
					return false;
				}
			
			else
				if(!check_email_id(document.myform.email.value) ||document.myform.email.value=="" || document.myform.email.value==null)
				{
					alert("Check the Email...!!!");
					return false;
				}
			else
				if(!check_contact_no(document.myform.contact.value)|| document.myform.contact.value=="" || document.myform.contact.value==null)
				{
					alert("Check the contact...!!!");
					return false;
				}
			
					else
						if(document.myform.secQues.value=="" || document.myform.secQues.value==null)
						{
							alert("Enter the que...!!!");
							return false;
						}
						else
							if(document.myform.ans.value=="" || document.myform.ans.value==null)
							{
								alert("Enter the ans...!!!");
								return false;
							}
							else
									if(document.myform.password.value != document.myform.cpass.value)
									{
										alert("confirm password should be same as password...!!!");
										return false;
									}
			
		return true;
		function check_name(name)  
		{   
			var letters = /^[a-zA-Z\-]{3,30}$/; 
			var matcher = name.match(letters);
			
			if(matcher==null)
			{
				//alert("Name is Invalid");
				return false;
			}
			nm = matcher[0];
			
			if(nm!=matcher)
			{
				alert("Invalid Name");
				return false;
			}
			
			return true;
		}

		function check_username(uadd)  
		{   
			var letters = /^[a-zA-Z0-9\-]{3,30}$/; 
			var matcher = uadd.match(letters);
			
			if(matcher==null)
			{
				//alert("Name is Invalid");
				return false;
			}
			unm = matcher[0];
			
			if(unm!=matcher)
			{
				alert("Invalid User Name");
				return false;
			}
			
			return true;
		}  


		function check_pwd(pwd)  
		{   
			var decimal=  /^[A-Za-z0-9!@#$%^&*()_]{6,20}$/; 
			var matcher = pwd.match(decimal);
			
			if(matcher==null)
			{
				//alert("Name is Invalid");
				return false;
			}
			password = matcher[0];
			
			if(password!=matcher)
			{
				alert("Invalid Password");
				return false;
			}
			
			return true;
		}  
		

		function check_contact_no(cntct)  
		{   
			var letters = /^[0-9\-]{10}$/; 
			var matcher = cntct.match(letters);
			
			if(matcher==null)
			{
				//alert("Name is Invalid");
				return false;
			}
			con = matcher[0];
			
			if(con!=matcher)
			{
				alert("Invalid Number");
				return false;
			}
			
			return true;
		}

		function check_email_id(mail)  
		{   
			//var let =  /^[\w-]+@([\w-]+\.)+[\w-]+$/;
			var let =/^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,4})$/;
			var matcher = mail.match(let);
			
			if(matcher==null)
			{
				//alert("Name is Invalid");
				return false;
			}
			email = matcher[0];
			
			if(email==matcher)
			{
				alert("Invalid Email");
				return false;
			}
			
			return true;
		}


	
			
	}
	</script>
</head>
<form method=GET action="../GetUserInfo" name="myform" onsubmit = "return validate();">

<body bgcolor="yellow" text="#FF0000">

<tr>
	<td>Enter the User Name *</td>
	<td><input type=text name=uname></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td>Enter the Contact *</td>
	<td><input type=text name=contact></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td>Enter the Email-id *</td>
<td><input type=text name=email></td>
	<tr><td class= "separator"></td></tr>

</tr>

<tr>
	<td>Enter the Login Name *</td>
<td><input type=text name=lname></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td>Enter the PASSWORD *</td>

	<td><input type=password name=password></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td>Enter the Confirm PASSWORD *</td>
	<td><input type=password name=cpass></td>
	<tr><td class= "separator"></td></tr>

</tr>


<tr>
<td>
Enter Security Question *</td>
<td><select name="secQues" >
<option value="what is your DOB?">what is your DOB?</option>

<option value="what is your birthplace?">what is your birthplace?</option>

<option value="what is your NickName?">what is your Nickname?</option>

</select>
</td>
	<tr><td class= "separator"></td></tr>
</tr>
<tr>
	<td>Enter Security Answer *</td>
	<td><input type=text name=ans></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td><a href="login.jsp">Login</a></td>
	<td><input type=submit name=submit value="submit"></td>
	<td><input type=reset name=reset></td>

</tr>

</table>
</center>
</body>
</form>
</html>

