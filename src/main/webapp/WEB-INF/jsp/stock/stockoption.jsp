<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>库存管理</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="stockinfo manage">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<%-- <link href="${ctx}/resources/css/ta.css" rel='stylesheet'> --%>
<script type="text/javascript" src="${ctx}/resources/js/manager/stockoption.js"></script>
<!-- The styles -->
<style>
div.error_msg
{
    color:Red;
    background-image:url("${ctx}/images/wrong.gif") ;
    background-repeat:no-repeat;
    background-position:left center;
    border:1px solid red;
    padding-left:20px;
}
div.save_success
{
    background-color: #fbf0db;
    border: 1px solid #ff9000;
    color: #af6606;
    background-image: url(${ctx}/images/ok.png);
    background-repeat: no-repeat;
    background-position:10px center;
    display:none;
    padding-left:40px
}
.required
{
	float:left;
	color:Red;
}
.hide{display:none;}
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
									出入库操作。
								</div>
								<!--保存成功或失败的提示消息-->
								<input id="successMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;操作成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
					                        </input>
					                        <input id="failMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;操作失败，请重试或联系管理人员！&quot;,&quot;layout&quot;:&quot;center&quot;,&quot;type&quot;:&quot;error&quot;}">
					                        </input>
					                        <ul style="padding-left:10px" class="nav nav-tabs" data-trigger="tab">
								  <li class="active"><a href="#">入库</a></li>
								  <li><a href="#">出库</a></li>
								</ul>
								<div class="pane-wrapper">
								  <div class="active">
								  	<form id="inForm" method="post">
										<table>
											<tr>
												<td>规格+材料名称：</td>
												<td>
													<select id="inSelectMaterial" name="materialId">
													</select>
												</td>
											</tr>
											<tr>
												<td style="text-align:right;">供应商：</td>
												<td>
													<select id="inSelectSupplier" name="supplierId">
														<option selected value=""></option>
													</select>
												</td>
												<td>
													<span class="required">*</span>
													<div id="in_supplier_msg"  style="float:left"></div>
												</td>
											</tr>
											<tr>
												<td style="text-align:right;">数量：</td>
												<td>
													<input id="inCount" style="width:250px" type="text" class="form-control" name="count">
													
												</td>
												<td>
													<span class="required">*</span>
													<div id="in_count_msg" style="float:left">请输入大于0的整数</div>
												</td>
											</tr>
											<input id="addCreateStaff" type="hidden" name="createStaff" value="${user.userName}"/>
	
											
										</table>
										<button type="button" class="btn btn-default" onclick="savein();">入库</button>
										&nbsp;&nbsp;
										<button type="reset" class="btn btn-default">重置</button>
									</form>
								  </div>
								  <div class="hide">
								  	<form id="outForm" method="post">
										<table>
										<tr>
											<td>规格+材料名称：</td>
											<td>
												<select id="outSelectMaterial" name="materialId" onchange="getStockAvailCount()">
												</select>
											</td>
										</tr>
										<tr>
											<td style="text-align:right;">供应商：</td>
											<td>
												<select id="outSelectSupplier" name="supplierId"  onchange="getStockAvailCount();">
													<option selected value=""></option>
												</select>
												
											</td>
											<td>
												<span class="required">*</span>
												<div id="out_supplier_msg" style="float:left"></div>
											</td>
										</tr>
										<tr>
											<td style="text-align:right;">可用库存量：</td>
											<td id="availCount">
											</td>
										</tr>
										<tr>
											<td style="text-align:right;">数量：</td>
											<td>
												<input id="outCount" style="width:250px" type="text" class="form-control" name="count">
											</td>
											<td>
												<span class="required">* </span>
												<div id="out_count_msg" style="float:left">请输入大于0的整数</div>
											</td>
										</tr>

										
									</table>
									<button type="button" class="btn btn-default" onclick="saveout();">出库</button>
									&nbsp;&nbsp;
									<button type="reset" class="btn btn-default">重置</button>
									</form>
								  </div>
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
		
		<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
	</div>
	<!--/.fluid-container-->
	<%@include file="/WEB-INF/jsp/common/common_js.jsp"%>
	<!-- application script for Charisma demo 
	<!--<script src="${ctx}/resources/js/frontServers.js"></script> -->
	</script>
</body>
</html>
