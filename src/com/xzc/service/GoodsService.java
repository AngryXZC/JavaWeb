package com.xzc.service;

import java.util.List;

import com.xzc.dao.GoodsDao;
import com.xzc.model.Goods;

public class GoodsService {
	public List<Goods> selectAllGoods(){
		return new GoodsDao().getAllGoods();
	}
}
