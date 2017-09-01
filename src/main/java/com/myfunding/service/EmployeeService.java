package com.myfunding.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfunding.databasereository.EmployeeRepository;
import com.myfunding.domain.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository topicRepository;

	public List<Employee> GetAllEmployee() {
		List<Employee> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Employee getEmployee(String id) {
		return topicRepository.findOne(id);
	}

	public void addEmployee(Employee employee) {
		topicRepository.save(employee);

	}

	public void updateemployee(String id, Employee employee) {
		topicRepository.save(employee);

	}

	public void deleteEmployee(String id) {
		topicRepository.delete(id);
	}

}
