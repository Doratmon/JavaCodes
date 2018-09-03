package com._520it._01_input;

public class ConsoleDemo {

	private String name;
	private int age;
	

	public ConsoleDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Console [name=" + name + ", age=" + age + "]";
	}
	
}
