package com.restart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee obj) {

		return Integer.compare(this.id, obj.id);
	}

	@Override
	public String toString() {
		return "EmployeeComparable [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(3, "john", 50000));
		emp.add(new Employee(1, "Alice", 60000));
		emp.add(new Employee(2, "Bob", 55000));

		Collections.sort(emp);

		for (Employee e : emp) {
			System.out.println(e);
		}

	}

}
