package com.restart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmplyeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return Double.compare(e1.getSalary(), e2.getSalary());
	}

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(3, "john", 50000));
		emp.add(new Employee(1, "Alice", 60000));
		emp.add(new Employee(2, "Bob", 55000));

		Collections.sort(emp, new EmplyeeSalaryComparator());

		System.out.println("Sorted By Salary : ");
		for (Employee e : emp) {
			System.out.println(e);

		}

		// sorted by name
		Collections.sort(emp, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println("Sorted by name : ");
		for (Employee e : emp) {
			System.out.println(e);
		}

	}

}
