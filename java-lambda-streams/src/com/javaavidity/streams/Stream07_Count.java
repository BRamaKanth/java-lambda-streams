package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;

import com.javaavidity.bo.Employee;
/**
 * @author ramakanth.b
 */
public class Stream07_Count {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		//count no of person's whose age crossed 30
		countAgeAbove30(empList);

	}

	private static void countAgeAbove30(List<Employee> empList) {
		Long countAged = empList.stream().filter(e -> e.getAge() > 30).count();
		System.out.println("Total no of persons who crossed 30's is/are " + countAged);
	}

}
