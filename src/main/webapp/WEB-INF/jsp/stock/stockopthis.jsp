<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>库存操作查询</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="stockinfo manage">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<script src="${ctx}/resources/js/manager/stockopthis.js"></script>
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
									库存操作查询
				                		</div>
				                		<div class="well">
								
				                	<!-- 检索条件 START-->
									<table width="100%" border="0">
										<tr style="padding:1px;">
											<td style="padding:1px" align="right">开始时间:</td>
											<td style="padding:1px ">
													<div class="input-group date form_date  col-md-10" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
							                    	<input id="startDate" class="form-control" size="12" type="text" readonly="" value="${start_day}" >
													<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
							                		</div>
											</td>
											<td style="padding:1px">结束时间:</td>
											<td style="padding:1px">
													<div class="input-group date form_date  col-md-10" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input" data-link-format="yyyy-mm-dd">
							                    	<input id="endDate" class="form-control" size="12" type="text"  readonly="" value="${end_day}" >
													<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
							                		</div>
											</td>
											<td style="padding:1px">操作类型:</td>
											<td style="padding:1px">
												<select id="optType" class='selectpicker' name="modelColor">
													<option value="%">--全部--</option>
													<option value="01">入库</option>
													<option value="02">出库</option>
												</select>
											</td>
											<td style="width: 13%">
										</tr>
										<tr>
											<td class="Hint" nowrap="nowrap" >材料类型:</td>
											<td style="padding:1px">
												<select id="selectType" name="materialType">
													<option selected value="">--全部--</option>
												</select>
											</td>
											<td class="Hint" nowrap="nowrap">创建人:</td>
											<td style="padding:1px">
												<select id="selectUser">
													<option selected value="">--全部--</option>
												</select>
											</td>
											<td></td>
											<td class="Hint" nowrap="nowrap"><button id="query" type="submit" class="btn btn-primary">查询</button></td>
											<td style="width: 13%"> 
												
											</td>
										</tr>
									</table>
									<!-- 检索条件 END-->	
								</div>
								
								<div id="data-render"  style="text-align:center">
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
		<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
	</div>
	<!--/.fluid-container-->
	<%@include file="/WEB-INF/jsp/common/common_js.jsp"%>
	<!-- application script for Charisma demo 
	<!--<script src="${ctx}/resources/js/frontServers.js"></script> -->
	</script>
	<script type="text/javascript">
    
	
	
</script>
</body>
</html>
