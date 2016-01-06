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
		<div class="asks_buy_info_center">
			<div class="asks_buy_info_text advertise_add">
				<dl>
					<dt>招聘岗位：</dt>
					<dd>安装预结算员</dd>
				</dl>
				<dl>
					<dt>招聘人数：</dt>
					<dd><red>2</red>名</dd>
				</dl>
				<dl>
					<dt>岗位职责：</dt>
					<dd>1、根据图纸和工程施工现场勘察等依据，计算工程量，编制详细的工程预算书；<br />
						2、根据相关定额编制工程报价书和标书商务部分；<br />
						3、工程项目的预算控制、成本核算、材料管控；<br />
						4、根据现场签证、竣工图纸等，编制项目的决算并跟踪审计，和专业分包或施工班组确认最终施工价款；<br />
						5、 完成领导交办的其他任务。<br />
					</dd>
				</dl>
				<dl>
					<dt>岗位要求：</dt>
					<dd>1、专科以上学历，持预算员或造价员岗位证书，从事安装预算工作2年以上，能独立开展预算、报价工作；<br />
						2、熟练使用CAD制图及相关预算软件(广联达),工程量清单及上海定额和相关设备及建材市场行情;<br />
						3、工作认真负责，责任心强，吃苦耐劳，个性稳重细致。<br />
					</dd>
				</dl>

			</div>
		<div class="clear"></div>
		</div>
	</div>
</div>

<%@include file="/html_jsp/common/footer.jsp"%>

</body>
</html>
