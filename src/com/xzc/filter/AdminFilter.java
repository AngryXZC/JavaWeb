package com.xzc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xzc.model.User;

public class AdminFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpServletResponse httpResp = (HttpServletResponse) resp;
		Object o = httpReq.getSession().getAttribute("user");
		if(o==null) {//没有登录
			httpResp.sendRedirect(httpReq.getContextPath()+"/index.jsp");
		}else {//当前已经登录
			User u = (User) o;
			if(u.isAdmin()) {//是管理员
				chain.doFilter(req, resp);//放行
			}else {
				httpResp.sendRedirect(httpReq.getContextPath()+"/index.jsp");
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
