package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;
import java.util.Optional;

import com.javaavidity.bo.Employee;

public class Stream04_Reduce {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// count all members salaries
		printTotalSalaries(empList);
	}

	private static void printTotalSalaries(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		double total = 0.0d;
		for (Employee emp : empList) {
			total = total + emp.getSalary();
		}
		System.out.println("The Sum is " + total);

		System.out.println("**** Java 8 ****");
		Optional<Double> totalsum = empList.parallelStream().map(Employee::getSalary)
				.reduce((accumulated, sal) -> accumulated + sal);
		System.out.println("The Total Sum is " + (totalsum.isPresent() ? totalsum.get() : 0.0d));
	}

}
