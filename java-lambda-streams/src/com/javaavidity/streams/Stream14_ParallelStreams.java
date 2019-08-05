package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;

import com.javaavidity.bo.Employee;

/**
 * 
 * @author ramakanth.b
 * Date-05/08/2019
 */
public class Stream14_ParallelStreams {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// find a Employee who's age is above 27 and names is more than 4 lettes
		System.out.println(empList.parallelStream().filter(Stream13_Fusing_LazyEvaluation::ageCheck)
				.filter(Stream13_Fusing_LazyEvaluation::nameCheck).findAny());

	}

	public static boolean ageCheck(Employee employee) {

		System.out.println("Evaulating EMP age " + employee.getAge());

		return employee.getAge() > 24;
	}

	public static boolean nameCheck(Employee employee) {
		System.out.println("Evaulating EMP name " + employee.getName());

		return employee.getName().length() > 4;
	}

}
