package com.springboot.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String fullname;
	private String department;
	private String salary;

	public Long getId() {
		return id;
	}

	public String getFullname() {
		return fullname;
	}

	public String getDepartment() {
		return department;
	}

	public String getSalary() {
		return salary;
	}

}
