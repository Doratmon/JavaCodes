package com._520it.eclipse;

public class User {
	private String name;
	private Integer age;
	private Integer gender;
	
	
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public Integer getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args){
		
		System.out.println(new User("AA",1));
	}
	
	
	
	
	
}
