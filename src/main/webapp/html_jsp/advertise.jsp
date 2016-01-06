<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@include file="/html_jsp/common/head.jsp"%>
</head>


<body>
<%@include file="/html_jsp/common/top.jsp"%>

<div class="index_banner width1004">
	<img src="${ctx}/images/banner1.jpg">
</div>

<div class="index_center width1004">
	<div class="all_title"><img src="${ctx}/images/talented.png"></div>
	<div class="case_center">
		<div class="centent_box">
			<div class="centent_t">
				<a href="advertise_info1.jsp" class="c_title">项目经理</a><span>2名</span>
			</div>
			<div class="centent_c">
				<span>岗位职责：<br />
					1、	熟悉机电按装、装饰行业，项目的实施、验收、回款等任务；<br />
					2、	熟悉国家、行业、地方的法律、规范和标准（建筑装饰设计通则和强制性条文），熟悉施工定额、工艺，在项目管理过程中具有严格执行公司各项管理程序、规定和要求的能力。<br />
					<a href="advertise_info1.jsp">更多...</a>
				</span>
			</div>
		</div>
		
		<div class="centent_box">
			<div class="centent_t">
				<a href="advertise_info2.jsp" class="c_title">安装预结算员</a><span>2名</span>
			</div>
			<div class="centent_c">
				<span>岗位职责：<br />
					1、精通工程造价及成本管理，具有一定现场施工经验、熟悉各种装饰材料的市场价格；<br />
					2、有现场预算跟踪经验，熟悉装饰工程施工工艺流程；<br />
					<a href="advertise_info2.jsp">更多...</a>
				</span>			
			</div>
		</div>
		<div class="centent_box">
			<div class="centent_t">
				<a href="advertise_info3.jsp" class="c_title">装饰预结算员</a><span>2名</span>
			</div>
			<div class="centent_c">
				<span>岗位职责：<br />
					1、精通工程造价及成本管理，具有一定现场施工经验、熟悉各种装饰材料的市场价格；<br />
					2、有现场预算跟踪经验，熟悉装饰工程施工工艺流程；<br />
					<a href="advertise_info3.jsp">更多...</a>
				</span>			
			</div>
		</div>
		<div class="centent_box">
			<div class="centent_t">
				<a href="advertise_info4.jsp" class="c_title">采购员</a><span>2名</span>
			</div>
			<div class="centent_c">
				<span>岗位职责：<br />
					1、按照公司规定的采购流程进行采购操作；<br />
					2、监控物料的市场变化，采取必要的采购技巧降低采购成本；<br />
					<a href="advertise_info4.jsp" >更多...</a>
				</span>			
			</div>
		</div>
		<div class="centent_box">
			<div class="centent_t">
				<a href="advertise_info5.jsp" class="c_title">仓库管理员</a><span>2名</span>
			</div>
			<div class="centent_c">
				<span>岗位职责：<br />
				1、信息系统数据的录入、填写和传递，相关单证、报表的整理和归档；<br />
				2、定期与仓库核对数据并实地盘点，检查监督出、入库手续；<br />
				<a href="advertise_info5.jsp" >更多...</a>
				</span>			
			</div>
		</div>

	</div>
	<div class="pages">
				<a href="#" class="selection">1</a>
				<a href="#">2</a>
				<a href="#">3</a>
				<a href="#">4</a>
				<a href="#">5</a>
		</div>
		<div class="clear"></div>
</div>

<%@include file="/html_jsp/common/footer.jsp"%>


</body>
</html>
