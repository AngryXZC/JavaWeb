package com.xzc.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
//单点登录实现
public class SessionManager {
	public static Map<String,HttpSession> sessionMap = new HashMap<String,HttpSession >();
}
