package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.javaavidity.bo.Employee;

public class Stream12_SortingByComperator {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// print the employees with age in ascending order
		sortByAge1(empList);

		System.out.println();
		sortByAge2(empList);

		System.out.println();
		// print the employees with age and Name in ascending order
		sortByAgeandName(empList);

	}

	private static void sortByAgeandName(List<Employee> empList) {
		Function<Employee, Integer> byAge = Employee::getAge;
		Function<Employee, String> byName = Employee::getName;
		empList.stream().sorted(Comparator.comparing(byAge).thenComparing(byName)).forEach(System.out::println);
	}

	private static void sortByAge2(List<Employee> empList) {
		Function<Employee, Integer> byAge = Employee::getAge;

		empList.stream().sorted(Comparator.comparing(byAge)).forEach(System.out::println);
	}

	private static void sortByAge1(List<Employee> empList) {
		empList.stream().sorted((e1, e2) -> e1.getAge() > e2.getAge() ? 1 : -1).forEach(System.out::println);
	}

}
