package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;

import com.javaavidity.bo.Employee;

public class Stream05_Sum {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// Find the sum of age of all employees
		printAgeSum(empList);

		// Print the total salaries
		printTotalSalaries(empList);

	}

	private static void printTotalSalaries(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		double sal = 0;
		for (Employee emp : empList) {
			sal = sal + emp.getSalary();
		}
		System.out.println("Sum of age " + sal);

		System.out.println("**** Java 8 ****");
		double sumSal = empList.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Sum of age " + sumSal);
	}

	private static void printAgeSum(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		Integer sum = 0;
		for (Employee emp : empList) {
			sum = sum + emp.getAge();
		}
		System.out.println("Sum of age " + sum);

		System.out.println("**** Java 8 ****");
		Integer sumAge = empList.stream().mapToInt(Employee::getAge).sum();
		System.out.println("Sum of age " + sumAge);
	}

}
