
<!DOCTYPE html>
<!--[if lt IE 7]><html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]><html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]><html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <!--[if IE]><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><![endif]-->
    <title>Time Calibrator Main</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">
    <!-- 
    
    Circle Template 
    http://www.templatemo.com/preview/templatemo_410_circle 
    -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet">

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/normalize.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/templatemo_misc.css">
    <link rel="stylesheet" href="css/templatemo_style.css">

    <script src="js/vendor/modernizr-2.6.2.min.js"></script>
	<!-- templatemo 410 circle -->
</head>
<script type="text/javascript">
	window.history.forward();
	function noBack()
	{
		window.history.forward();

	}
</script>

<body onLoad="noBack();" onpageshow="if(event.persited) noBack();" onUnload="">
    <!--[if lt IE 7]>
    <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
    <![endif]-->

    
    <div class="bg-overlay"></div>

    <div class="container-fluid">
        <div class="row">
            
            <div class="col-md-4 col-sm-12">
                <div class="sidebar-menu">
                    
                    <div class="logo-wrapper">
                        <h1 class="logo">
                            <a rel="nofollow" href="https://www.facebook.com/pages/Time-Calibrator/653801504726520"><img src="images/logo.png" height="100" width="220">
                          </a>
                        </h1>
                    </div> <!-- /.logo-wrapper -->
                    
                    <div class="menu-wrapper">
                        <ul class="menu">
                            <li><a class="homebutton" href="#">Home</a></li>
                            <li><a class="show-1" href="#">Login</a></li>
                            <li><a class="show-2" href="#">About Us</a></li>
                            <li><a class="show-3" href="#">Gallery</a></li>
                            <li><a class="show-4" href="#" onclick="templatemo_map();">Contact</a></li>
                            <li><a rel="nofollow" href="http://www.google.com">External Link</a></li>
                        </ul> <!-- /.menu -->
                        <a href="#" class="toggle-menu"><i class="fa fa-bars"></i></a>
                    </div> <!-- /.menu-wrapper -->

                    <!--Arrow Navigation-->
                    <a id="prevslide" class="load-item"><i class="fa fa-angle-left"></i></a>
                    <a id="nextslide" class="load-item"><i class="fa fa-angle-right"></i></a>

                </div> <!-- /.sidebar-menu -->
            </div> <!-- /.col-md-4 -->

            <div class="col-md-8 col-sm-12">
                
                <div id="menu-container">

                    <div id="menu-1" class="about content">
                        <div class="row">
                            <ul class="tabs">
                                <li class="col-md-4 col-sm-4">
                                    <a href="#tab1" class="icon-item">
                                        <i>Login</i>
                                    </a> <!-- /.icon-item -->
                                </li>
                                <li class="col-md-4 col-sm-4">
                                    <a href="#tab3" class="icon-item">
                                        <i>Sign Up</i>
        
                                    </a> <!-- /.icon-item -->
                                </li>
                            </ul> <!-- /.tabs -->
                            <div class="col-md-12 col-sm-12">
                                <div class="toggle-content text-center" id="tab1">
                                    
                 <html>

<body bgcolor="black" text="white">
<form method=GET action="../Login">
<center>
<table boreder=2 bgcolor=black>
<style>
<head></head>
	.separator{height:20px}
</style>

<font size=3 color=red><b>Login Again!!!</b></font>
	<br/>
	<tr><td><h5><i>Enter Login Name</i></h5></td>
	<td><input type=text name=lname required=""></td></tr>
	<tr><td class= "separator"></td></tr>


	<tr><td><h5><i>Enter the PASSWORD &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i></h5></td>
	<td><input type=password name=password required=""></td></tr>
	
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td><input type=submit name=submit value="Login"></td>
	<td><input type=reset name=reset></td>
</tr>
</table>

</form>
<h5><b><a href="forgotpassword.jsp">forgot password?</b><h5></a>
<h5><b><a href="activateaccount.jsp">Activate Account</b></h5></a>
</center>

