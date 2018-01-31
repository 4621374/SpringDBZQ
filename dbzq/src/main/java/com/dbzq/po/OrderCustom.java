package com.dbzq.po;

public class OrderCustom extends Order {
	@Override
	public String toString() {
		
		return "OrderCustom [username=" + username + ", age=" + age + "]"+super.toString();
	}
	private String username;
	private int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
