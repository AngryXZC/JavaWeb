package com.xzc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xzc.model.Goods;
import com.xzc.service.GoodsService;

@WebServlet("/admin/goods_list")
public class GoodsListServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Goods> list = new GoodsService().selectAllGoods();
		req.setAttribute("list", list);
		req.getRequestDispatcher("/admin/goods_list.jsp").forward(req, resp);
	}
}