</body>
</html>


                                </div>

	
                                <div class="toggle-content text-center" id="tab3">
                                    
                     <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<center>
<table>
<head><h2><font color="#D8AA46">Sign-up It's free</font></h2>
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
					alert("Check the Confirm password...!!!");
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
	<td><b><font size=3>Enter User Name<font color=red> *</font></<font></b></td>
	<td><input type=text name=uname  color="red" style="height:28px;font-size:10pt;"></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td><b><font size=3>Enter Contact<font color=red> *</font></font></b></td>
	<td><input type=text name=contact style="height:28px;font-size:10pt;"></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td><b><font size=3>Enter Email-id<font color=red>*</font></font></b></td>
<td><input type=text name=email style="height:28px;font-size:10pt;"></td>
	<tr><td class= "separator"></td></tr>

</tr>

<tr>
	<td><b><font size=3>Enter Login Name <font color=red>*</font></font></b></td>
<td><input type=text name=lname style="height:28px;font-size:10pt;"></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td><b><font size=3>Enter PASSWORD <font color=red>*</font></font></b></td>

	<td><input type=password name=password style="height:28px;font-size:10pt;"></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>
	<td><b><font size=3>Enter Confirm PASSWORD <font color=red>*</font></font></b></td>
	<td><input type=password name=cpass style="height:28px;font-size:10pt;"></td>
	<tr><td class= "separator"></td></tr>

</tr>


<tr>
<td><b><font size=3>
Enter Security Question<font color=red> *</font></font></b></td>
<td><select name="secQues" >
<option value="what is your DOB?">what is your DOB?</option>

<option value="what is your birthplace?">what is your birthplace?</option>

<option value="what is your NickName?">what is your Nickname?</option>

</select>
</td>
	<tr><td class= "separator"></td></tr>
</tr>
<tr>
	<td><b><font size=3>Enter Security Answer <font color=red>*</font></font></b></td>
	<td><input type=text name=ans style="height:28px;font-size:10pt;"></td>
	<tr><td class= "separator"></td></tr>

</tr>
<tr>

</tr>

</table>
<input type="image" src="images/register.jpg" alt="Submit" width="200" height="60">

</center>
</body>
</form>
</html>

       </div>
                            </div> <!-- /.col-md-12 -->
                        </div> <!-- /.row -->

                         </div> <!-- /.about -->

                    <div id="menu-2" class="services content">
                        <div class="row">
                            <ul class="tabs">
                                <li class="col-md-4 col-sm-4">
                                    <a href="#tab4" class="icon-item">
                                        <i>About us</i>
                                    </a> <!-- /.icon-item -->
                                </li>
                                <li class="col-md-4 col-sm-4">
                                    <a href="#tab5" class="icon-item">
                                        <i>Services</i>
                                    </a> <!-- /.icon-item -->
                                </li>
                                
				</ul> <!-- /.tabs -->
                            <div class="col-md-12 col-sm-12">
                                <div class="toggle-content text-center" id="tab4">
                                    <h3>About Us</h3>
                                    
<p>
<h3>"Time management refers to a range of skills, tools, and techniques utilized to accomplish specific tasks, projects and goals. This set encompass a wide scope of activities, and these include planning, setting goals, delegation, analysis of time spent, monitoring, organizing, scheduling, and prioritizing. Initially time management referred to just business or work activities, but eventually the term broadened to include personal activities also.</h3></h3>
</p>
                                </div>

                                <div class="toggle-content" id="tab5">
                                    <h3>Our Services</h3>
                                    <p><font size=3>
- Online application.<br>
- Security.<br>
- Reminder<br>
- You can deactivate your account and activate when you want instead of deleting account<br>
- You can give priority to tasks(i.e. Important-Urgent,Not Important-Urgent,Important-Not &nbsp;&nbsp;&nbsp;Urgent,Not Important-Not Urgent).<br>
- You can edit or update your account.<br>
- You can delete any task or reminder.<br>
- Your daily schedule is added then finally you can see your performances in reports.<br>

