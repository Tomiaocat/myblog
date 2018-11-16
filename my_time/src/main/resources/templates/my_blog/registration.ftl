<!DOCTYPE HTML>
<html>
<head>
<title>double home </title>
	<#include "top.html"/>
</head>
<body>
	<!-- header-section-starts -->
     <#include "header.html"/>
	<div class="full">
			<#include "menu.html"/>
	<div class="col-md-9 main">
	<!-- register -->
			<div class="sign-up-form">
				 <h3 class="tittle">注册<i class="glyphicon glyphicon-file"></i></h3>
					<p>欢迎来到这个 不正经的网站,你想看的我这里都有,当然我是骗你的,这里连毛都没有根</p>
				<div class="sign-up">
					 <h3 class="tittle reg"> 请填写用户名 和邮箱地址 --初始登录密码将发送到你的邮箱,登录后请修改密码 <i class="glyphicon glyphicon-user"></i></h3>
					<div class="sign-u">
						<div class="sign-up1">
							<h4 class="a">用户名* :</h4>
						</div>
						<div class="sign-up2">
							<form>
								<input type="text" class="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}">

							</form>
						</div>
						<div class="clearfix"> </div>
					</div>
					<#--<div class="sign-u">
						<div class="sign-up1">
							<h4 class="b">Last Name* :</h4>
						</div>
						<div class="sign-up2">
							<form>
									<input type="text" class="text" value="Last Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Last Name';}">

							</form>
						</div>
						<div class="clearfix"> </div>
					</div>-->
					<div class="sign-u">
						<div class="sign-up1">
							<h4 class="c">邮箱地址* :</h4>
						</div>
						<div class="sign-up2">
							<form>
								 <input type="text" class="text" value="Email Address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email Address';}">

							</form>
						</div>
						<div class="clearfix"> </div>
					</div>
					 <h3 class="tittle reg">Login Information <i class="glyphicon glyphicon-off"></i></h3>
					<div class="sign-u">
						<div class="sign-up1">
							<h4 class="d">Password* :</h4>
						</div>
						<div class="sign-up2">
							<form>
								 <input type="password" class="Password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">

							</form>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="sign-u">
						<div class="sign-up1">
							<h4>Confirm Password* :</h4>
						</div>
						<div class="sign-up2">
							<form>
								
											 <input type="password" class="Password" value="Confirm Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Confirm Password';}">
	

							</form>
						</div>
						<div class="clearfix"> </div>
					</div>
					<form>
						<input type="submit" value="Submit">
					</form>
				</div>
			</div>
<!-- //register -->
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