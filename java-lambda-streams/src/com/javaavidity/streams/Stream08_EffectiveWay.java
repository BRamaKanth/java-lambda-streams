package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.javaavidity.bo.Employee;

public class Stream08_EffectiveWay {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// Collect the emp names into new list (uppercase) and print them

		collectNamesWrongWay(empList);

		collectNamesRightWay(empList);

	}


	/**
	 * 
	 * @param empList
	 * 
	 *  The foreach using as the terminal operation in stream causes
	 *  side-effect,mutating,can't make this concurrent.
	 *   Avoid this way
	 */
	private static void collectNamesWrongWay(List<Employee> empList) {
		List<String> names = new ArrayList<>();
		empList.stream().filter(e1 -> e1.getAge() < 30).map(Employee::getName).map(String::toUpperCase)
				.forEach(names::add);
		names.stream().forEach(System.out::println);
	}

	private static void collectNamesRightWay(List<Employee> empList) {
		List<String> names = empList.stream().filter(e1 -> e1.getAge() < 30).map(Employee::getName)
				.map(String::toUpperCase).collect(Collectors.toList());
		names.stream().forEach(System.out::println);
	}

}
