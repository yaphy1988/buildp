<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>材料信息管理</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="materialinfo manage">
<meta name="author" content="yaphy">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<script src="${ctx}/resources/js/manager/materialinfomanage.js"></script>
<!-- The styles -->
<style>
</style>
</head>
<body>
	<%@include file="/WEB-INF/jsp/common/header.jsp"%>
	<div class="ch-container">
		<div class="row">
			<%@include file="/WEB-INF/jsp/common/sidebar.jsp"%>

			<div id="content" class="col-lg-10 col-sm-10">
				<!-- content starts -->
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner">
							<div class="box-header well" data-original-title="">
								<h2>
									<i class="glyphicon glyphicon-user"></i> 欢迎您，${user.userName}
								</h2>
								
							</div>
							<div class="box-content">
								<div class="alert alert-info">
									材料信息。
								</div>
								<div  style="margin-bottom:10px;">
								
									材料名称：<input id="materialName" name="materialName" style="width:100px"/>
									材料类型：
									<select id="selectTypeName" name="TypeName">
										<option selected value="">全部</option>
									</select>
									规格描述：<input id="standard" name="standard" style="width:100px"/>
									状态：
									<select id="status" class='selectpicker' name="status">
										<option selected value="">全部</option>
										<option value="1">有效</option>	
										<option value="0">无效</option>									
									</select>
									<button id="find" type="submit" class="btn btn-warning btn-sm" style="margin-left:20px">查询</button>
									<button id="addBtn" class="btn btn-success btn-sm" style="float:right;" onclick="addInfo();">
								    	添加
									</button>
									<input id="addSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;添加成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
							                    </input>
							                    <input id="failMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;操作失败，请重试或联系管理人员！&quot;,&quot;layout&quot;:&quot;center&quot;,&quot;type&quot;:&quot;error&quot;}">
							                    </input>
							                    <input id="editSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;修改保存成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
							                    </input>
							                    <input id="delSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;删除成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
							                    </input>
								</div>
								<div id="data-render" style="text-align:center">
									正在加载数据...
									<br/>
									<img src="${ctx}/images/ajax-loader-5.gif" title="img/ajax-loaders/ajax-loader-5.gif">
								</div>
							</div>
						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->

				<!-- content ends -->
			</div>
		</div>
		<div class="modal fade" id="deleteDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>删除材料信息</h3>
					</div>
					<div class="modal-body">
						<p>是否删除</p>
					</div>
					<div class="modal-footer">
						<a id="deleteA" href="#" class="btn btn-primary" data-dismiss="modal">确定</a>
						<a href="#" class="btn btn-default" data-dismiss="modal">取消</a>
					</div>
				</div>
			</div>
		</div>
		<div class="modal fade" id="addDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>添加材料信息</h3>
					</div>
					<%@include file="materialinfoadd.jsp"%>
				</div>
			</div>
		</div>
		<div class="modal fade" id="editDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>修改材料信息</h3>
					</div>
					<div id="editContent">
					</div>
					 
				</div>
			</div>
		</div>
		<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
	</div>
	<!--/.fluid-container-->
	<%@include file="/WEB-INF/jsp/common/common_js.jsp"%>
	<!-- application script for Charisma demo 
	<!--<script src="${ctx}/resources/js/frontServers.js"></script> -->
	</script>
</body>
</html>
