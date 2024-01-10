package com.xzc.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xzc.model.Goods;
import com.xzc.model.User;

public class DBUtil {
	public static Map<String, User> userMap = new HashMap<String, User>();

	public static List<Goods> goodsList = new ArrayList<Goods>();

	static {
		addUser(new User("xzc","123",10,"男",true));
		addUser(new User("123","123",10,"男",true));

		goodsList.add(new Goods("香蕉","夏威夷香蕉",100,400));
		goodsList.add(new Goods("衣服","非常好看",100,56));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",100,34));
		goodsList.add(new Goods("黄瓜","水果黄瓜",100,22));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",100,777));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",34,45));
		goodsList.add(new Goods("芒果","夏威夷香蕉",100,456));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",34,456));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",100,400));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",100,89));
		goodsList.add(new Goods("苹果","夏威夷香蕉",34,400));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",100,456));
		goodsList.add(new Goods("香肠","非常香",34,546));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",100,89));
		goodsList.add(new Goods("香蕉","夏威夷香蕉",23,400));
	}
	private static void addUser(User user) {
		userMap.put(user.getUsername(), user);
	}

}
