package com.ai.buildp.web.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFiler implements Filter {

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession();
		
		if(session.getAttribute("Login_State")==null){
			//session的登录状态还没初始化，进行初始化
			session.setAttribute("Login_State", false);
		}
		
		boolean checkLogin=(Boolean) session.getAttribute("Login_State");
		if(true){
			//已登录成功过，可以访问其他任意页面
			chain.doFilter(request, response);//对于当前用户的请求进行放行
		}else{
			//未登录成功
			String uri=request.getRequestURI();


			if(uri.endsWith(".html")||uri.endsWith("/")||uri.endsWith("login.jsp")||uri.endsWith("getPasswordConstant")||uri.endsWith("checkname")||uri.endsWith("check")||uri.endsWith("checkCode")|| checkSuff(uri)||uri.contains("resources")){
				chain.doFilter(request, response);//对于当前用户的请求进行放行
			}else{
				//没有登录，并且访问的页面也不是登陆页面，重新跳转到登录页面
				String path=request.getContextPath();
				response.sendRedirect(path+"/login.jsp");
			}
			
		}

	}
	//判断是不是图片或js，或css
		public boolean checkSuff(String uri){
			//判断是否html_jsp文件夹下的文件
			String regex = ".+/html_jsp/.+";
			if(uri.matches(regex) || uri.endsWith("jpg") || uri.endsWith("gif")|| uri.endsWith("png")|| uri.endsWith("js")|| uri.endsWith("css")||uri.endsWith("verifyCode")){
				return true;
			}
			return false;
		}
	public void init(FilterConfig arg0) throws ServletException {

	}

	public void destroy() {

	}
}
