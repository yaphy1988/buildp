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
					<dd>仓库管理员</dd>
				</dl>
				<dl>
					<dt>招聘人数：</dt>
					<dd><red>2</red>名</dd>
				</dl>
				<dl>
					<dt>岗位职责：</dt>
					<dd>1、信息系统数据的录入、填写和传递，相关单证、报表的整理和归档；<br />
						2、定期与仓库核对数据并实地盘点，检查监督出、入库手续；<br />
						3、完成上级交办的其他工作。<br />
					</dd>
				</dl>
				<dl>
					<dt>岗位要求：</dt>
					<dd>1、中专及以上学历，物流仓储类相关专业；<br />
						2、能适应出差、2年以上装饰公司库管工作经验优先；<br />
						3、熟悉仓储库存管理流程，掌握进销存管理基本知识；<br />
						4、熟练操作办公管理软件；<br />
						5、良好的沟通、分析能力及团队合作精神，工作认真，责任心强。<br />
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
