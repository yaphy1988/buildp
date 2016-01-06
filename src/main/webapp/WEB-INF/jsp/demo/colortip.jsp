<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String contextPath = request.getContextPath();
	request.setAttribute("_base", contextPath);

	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
	response.setHeader("Pragma", "No-cache");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Colortip - a jQuery Tooltip Plugin | Tutorialzine demo</title>

<link rel="stylesheet" type="text/css" href="${_base}/js/jquery/colortip-1.0/styles.css" />
<link rel="stylesheet" type="text/css" href="${_base}/js/jquery/colortip-1.0/colortip-1.0-jquery.css"/>
<script type="text/javascript"
	src="${_base}/js/jquery/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${_base}/js/jquery/colortip-1.0/colortip-1.0-jquery.js"></script>
<script type="text/javascript" >
$(document).ready(function(){
	/**初始化 colorTip控件*/
	/* Adding a colortip to any tag with a title attribute: */
	$('[title]').colorTip({color:'yellow'});
});
</script>
</head>

<body>

<div id="page">

	<h1>Colortip - a jQuery Tooltip Plugin</h1>
    
    <h2>Test it by hovering over the links below</h2>
    
    <!-- http://tutorialzine.com/2010/07/colortips-jquery-tooltip-plugin/ -->
  <div>
  <!-- 只支持超链接的title -->
      <p>  <a href="http://tutorialzine.com/" title="The tooltips do not use any images">dignissim</a>.  </p>
      <p> <a href="http://tutorialzine.com/" title="The script replaces the title attributes of the links with fancy tooltips.">congue</a>||
       <a href="http://tutorialzine.com/" title="6 different color themes are available" class="green">ultricies</a> </p>
      <p> <a href="http://tutorialzine.com/" title="You can specify a color theme by adding a simple class name" class="black">ornare</a> </p>
      <p> <a href="http://tutorialzine.com/" title="White theme" class="white">ultricies</a>|| 
      <a href="http://tutorialzine.com/" class="red" title="A red tooltip">tincidunt</a> || 
      <a href="http://tutorialzine.com/" title="Visit Website">condimentum</a></p>
      <p>  <a href="http://tutorialzine.com/" title="Visit Website" class="blue">sodales</a> </p>
  </div>
</div>



</body>
</html>
