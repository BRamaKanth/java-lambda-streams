package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.javaavidity.bo.Employee;

public class Stream09_Set {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// stores names of employee in uppercase with in Set
		storeNamesinSet(empList);
	}

	private static void storeNamesinSet(List<Employee> empList) {
		Set<String> names = empList.stream().filter(e -> e.getAge() < 30).map(Employee::getName)
				.map(String::toUpperCase).collect(Collectors.toSet());

		names.parallelStream().forEach(System.out::println);
	}

}
