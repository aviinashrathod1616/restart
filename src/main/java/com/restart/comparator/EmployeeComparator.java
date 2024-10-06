package com.restart.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// first compare by Salary
		int salaryCompare = Double.compare(e1.getSalary(), e2.getSalary());

		// if salaries are equals

		if (salaryCompare == 1) {
			Integer.compare(e1.getAge(), e2.getAge());
		}

		return salaryCompare;
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", 30, 80000));
		employees.add(new Employee("Sapana", 25, 70000));
		employees.add(new Employee("Shaurya", 35, 50000));
		employees.add(new Employee("Rathod", 28, 85000));
		employees.add(new Employee("Rupali", 33, 65000));

		Collections.sort(employees, new EmployeeComparator());

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
