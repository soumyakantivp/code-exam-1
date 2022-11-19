package com.nri;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.nri.demo.EmployeeDemo;
import com.nri.model.Address;
import com.nri.model.Employee;

public class EmployeeDemoTest {
	// List to store Employees
	private static List<Employee> empList;

	// method to initialize Employee data
	public static void initializeData() {
		// Dummy address data
		Address addr1 = new Address(1, "Wall Street", "Manhattan", "New York", 12345);
		Address addr2 = new Address(2, "Park Street", "Kolkata", "West Bengal", 54321);
		Address addr3 = new Address(3, "Castle Road", "Kings Landing", "Westros", 77777);
		
		empList = new LinkedList<Employee>(Arrays.asList(new Employee("Soumya", 1, addr1, 15000),
				new Employee("Sandeep Sir", 2, addr2, 1000000), new Employee("Jamie Lannister", 3, addr3, 35000)));
		
		System.out.println("# Employee List initialized...");
		empList.forEach((e) -> System.out.println(e));
	}
	public static void main(String[] args){
		initializeData();
		EmployeeDemo employeeDemo = new EmployeeDemo();
		// 1. i) Create collection of employee objects and get it sorted w.r.t. empsalary attribute.
		employeeDemo.sortEmployeeBySalary(empList);
		// 2. ii) Sort the collection created with respect to empname and empid attributes.
		employeeDemo.sortEmployeeByNameAndById(empList);
	}


}
