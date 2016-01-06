<%@ page language="java" pageEncoding="UTF-8"%>

<!-- topbar starts -->
    <div class="navbar navbar-default" role="navigation" style="background: url(${ctx}/resources/img/bg_jk.png) repeat-x;height:68px">

        <div class="navbar-inner" style="padding-top: 0;">
            <button type="button" class="navbar-toggle pull-left animated flip">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="padding: 0px 0px;" href="${ctx}"> 
            	<img alt="Charisma Logo" src="${ctx}/images/logo.png" class="hidden-xs" style="width:430px; height: 65px; padding: 10px"/>
                <!-- <span>云监控</span> -->
            </a>
			
            <!-- user dropdown starts -->
            <div class="btn-group pull-right" style="width:205px">
            	
                <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" style="width:100px;float:right">
                    <i class="glyphicon glyphicon-user"></i><span class="hidden-sm hidden-xs"> ${user.userName}</span>
                    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <li><a href="#" id="checkout">登出</a></li>
                </ul>
                <a class="btn btn-default  col-md-6" title="首页" href="${ctx}/#" target="_blank" style="width:100px;float:right"><i class="icon-edit"></i> 
				返回首页</a>
            </div>

        </div>
    </div>
    <!-- topbar ends -->
    
   <script>
  $("#checkout").click(function(){
	  invalidateSession();
  });
  function invalidateSession(){
		var url=getRootPath()+"login/makeSessionInvali";
		$.ajax({
			type : "POST",
			url : url,
			data : {},
			dataType : "JSON",
			success : function(data) {
				var tag = data.RES_RESULT;
				if (tag == "SUCCESS") {
					window.location.href=getRootPath()+"login.jsp";
			   }
			}
		});
	}
	function getRootPath(){
	    var strFullPath=window.document.location.href;  
	    var strPath=window.document.location.pathname;  
	    var pos=strFullPath.indexOf(strPath);  
	    var prePath=strFullPath.substring(0,pos);  
	    var postPath=strPath.substring(0,strPath.substr(1).indexOf('/')+1)+"/";  
	    return(prePath+postPath);
	}  

</script>