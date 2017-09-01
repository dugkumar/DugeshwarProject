package com.myfunding.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myfunding.domain.Employee;
import com.myfunding.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	/* Get All data for Employee */

	@RequestMapping("/employee")
	public List<Employee> GetAllEmployee() {
		return employeeService.GetAllEmployee();

	}

	/* Get data for particular employee id */

	@RequestMapping("/employee/{id}")
	public Employee getTopic(@PathVariable String id) {

		return employeeService.getEmployee(id);
	}

	/* Save information in Employee */

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);

	}

	/* update data for particulat employee id */

	@RequestMapping(method = RequestMethod.PUT, value = "/employee/{id}")
	public void updatetopic(@RequestBody Employee employee, @PathVariable String id) {
		employeeService.updateemployee(id, employee);
	}

	/*
	 * Delete particulat id
	 */

	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
	public void deleteEmployee(@PathVariable String id) {

		employeeService.deleteEmployee(id);
	}

}
