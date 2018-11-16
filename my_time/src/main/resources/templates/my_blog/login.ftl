<!DOCTYPE HTML>
<html>
<head>
<title>login</title>
	<#include "top.html"/>
</head>
<body>
	<!-- header-section-starts -->
    <#include "header.html"/>
	<div class="full">
		<#include "menu.html"/>
	<div class="col-md-9 main">
	<!-- login-page -->
	<div class="login">
		<div class="login-grids">
			<div class="col-md-6 log">
					 <h3 class="tittle">Login <i class="glyphicon glyphicon-lock"></i></h3>
					 <p>Welcome, please enter the following to continue.</p>
					 <p>If you have previously Login with us, <a href="#">click here</a></p>
					 <form action="/registration/loginForm">
						 <h5>User Name:</h5>	
						 <input type="text" name="userName" value="">
						 <h5>Password:</h5>
						 <input type="password" name="password" value="">
						 <input type="submit" value="Login">
						  
					 </form>
					<a href="#">Forgot Password ?</a>
			</div>
			<div class="col-md-6 login-right">
					 <h3 class="tittle">New Registration <i class="glyphicon glyphicon-file"></i></h3>
					<p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
					<a href="registration.ftl" class="hvr-bounce-to-bottom button">Create An Account</a>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
<!-- //login-page -->
			<div class="clearfix"> </div>
	<!--/footer-->
		<#include "foot.html"/>
	 <div class="clearfix"> </div>
	</div>
	<div class="clearfix"> </div>
</div>	
		<!--//footer-->
			<!--start-smooth-scrolling-->
						<script type="text/javascript">
									$(document).ready(function() {
										/*
										var defaults = {
								  			containerID: 'toTop', // fading element id
											containerHoverID: 'toTopHover', // fading element hover id
											scrollSpeed: 1200,
											easingType: 'linear' 
								 		};
										*/
										
										$().UItoTop({ easingType: 'easeOutQuart' });
										
									});
								</script>
		<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>


</body>
</html>