<!DOCTYPE html>
<!--[if lt IE 7]><html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]><html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]><html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <!--[if IE]><meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><![endif]-->
    <title>Circle by templatemo</title>
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
                            <a rel="nofollow" href="http://www.templatemo.com/preview/templatemo_410_circle"><img src="images/logo.png" height="100" width="220">
                           </a>
                        </h1>

                  </div> <!-- /.logo-wrapper -->

     <div class="col-md-4 col-sm-12" style="margin-left:380px; width:500px;" >
        
    <div class="toggle-content text-center" id="tab1"  style="margin-top:10px;">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String ques=(String)session.getAttribute("sec_q");
%>                                    
                 <html>
<body bgcolor="black" text="white">
<form method=GET action="../CheckAnswer">
<center>
<table boreder=2 bgcolor=black>
<head></head>
<style>
	.separator{height:20px}
</style>

<h5><%=ques %></h5>
	<tr><td><h5><i>Enter Security Ans:</i></h5></td>
	<td><input type=text name=sec_a required=""></td></tr>
	<tr><td class= "separator"></td></tr>

<tr>
	<td><input type=submit name=submit value="Done"></td>
	<td><input type=reset name=reset></td>
</tr>
</table>


<a href="login.jsp"><img src="images/home.png" width="80" height="70">
</a>

</form>

</center>

</body>
</html>


                                </div>

	

    </div> <!-- /.col-md-4 -->


                    <!--Arrow Navigation-->
                    <a id="prevslide" class="load-item"><i class="fa fa-angle-left"></i></a>
                    <a id="nextslide" class="load-item"><i class="fa fa-angle-right"></i></a>





                </div> <!-- /.sidebar-menu -->
            </div> <!-- /.col-md-4 -->
    
    <div class="container-fluid">   
        <div class="row">
            <div class="col-md-12 footer">
                <p id="footer-text">Copyright &copy; 2015 <a href="#">Time Calibrator</a>
                 |<a rel="nofollow" href="https://www.facebook.com/pages/Time-Calibrator/653801504726520"><img src="images/fb.png" height="50" width="100"></a></p>
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
    
    	</body>
</html>
