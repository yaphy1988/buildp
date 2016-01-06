<%@ page language="java" pageEncoding="UTF-8"%>
<!-- left menu starts -->
<div class="col-sm-2 col-lg-2">
	<div class="sidebar-nav">
		<div class="nav-canvas">
			<div class="nav-sm nav nav-stacked"></div>
			<ul class="nav nav-pills nav-stacked main-menu"
				style="font-size: 14px;">
				<li class="nav-header">管理平台</li>

				<c:forEach items="${sessionScope.menulist}" var="li">
					<c:choose>
						<c:when test="${li.menuLevel=='0'}">
							<li class="ajax-link"><a href="${ctx}/${li.menuUrl}"> <span>${li.menuName}
								</span>
							</a></li>
						</c:when>

						<c:when test="${li.menuLevel=='1'}">
							<li class="accordion"><a href="#"><i
									class="glyphicon glyphicon-plus"></i><span>${li.menuName}</span></a>
								<ul class="nav nav-pills nav-stacked">
									<c:forEach items="${sessionScope.menulist}" var="leaf">
										<c:choose>
											<c:when test="${leaf.parentMenu==li.menuId}">
												<li  class="ajax-link"><a href="${ctx}/${leaf.menuUrl}">
														<span>${leaf.menuName}</span>
												</a></li>
											</c:when>
										</c:choose>
									</c:forEach>
								</ul></li>
						</c:when>
					</c:choose>
				</c:forEach>
			</ul>

		</div>
	</div>
</div>
<!--/span-->
<!-- left menu ends -->
<script>
	$(document).ready(function() {
	});
</script>