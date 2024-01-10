package com.xzc.model;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

//public class User implements HttpSessionBindingListener {
public class User  {
	private String username;
	private String password;
	private int age;
	private String sex;
	private boolean isAdmin=false;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public User(String username, String password, int age, String sex, boolean isAdmin) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.isAdmin = isAdmin;
	}
//监听器：实现HttpSessionBindingListener接口
//	@Override
//	public void valueBound(HttpSessionBindingEvent arg0) {
//		System.out.println("valueBound"+arg0.getName()+":"+arg0.getValue());
//	}
//
//	@Override
//	public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
//		System.out.println("valueUnbound");
//	}

}
