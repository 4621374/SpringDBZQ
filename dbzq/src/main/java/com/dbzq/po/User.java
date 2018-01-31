package com.dbzq.po;

public class User {
	private String username;
	private int age;
	private int id;
	public User(String name, int age) {
		super();
		this.username = name;
		this.age = age;
	}
	public User() {
		super();
	}
	public User(String name, int age, int id) {
		super();
		this.username = name;
		this.age = age;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	@Override
	public String toString() {
		return "User [name=" + username + ", age=" + age + ", id=" + id + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
