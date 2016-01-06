<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>用户管理</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="auth manage">
<meta name="author" content="yaphy">
<%@include file="/WEB-INF/jsp/common/common_css.jsp"%>
<script src="${ctx}/resources/js/manager/authmanage.js"></script>
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
									查看管理用户信息。 
									<button id="addBtn" class="btn btn-success btn-sm">
									    	添加
									</button>
									<input type="hidden" id="optResult" value="${optResult}"/>
									<input id="addSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;添加成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
				                    </input>
				                    <input id="FailMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;操作失败，请重试或联系管理人员！&quot;,&quot;layout&quot;:&quot;center&quot;,&quot;type&quot;:&quot;error&quot;}">
				                    </input>
				                    <input id="editSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;修改保存成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
				                    </input>
				                    <input id="delSuccessMsg"  type="hidden" class="btn btn-primary noty" data-noty-options="{&quot;text&quot;:&quot;删除成功！&quot;,&quot;layout&quot;:&quot;top&quot;,&quot;type&quot;:&quot;information&quot;}">
				                    </input>
								</div>
								<table class="table table-striped table-bordered bootstrap-datatable datatable responsive">
									<thead>
									<tr>
										<th>工号</th>
										<th>用户名</th>
										<th>称呼</th>
										<th>创建时间</th>
										<th>操作</th>	
									</tr>
									</thead>
									<tbody>
									<c:forEach items="${users}" var="user"  varStatus="status">
									
									<tr>
										<td class="center">${user.userId}</td>
										<td class="center">${user.userCode}</td>
										<td class="center">${user.userName}</td>
										<td class="center"><fmt:formatDate value="${user.createTime}" pattern="yyyy/MM/dd  HH:mm:ss" /></td>
										<td class="center"><input type="hidden" name="roleid" value="${role.roleId}"><a class="btn btn-info btn-edit" href="#"> <i
														class="glyphicon glyphicon-edit icon-white"></i> 编辑权限
												</a> <a class="btn btn-danger btn-setting" href="#"> <i
														class="glyphicon glyphicon-trash icon-white"></i> 删除
												</a>
										</td>
									</tr>
									</c:forEach>
									</tbody>
								</table>
								
							</div>
						</div>
					</div>
					<!--/span-->

				</div>
				<!--/row-->

				<!-- content ends -->
			</div>
		</div>
		<div class="modal fade" id="permissionEdit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
	        <div class="modal-dialog">
	            <div class="modal-content">
	                <div class="modal-header">
	                    <button type="button" class="close" data-dismiss="modal">×</button>
	                    <h3>角色的菜单权限</h3>
	                </div>
	                <div class="modal-body">
	                    <table class="table table-bordered table-striped responsive">
									<thead>
									<tr>
										<th>选择</th>
										<th>菜单编码</th>
										<th>菜单名称</th>
										<th>菜单说明</th>	
									</tr>
									</thead>
									<tbody>
									<c:forEach items="${allMenus}" var="menu"  varStatus="status">
									<tr>
										<td><div class="checkbox"><label><input type="checkbox" name="myCheckBox" value="${menu.menuId}">&nbsp&nbsp&nbsp&nbsp</label></div>
										</td>
										<td>${menu.menuId}</td>
										<td>${menu.menuName}</td>
										<td>${menu.remark}</td>
									</tr>
									</c:forEach>
									</tbody>
								</table>
	                </div>
	                <div class="modal-footer">
	                    <a href="#" class="btn btn-primary btn-permission-save" data-dismiss="modal">保存</a>
	                    <a href="#" class="btn btn-default btn-permission-cancle" data-dismiss="modal">取消</a>
	                </div>
	            </div>
	        </div>
	    </div>
	    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>删除用户</h3>
					</div>
					<div class="modal-body">
						<p>是否删除</p>
					</div>
					<div class="modal-footer">
						<a href="#" class="btn btn-primary" data-dismiss="modal">确定</a>
						<a href="#" class="btn btn-default" data-dismiss="modal">取消</a>
					</div>
				</div>
			</div>
		</div>
		
		<!-- 添加用户 S-->
		<div class="modal fade" id="user-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">×</button>
						<h3>添加用户信息</h3>
					</div>
					<div class="box-content">
						<div class="box-content">
							<form action="addUser" method="post">
								<table>
									<tr>
										<td>用户名：</td>
										<td>
											<input style="width:250px" type="text" class="form-control" id="userCode" name="userCode" onblur="check_code();">
										</td>
										<td>
										<span class="required">*</span>
										<div id="useCode_msg"  style="float:left"></div>
										</td>
										
									</tr>
									<tr>
										<td>称&nbsp;&nbsp;&nbsp;呼：</td>
										<td>
											<input style="width:250px" type="text" class="form-control" id="inputSuccess1" name="userName">
										</td>
									</tr>
									<tr>
										<td>角&nbsp;&nbsp;&nbsp;色：</td>
										<td>
											<%@include file="/WEB-INF/jsp/component/role_comp.jsp"%>
										</td>
									</tr>
									<tr>
										<td>密&nbsp;&nbsp;&nbsp;码：</td>
										<td>
											<input style="width:250px" type="password" class="form-control" id="passWord1" name="passWord" onblur="check_passwd();">
										</td>
										<td>
										<span class="required">*</span>
										<div id="passwd_msg"  style="float:left"></div>
										</td>
									</tr>
									<tr>
										<td>确认密码：</td>
										<td>
											<input style="width:250px" type="password" class="form-control" id="passWord2" onblur="conf_passwd();">
										</td>
										<td>
										<span class="required">*</span>
										<div id="conf_passwd_msg"  style="float:left"></div>
										</td>
									</tr>
									<input type="hidden" name="createUser" value="${user.userId }"/>
									<tr>
										<td>
											<button type="submit" class="btn btn-default">添加</button>
										</td>
										<td>
											<button type="reset" class="btn btn-default">重置</button>
										</td>
									</tr>
								</table>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 添加用户 E-->
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
	</style>
		<%@include file="/WEB-INF/jsp/common/footer.jsp"%>
	</div>
	<!--/.fluid-container-->
	<%@include file="/WEB-INF/jsp/common/common_js.jsp"%>
</body>
</html>
