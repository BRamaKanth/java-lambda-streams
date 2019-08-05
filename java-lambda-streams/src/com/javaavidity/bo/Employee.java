package com.javaavidity.bo;

/**
 * @author ramakanth.b
 */
public class Employee {

	private String empId;
	private String name;
	private Double salary;
	private int age;
	private Gender gender;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender="
				+ gender + "]";
	}

	public Employee(String empId, String name, Double salary, int age, Gender gender) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getters & setters
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Employee() {
		super();
	}

}