</font>

				</p>
                                </div>
                            </div> <!-- /.col-md-12 -->
                        </div> <!-- /.row -->
                    </div> <!-- /.services -->

                    <div id="menu-3" class="gallery content">
                        <div class="row">
                            
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g1.jpg" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g1.jpg">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g2.png" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g2.png">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g3.jpg" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g3.jpg">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g4.jpg" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g4.jpg">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g5.jpg" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g5.jpg">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g6.jpg" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g6.jpg">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g7.jpg" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g7.jpg">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g8.jpg" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g8.jpg">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->
                            <div class="col-md-4 col-ms-6">
                                <div class="g-item">
                                    <img src="images/gallery/g9.jpg" alt="">
                                    <a data-rel="lightbox" class="overlay" href="images/gallery/g9.jpg">
                                        <span>+</span>
                                    </a>
                                </div> <!-- /.g-item -->
                            </div> <!-- /.col-md-4 -->

                        </div> <!-- /.row -->
                    </div> <!-- /.gallery -->

                    <div id="menu-4" class="contact content">
                        <div class="row">
                        	
                            <div class="col-md-12">
                                <div class="toggle-content  spacing">
                                    <h3>Contact Us</h3>
                                    <p>


<font size=3>1.Name :Gaurav Agarwal<br>
contact:7709322152<br>
Email:gv.agarwal94@gmail.com<br>
<br>
2.Name :Sunil Hiray<br>
contact:9623652308<br>
Email:sunilhiray1994@gmail.com<br>
<br>
3.Name :kiranraj swamy<br>
contact:8796445459<br>
Email:kiranraj.swamy87@gmail.com<br>

</font>

				</p>
                                </div>
                            </div> <!-- /.col-md-12 -->
                            </div> <!-- /.contact -->

                </div> <!-- /#menu-container -->

            </div> <!-- /.col-md-8 -->

        </div> <!-- /.row -->
    </div> <!-- /.container-fluid -->
    
    <div class="container-fluid">   
        <div class="row">
            <div class="col-md-12 footer">
                <p id="footer-text">Copyright &copy; 2015 <a href="#">Time Calibrator</a>
                 |<a rel="nofollow" href="https://www.facebook.com/pages/Time-Calibrator/653801504726520">Facebook</a></p>
            </div><!-- /.footer --> 
        </div>
    </div> <!-- /.container-fluid -->

    <script src="js/vendor/jquery-1.10.1.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.1.min.js"><\/script>')</script>
    <script src="js/jquery.easing-1.3.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/plugins.js"></script>
    <script src="js/main.js"></script>
    <script type="text/javascript">
            
			jQuery(function ($) {

                $.supersized({

                    // Functionality
                    slide_interval: 3000, // Length between transitions
                    transition: 1, // 0-None, 1-Fade, 2-Slide Top, 3-Slide Right, 4-Slide Bottom, 5-Slide Left, 6-Carousel Right, 7-Carousel Left
                    transition_speed: 700, // Speed of transition

                    // Components                           
                    slide_links: 'blank', // Individual links for each slide (Options: false, 'num', 'name', 'blank')
                    slides: [ // Slideshow Images
                        {
                            image: 'images/templatemo-slide-1.jpg'
                        }, {
                            image: 'images/templatemo-slide-2.jpg'
                        }, {
                            image: 'images/templatemo-slide-3.jpg'
                        }, {
                            image: 'images/templatemo-slide-4.jpg'
                        }
                    ]

                });
            });
            
    </script>
    
    	<!-- Google Map -->
        <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        <script src="js/vendor/jquery.gmap3.min.js"></script>
        
        <!-- Google Map Init-->
        <script type="text/javascript">
           function templatemo_map() {
                $('.google-map').gmap3({
                    marker:{
                        address: '16.8496189,96.1288854' 
                    },
                        map:{
                        options:{
                        zoom: 15,
                        scrollwheel: false,
                        streetViewControl : true
                        }
                    }
                });
            }
        </script>
</body>
</html>
