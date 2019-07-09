package com.aditya.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aditya.entity.Employee;

/**Repository class where custom fetch methods can be written.
 * @author aditya
 *
 */
@Repository
public interface  EmployeeRepository extends CrudRepository<Employee, Long>{

}
