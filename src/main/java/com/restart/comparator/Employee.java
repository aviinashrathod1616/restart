package com.restart.comparator;

public class Employee {
	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	

}
