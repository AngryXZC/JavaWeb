package com.xzc.dao;

import java.util.List;

import com.xzc.model.Goods;
import com.xzc.util.DBUtil;

public class GoodsDao {
	public List<Goods> getAllGoods(){
		return DBUtil.goodsList;
	}
}
