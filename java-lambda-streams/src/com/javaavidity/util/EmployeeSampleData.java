package com.javaavidity.util;

import java.util.ArrayList;
import java.util.List;

import com.javaavidity.bo.Employee;
import com.javaavidity.bo.Gender;

/**
 * 
 * @author ramakanth.b
 *
 *         Holds the Sample Data for the required operations
 */
public class EmployeeSampleData {

	public static List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<>();

		Employee emp1 = new Employee("EM001", "Pavan", 50000d, 26, Gender.MALE);
		Employee emp2 = new Employee("EM002", "Sapna", 60000d, 28, Gender.FEMALE);
		Employee emp3 = new Employee("EM003", "Vijay", 30000d, 35, Gender.MALE);
		Employee emp4 = new Employee("EM004", "Sanjay", 45000d, 29, Gender.MALE);
		Employee emp5 = new Employee("EM005", "Ramakanth", 80000d, 28, Gender.MALE);
		Employee emp6 = new Employee("EM006", "Hema", 37000d, 31, Gender.FEMALE);
		Employee emp7 = new Employee("EM007", "Silpa", 56000d, 26, Gender.FEMALE);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		empList.add(emp7);

		return empList;
	}

}
