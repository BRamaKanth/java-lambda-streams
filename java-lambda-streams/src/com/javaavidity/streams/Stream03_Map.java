package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;

import com.javaavidity.bo.Employee;
import com.javaavidity.bo.Gender;
/**
 * @author ramakanth.b
 */
public class Stream03_Map {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// print only empids
		printEmpIds(empList);

		// print only female emp ids
		printFemaleEmpids(empList);

	}

	private static void printFemaleEmpids(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		for (Employee emp : empList) {
			if (Gender.FEMALE.equals(emp.getGender()))
				System.out.println(emp.getEmpId());
		}

		System.out.println("**** Java 8 ****");
		empList.stream().filter(e -> Gender.FEMALE.equals(e.getGender())).map(Employee::getEmpId)
				.forEach(System.out::println);
	}

	private static void printEmpIds(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		for (Employee emp : empList) {
			System.out.println(emp.getEmpId());
		}

		System.out.println("**** Java 8 ****");
		empList.stream().map(Employee::getEmpId).forEach(System.out::println);
	}

}
