package com.myfunding.databasereository;

import org.springframework.data.repository.CrudRepository;

import com.myfunding.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,String>{
	

}
