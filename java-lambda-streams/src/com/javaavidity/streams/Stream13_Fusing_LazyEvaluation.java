package com.javaavidity.streams;

import static com.javaavidity.util.EmployeeSampleData.getEmpList;

import java.util.List;

import com.javaavidity.bo.Employee;

/**
 * 
 * @author ramakanth.b 
 * fusing - all the intermediate operations are combined and executed at once on each element ,
 *  lazy - no work is done until and unless its needed.Elements after Pavan were not evaluated ,
 *  Kindly run by removing the findAny() (Terminal operation) , stream will not run
 */
public class Stream13_Fusing_LazyEvaluation {

	public static void main(String[] args) {
		List<Employee> empList = getEmpList();

		// find a Employee who's age is above 27 and names is more than 4 lettes
		System.out.println(empList.stream().filter(Stream13_Fusing_LazyEvaluation::ageCheck)
				.filter(Stream13_Fusing_LazyEvaluation::nameCheck).findAny());

	}

	public static boolean ageCheck(Employee employee) {

		System.out.println("Evaulating EMP age " + employee.getName());

		return employee.getAge() > 24;
	}

	public static boolean nameCheck(Employee employee) {
		System.out.println("Evaulating EMP name " + employee.getName());

		return employee.getName().length() > 4;
	}

}
