package com.xzc.util;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.xzc.model.Goods;

public class JsonTest {

	public static void main(String[] args) {

		// 序列化 持久化
//		Goods goods = new Goods("香蕉","夏威夷香蕉",100,400);
//		String json = JSON.toJSONString(goods);
//		System.out.println(json);
		//反序列化  json解析
//		String s = "{\"des\":\"夏威夷香蕉\",\"inventory\":400,\"name\":\"香蕉\",\"price\":100}";
//		Goods goods = JSON.parseObject(s, Goods.class);
//		System.out.println(goods.getName());
//		System.out.println(goods.getDes());
//		System.out.println(goods.getPrice());
//		System.out.println(goods.getInventory());

		String s = "[{" +
				"	\"name\":\"Midheal\"," +
				"	\"age\":20," +
				"	\"sex\":\"男\"" +
				"}," +
				"{" +
				"	\"name\":\"Micsdfheal\"," +
				"	\"age\":21," +
				"	\"sex\":\"男\"" +
				"}," +
				"{" +
				"	\"name\":\"Micsdfsdfeal\"," +
				"	\"age\":22," +
				"	\"sex\":\"男\"" +
				"}" +
				"]";
		List<UserTest> list = JSON.parseArray(s, UserTest.class);
		for(UserTest ut : list) {
			System.out.println(ut);
		}
	}
}
