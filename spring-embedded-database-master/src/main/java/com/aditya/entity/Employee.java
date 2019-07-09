package com.aditya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**Entity class which maps to the Table EMPLOYEE in embedded db.
 * @author aditya
 *
 */
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="EmployeeName")
	private String name; 
	
	@Column(name="Salary")
	private Long salary;
	
	@Column(name="HireDate")
	private Date hireDate;
	
	public Employee(String name,Long salary,Date hireDate){
		this.name=name;
		this.salary=salary;
		this.hireDate=hireDate;
	}
	
	public Employee(){}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Long getSalary() {
		return salary;
	}

	public Date getHireDate() {
		return hireDate;
	}
	
}
