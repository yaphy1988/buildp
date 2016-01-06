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
					<dd>采购员</dd>
				</dl>
				<dl>
					<dt>招聘人数：</dt>
					<dd><red>2</red>名</dd>
				</dl>
				<dl>
					<dt>岗位职责：</dt>
					<dd>1、按照公司规定的采购流程进行采购操作；<br />
						2、项目的材料成本；<br />
						3、监控物料的市场变化，采取必要的采购技巧降低采购成本；<br />
						4、及时协调解决采购物料过程中所产生的供货及质量问题；<br />
						5、控制材料供应商的联络和管控，保证材料种类齐全；<br />
						6、定期进行市场调研，开拓渠道，进行供应商评估。<br />
						7、开展采购装饰材料的质量检验工作；<br />
						8、配合仓库开展采购材料的入库工作。<br />
					</dd>
				</dl>
				<dl>
					<dt>岗位要求：</dt>
					<dd>1、男性，中及以上学历，建筑装饰行业3年以上采购工作经验，采购经验丰富者可适当放宽学历要求；<br />
						2、熟悉建筑装饰行业材料体系，熟悉相应的材料知识和特性，对室内外施工装潢装饰工艺有一定了解；<br />
						3、性格外向，沟通协调能力强；<br />
						4、责任心强，能承受较强的工作压力；<br />
						5、熟练使用办公软件；<br />
						6、有良好的职业道德和敬业精神。<br />
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
