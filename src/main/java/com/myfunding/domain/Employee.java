package com.myfunding.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeD")
public class Employee {
@Id
	private String id;
	private String name;
	

	public Employee() {
		super();
	}

	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
