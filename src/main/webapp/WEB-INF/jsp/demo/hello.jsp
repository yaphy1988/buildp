<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="ai" uri="/WEB-INF/tag/ai-tags.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@ include file="/jsp/common/common_js.jsp"%>
<title>Insert title here</title>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<script type="text/javascript">
function open1(){
	$.dialog({
	    content: '如果定义了回调函数才会出现相应的按钮',
	    ok: function(){
	        this.title('3秒后自动关闭').time(3);
	        return false;
	    },
	    cancelVal: '关闭',
	    cancel: true /*为true等价于function(){}*/
	});
}
function open2(){
	$.dialog({
	    id: 'testID',
	    content: 'hello world!',
	    button: [
	        {
	            name: '同意',
	            callback: function(){
	                this.content('你同意了')
	                .button({
	                    id:'disBtn',
	                    name:'我变成有效按钮了',
	                    disabled: false
	                });
	                return false;
	            },
	            focus: true
	        },
	        {
	            name: '不同意',
	            callback: function(){
	                alert('你不同意')
	            }
	        },
	        {
	            id: 'disBtn',
	            name: '无效按钮',
	            disabled: true
	        },
	        {
	            name: '关闭我'
	        }
	    ]
	});
}
function open3(){
	$.dialog({title:'我是新标题'});
}
</script>
</head>
<body>
	<a href="javascript:open1();" >open1</a>
	<a href="javascript:open2();" >open2</a>
	<a href="javascript:open3();" >open3</a>
	
	<br/>
	ai:select标签：<br/>
	<ai:select dictId="CM_CUST.BRAND" name="brand" nullOption="true"  nullText="全部"></ai:select>
	<br/>
	ai:write标签(翻译)：<br/>
	<%request.setAttribute("brand", "10"); %>
	<ai:write dictId="CM_CUST.BRAND" name="brand"></ai:write> 
	
	
	<%
	java.util.List<String> brands = new java.util.ArrayList<String>();
	brands.add("10");
	brands.add("1");
	brands.add("2");
	brands.add("3");
	request.setAttribute("brands", brands); 
	%>
	<c:forEach items="${brands}" var="bra">
		<ai:write dictId="CM_CUST.BRAND" name="brand21" scope="value" code="${bra }"></ai:write> 
	</c:forEach>
	
	
	<br/>
	ai:radio标签：<br/>
	<ai:radio dictId="CM_CUST.BRAND" name="brand" defaultValue="${brand}"></ai:radio>
	<br/>
	ai:checkBox标签：<br/>
	<ai:checkBox dictId="CM_CUST.BRAND" name="brand" defaultValue="${brand}"></ai:checkBox>
	<ai:right url=""><button>审核</button></ai:right>
</body>
</html>