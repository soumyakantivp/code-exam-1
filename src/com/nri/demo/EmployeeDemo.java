package com.nri.demo;

import java.util.Collections;
import java.util.List;

import com.nri.model.Employee;

public class EmployeeDemo {
	
	// method to print Employee list
	public void showEmployeeList(List<Employee> empList, String msg) {
		System.out.println("\n"+msg);
		empList.forEach((e) -> System.out.println(e));
	}
	
	// 1. i) Create collection of employee objects and get it sorted w.r.t. empsalary attribute.
	public void sortEmployeeBySalary(List<Employee> empList) {
		Collections.sort(empList, (e1, e2) -> (int) (e1.getEmpsalary() - e2.getEmpsalary()));
	}
	
	// 2. ii) Sort the collection created with respect to empname and empid attributes.
	public void sortEmployeeByNameAndById(List<Employee> empList) {
		Collections.sort(empList, (e1, e2) ->{
			if(e1.getEmpname().compareTo(e2.getEmpname()) == 0) { // if Employees have same name then sort by ID
				return e1.getEmpid()-e2.getEmpid();
			}
			return e1.getEmpname().compareTo(e2.getEmpname());
		});
	}	
}
