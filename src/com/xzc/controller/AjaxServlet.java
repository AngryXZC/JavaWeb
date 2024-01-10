package com.xzc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ajaxrequest")
public class AjaxServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("�յ���ajax����:"+req.getParameter("data"));
		resp.setContentType("text/html; charset=utf-8");
		resp.getWriter().append("��������");
	}
}
