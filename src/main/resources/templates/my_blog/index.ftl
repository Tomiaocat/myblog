<!DOCTYPE HTML>
<html>
<head>
<title>double home</title>
<#include "top.html"/>
</head>
<body>
	<!-- header-section-starts -->
	<#include "header.html"/>
	<div class="full">
		<#include "menu.html"/>
	<div class="col-md-9 main">
		<!--banner-section-->
		<div class="banner-section">
		   <h3 class="tittle">奇大牛热烈庆祝罗站长成功戒烟了<i id="second">${second}</i>秒,并且奇大牛开心的抽了一根${S_name}</h3>
			<div class="banner">
                 <div  class="callbacks_container">
					<ul class="rslides" id="slider4">
					       <li>
							  <img src="/static/images/1.jpg" class="img-responsive" alt="" />

							</li>
							<#--<li>
								 <img src="/static/images/2.jpg" class="img-responsive" alt="" />
							</li>
							<li>
							 <img src="/static/images/3.jpg" class="img-responsive" alt="" />
							</li>
							<li>
							 <img src="/static/images/3.jpg" class="img-responsive" alt="" />
							</li>-->
						</ul>
					</div>
					<!--banner-->
	  			<script src="/static/js/responsiveslides.min.js"></script>
			 <script>
			    // You can also use "$(window).load(function() {"
			    $(function () {
			      // Slideshow 4
			      $("#slider4").responsiveSlides({
			        auto: true,
			        pager:true,
			        nav:true,
			        speed: 500,
			        namespace: "callbacks",
			        before: function () {
			          $('.events').append("<li>before event fired.</li>");
			        },
			        after: function () {
			          $('.events').append("<li>after event fired.</li>");
			        }
			      });
			
			    });
			  </script>
		 <div class="clearfix"> </div>
			    <div class="b-bottom"> 
			      <h5 class="top"><a href="/single">标题======================================标题</a></h5>
			      <p>日期==日期 <a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>数字 评论 </a><a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>数字 点击次数====</a><a class="span_link" href="single"><span class="glyphicon glyphicon-circle-arrow-right"></span></a></p>
				</div>
			 </div>
			   <!--//banner-->
			  <!--/top-news-->
			  <div class="top-news">
				<div class="top-inner">
					<div class="col-md-6 top-text">
						 <a href="single"><img src="/static/images/pic1.jpg" class="img-responsive" alt=""></a>
						    <h5 class="top"><a href="single">新闻标题==</a></h5>
							<p>显示的简短评价</p>
						    <p>日期 <a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>评论数</a><a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>点击次数 </a><a class="span_link" href="single"><span class="glyphicon glyphicon-circle-arrow-right"></span></a></p>
					 </div>
					 <div class="clearfix"> </div>
				 </div>
				 <div class="top-inner second">
					<div class="col-md-6 top-text">
						 <a href="single"><img src="/static/images/pic3.jpg" class="img-responsive" alt=""></a>
						    <h5 class="top"><a href="single">Consetetur sadipscing elit</a></h5>
							<p>Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt labore dolore magna aliquyam eratsed diam justo duo dolores rebum.</p>
						    <p>On Jun 25 <a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>0 </a><a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>56 </a><a class="span_link" href="single"><span class="glyphicon glyphicon-circle-arrow-right"></span></a></p>
					 </div>
					<div class="col-md-6 top-text two">
						 <a href="single"><img src="/static/images/pic4.jpg" class="img-responsive" alt=""></a>
						    <h5 class="top"><a href="single">Consetetur sadipscing elit</a></h5>
							<p>Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt labore dolore magna aliquyam eratsed diam justo duo dolores rebum.</p>
						    <p>On Jun 27 <a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>0 </a><a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>56 </a><a class="span_link" href="single"><span class="glyphicon glyphicon-circle-arrow-right"></span></a></p>
					 </div>
					 <div class="clearfix"> </div>
				 </div>
	            </div>
					<!--//top-news-->
		     </div>
			<!--//banner-section-->
			<div class="banner-right-text">
			 <h3 class="tittle">News  <i class="glyphicon glyphicon-facetime-video"></i></h3>
			<!--/general-news-->
			 <div class="general-news">
				<div class="general-inner">
					<div class="general-text">
						 <a href="single"><img src="/static/images/gen1.jpg" class="img-responsive" alt=""></a>
						    <h5 class="top"><a href="single">Consetetur sadipscing elit</a></h5>
							<p>Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt labore dolore magna aliquyam eratsed diam justo duo dolores rebum.</p>
						    <p>On Jun 25 <a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>0 </a><a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>56 </a><a class="span_link" href="single"><span class="glyphicon glyphicon-circle-arrow-right"></span></a></p>
					 </div>
					 <div class="edit-pics">
							      <div class="editor-pics">
										 <div class="col-md-3 item-pic">
										   <img src="/static/images/f4.jpg" class="img-responsive" alt="">

										   </div>
											<div class="col-md-9 item-details">
												<h5 class="inner two"><a href="single">New iPad App to simulate your Guitar</a></h5>
												 <div class="td-post-date two"><i class="glyphicon glyphicon-time"></i>Feb 22, 2015 <a href="#"><i class="glyphicon glyphicon-comment"></i>0 </a></div>
											 </div>
											<div class="clearfix"></div>
										</div>
										<div class="editor-pics">
										 <div class="col-md-3 item-pic">
										   <img src="/static/images/f1.jpg" class="img-responsive" alt="">

										   </div>
											<div class="col-md-9 item-details">
												<h5 class="inner two"><a href="single">New iPad App to simulate your Guitar</a></h5>
												 <div class="td-post-date two"><i class="glyphicon glyphicon-time"></i>Feb 22, 2015 <a href="#"><i class="glyphicon glyphicon-comment"></i>0 </a></div>
											 </div>
											<div class="clearfix"></div>
										</div>
										<div class="editor-pics">
										 <div class="col-md-3 item-pic">
										   <img src="/static/images/f1.jpg" class="img-responsive" alt="">

										   </div>
											<div class="col-md-9 item-details">
												<h5 class="inner two"><a href="single">New iPad App to simulate your Guitar</a></h5>
												 <div class="td-post-date two"><i class="glyphicon glyphicon-time"></i>Feb 22, 2015 <a href="#"><i class="glyphicon glyphicon-comment"></i>0 </a></div>
											 </div>
											<div class="clearfix"></div>
										</div>
										<div class="editor-pics">
										 <div class="col-md-3 item-pic">
										   <img src="/static/images/f4.jpg" class="img-responsive" alt="">

										   </div>
											<div class="col-md-9 item-details">
												<h5 class="inner two"><a href="single">New iPad App to simulate your Guitar</a></h5>
												 <div class="td-post-date two"><i class="glyphicon glyphicon-time"></i>Feb 22, 2015 <a href="#"><i class="glyphicon glyphicon-comment"></i>0 </a></div>
											 </div>
											<div class="clearfix"></div>
										</div>
									</div>
								<div class="media">	
								 <h3 class="tittle media">Media <i class="glyphicon glyphicon-floppy-disk"></i></h3>
								  <div class="general-text two">
									 <a href="single"><img src="/static/images/gen3.jpg" class="img-responsive" alt=""></a>
										<h5 class="top"><a href="single">Consetetur sadipscing elit</a></h5>
										<p>Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt labore dolore magna aliquyam eratsed diam justo duo dolores rebum.</p>
										<p>On Jun 27 <a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>0 </a><a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>56 </a><a class="span_link" href="single"><span class="glyphicon glyphicon-circle-arrow-right"></span></a></p>
								  </div>
					         </div>
					    <div class="general-text two">
						    <a href="single"><img src="/static/images/gen2.jpg" class="img-responsive" alt=""></a>
						    <h5 class="top"><a href="single">Consetetur sadipscing elit</a></h5>
							<p>Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt labore dolore magna aliquyam eratsed diam justo duo dolores rebum.</p>
						    <p>On Jun 27 <a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>0 </a><a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>56 </a><a class="span_link" href="single"><span class="glyphicon glyphicon-circle-arrow-right"></span></a></p>
					    </div>
				 </div>
			</div>	
			<!--//general-news-->
			<!--/news-->
			<!--/news-->
		 </div>
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



                                        setInterval(function () {
                                                    var second = $("#second").html();
                                                    console.log("second=="+second);
                                                    second = second.replace(",","");
                                                    console.log("second=="+second);
                                                    $("#second").html(parseInt(second)+1);
                                                },
                                                1000);


										
									});
								</script>
		<a href="#home" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>


</body>
</html>