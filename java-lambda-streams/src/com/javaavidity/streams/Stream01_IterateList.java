package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;
import java.util.ListIterator;

import com.javaavidity.bo.Employee;

/**
 * @author ramakanth.b
 */
public class Stream01_IterateList {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		System.out.println("**** Using For Loop ****");
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));
		}

		System.out.println("**** Using enhanced For Loop ****");
		for (Employee emp : empList) {
			System.out.println(emp);
		}

		System.out.println("**** Using List Iterator ****");
		ListIterator<Employee> empIterator = empList.listIterator();
		while (empIterator.hasNext()) {
			System.out.println(empIterator.next());
		}

		System.out.println("**** Using Java 8 Streams ****");
		//using lambda expressions
		empList.stream().forEach(e->System.out.println(e));

		System.out.println("**** Using Java 8 Parallel Streams ****");
		// This will not maintain order
		// we are using method reference for printing 
		empList.parallelStream().forEach(System.out::println);

		
	}

}
