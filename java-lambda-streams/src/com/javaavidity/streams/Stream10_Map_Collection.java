package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.javaavidity.bo.Employee;

/**
 * @author ramakanth.b
 */
public class Stream10_Map_Collection {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// convert list of employees into Map with empid as key and sal as value
		listToMap(empList);

		// convert list of employees into Map with empid as key and Object as value
		listToObjectMap(empList);
	}

	private static void listToObjectMap(List<Employee> empList) {
		Map<String, Employee> empMap = empList.stream()
				.collect(Collectors.toMap(Employee::getEmpId, Function.identity()));

		empMap.entrySet().stream().forEach(entry -> {
			System.out.println(" key is " + entry.getKey() + " value is " + entry.getValue());
		});
	}

	private static void listToMap(List<Employee> empList) {
		Map<String, Double> empMap = empList.stream()
				.collect(Collectors.toMap(Employee::getEmpId, Employee::getSalary));

		empMap.forEach((k, v) -> {
			System.out.println(" key is " + k + " value is " + v);
		});
	}

}
