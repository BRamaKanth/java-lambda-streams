package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;
import java.util.Optional;

import com.javaavidity.bo.Employee;

public class Stream06_Max_Min {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// find the person who has highest salary
		printHigestSalEmp(empList);

		// find the person who has lowest salary
		printLowestSalEmp(empList);
	}

	private static void printHigestSalEmp(List<Employee> empList) {
		// Implementing the comparator under max function
		Optional<Employee> emp = empList.stream().max((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1);
		if (emp.isPresent()) {
			System.out.println("Highest Salary " + emp.get());
		}
	}

	private static void printLowestSalEmp(List<Employee> empList) {
		// Implementing the comparator under max function
		Optional<Employee> emp = empList.stream().min((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1);
		if (emp.isPresent()) {
			System.out.println("Highest Salary " + emp.get());
		}
	}

}
