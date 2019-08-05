package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.javaavidity.bo.Employee;

/**
 * @author ramakanth.b
 */
public class Stream11_groupBy {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// Map with age as key ,and the list of employees having that age will fall into
		// that group

		groupByAge(empList);

	}

	private static void groupByAge(List<Employee> empList) {
		Map<Integer, List<Employee>> ageGroupmap = empList.stream().
				collect(Collectors.groupingBy(Employee::getAge));

		ageGroupmap.forEach((k, v) -> {
			System.out.println(k + "  " + v);
		});
	}

}
