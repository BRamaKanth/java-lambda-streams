package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.javaavidity.bo.Employee;
import com.javaavidity.bo.Gender;

/**
 * 
 * @author ramakanth.b
 *  Des: Iterate with conditions
 */
public class Stream02_Filters {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// Example 1- print only male employees
		printMaleEmp(empList);

		// Example 2- Gender male And Age above 30
		printMalewithAge(empList);

		// Example 3-Gender male Or Age above 30
		printMaleAndAge(empList);

		// Example 4 - Male Emp Print 1 ,Female Emp print 0
     	printwithIfElse(empList);

	}

	private static void printwithIfElse(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		for (Employee emp : empList) {
			if (Gender.MALE.equals(emp.getGender())) {
				System.out.println(emp.getGender() + " 1");
			} else {
				System.out.println(emp.getGender() + " 0");
			}
		}

		System.out.println("**** Java 8 ****");
		Consumer<Employee> empData = e -> {

			if (Gender.MALE.equals(e.getGender())) {
				System.out.println(e.getGender() + " 1");
			} else {
				System.out.println(e.getGender() + " 0");
			}
		};

		empList.stream().forEach(empData);
	}

	private static void printMaleAndAge(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		for (Employee emp : empList) {
			if (Gender.MALE.equals(emp.getGender()) || emp.getAge() > 30) {
				System.out.println(emp);
			}
		}

		System.out.println("**** Java 8 ****");
		Predicate<Employee> predicateGender = e -> Gender.MALE.equals(e.getGender());
		Predicate<Employee> predicateAge = e -> e.getAge() > 30;

		empList.stream().filter(predicateGender.or(predicateAge)).forEach(System.out::println);
	}

	private static void printMalewithAge(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		for (Employee emp : empList) {
			if (Gender.MALE.equals(emp.getGender()) && emp.getAge() > 30) {
				System.out.println(emp);
			}
		}

		System.out.println("**** Java 8 ****");
		empList.stream().filter(e -> Gender.MALE.equals(e.getGender())).filter(e -> e.getAge() > 30)
				.forEach(System.out::println);
	}

	private static void printMaleEmp(List<Employee> empList) {
		System.out.println("**** Before Java 8 ****");
		for (Employee emp : empList) {
			if (Gender.MALE.equals(emp.getGender())) {
				System.out.println(emp);
			}
		}

		System.out.println("**** Java 8 ****");
		empList.stream().filter(e -> Gender.MALE.equals(e.getGender())).forEach(System.out::println);
	}

}
