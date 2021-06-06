package wafaa.springbootProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wafaa.springbootProject.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
