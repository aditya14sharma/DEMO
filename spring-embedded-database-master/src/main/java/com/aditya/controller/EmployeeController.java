package com.aditya.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.entity.Employee;
import com.aditya.repository.EmployeeRepository;

/**The is the controller class which contains rest end points.
 * first of all run "AddAll" so that employee's data is stored in the embedded h2 data base.
 * After that other api must be called.
 * All calls are GET calls.
 * @author aditya
 *
 */
@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	/**
	 * Save employee objects into embedded database.
	 * this should be the first call of api.
	 */
	@RequestMapping("/AddAll")
	public void addDataIntoDb(){
		@SuppressWarnings("deprecation")
		List<Employee> list = 	Arrays.asList(new Employee("Aditya",5000l,new Date(2019,11,01)),
				new Employee("Ashish",5000l,new Date(2019,11,01)),
				new Employee("Rahul",4000l,new Date(2019,12,01)),
				new Employee("Aakash",5400l,new Date(2018,11,01)),
				new Employee("Bhanu",6000l,new Date(2018,11,02)),
				new Employee("Kamal",7000l,new Date(2019,10,06)),
				new Employee("Sumil",7700l,new Date(2019,10,01)),
				new Employee("Rbs",8800l,new Date(2019,07,01)));

		employeeRepository.save(list);

	}
	
	

	/**Return all the employees
	 * @return list of employees
	 */
	@RequestMapping("/fetchAll")
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeRepository.findAll();
		
	}
	
	

	/**Return all the employees sorted by their name
	 * @return list of employees
	 */
	@RequestMapping("/sortByName")
	public List<Employee> getAllEmployeesNameSorted(){
		List<Employee> list= (List<Employee>) employeeRepository.findAll();
		if(list!= null)
		Collections.sort(list, (e1,e2)->e1.getName().compareTo(e2.getName()));
		return list;
		
	}
	
	

	/**Return all the employees sorted by their HireDate
	 * @return list of employees
	 */
	@RequestMapping("/sortByHireDate")
	public List<Employee> getAllEmployeesDateSorted(){
		List<Employee> list= (List<Employee>) employeeRepository.findAll();
		if(list!= null)
		Collections.sort(list, (e1,e2)->e1.getHireDate().compareTo(e2.getHireDate()));
		return list;		
	}
	

	/**Return all the employees sorted by their Salary
	 * @return list of employees
	 */
	@RequestMapping("/sortBySalary")
	public List<Employee> getAllEmployeesSalarySorted(){
		List<Employee> list= (List<Employee>) employeeRepository.findAll();
		if(list!= null)
		Collections.sort(list, (e1,e2)->e1.getSalary().compareTo(e2.getSalary()));
		return list;		
	}
	
	

}
