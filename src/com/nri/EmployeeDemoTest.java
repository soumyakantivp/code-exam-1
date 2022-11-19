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
	// Object of EmployeeDemo class
	private static EmployeeDemo employeeDemo;

	// method to initialize Employee data
	public static void initializeData() {
		// Dummy address data
		Address addr1 = new Address(1, "Wall Street", "Manhattan", "New York", 12345);
		Address addr2 = new Address(2, "Park Street", "Kolkata", "West Bengal", 54321);
		Address addr3 = new Address(3, "Castle Road", "Kings Landing", "Westros", 77777);
		
		// Dummy Employee Data
		empList = new LinkedList<Employee>(Arrays.asList(
				new Employee("Soumya", 1, addr1, 15000),
				new Employee("Sandeep Sir", 2, addr2, 1000000), 
				new Employee("Jamie Lannister", 3, addr3, 35000),
				new Employee("Anuska", 4, addr1, 15000),
				new Employee("Anuska", 5, addr2, 15000)
			));
		
		// initialized object of EmployeeDemo class
		employeeDemo = new EmployeeDemo();
		
		// print initialized Employee List
		employeeDemo.showEmployeeList(empList, "# Employee List initialized...");
	}
	
	// main method to test EmployeeDemo
	public static void main(String[] args){
		initializeData();
		
		// 1. i) Create collection of employee objects and get it sorted w.r.t. empsalary attribute.
		employeeDemo.sortEmployeeBySalary(empList);
		employeeDemo.showEmployeeList(empList, "# Employee List after sorting based on employee salary in ascending order");
		// 2. ii) Sort the collection created with respect to empname and empid attributes.
		employeeDemo.sortEmployeeByNameAndById(empList);
		employeeDemo.showEmployeeList(empList, "# Employee List after sorting based on empname and empid attributes");
	}


}
