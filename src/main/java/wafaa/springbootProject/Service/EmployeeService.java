package wafaa.springbootProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafaa.springbootProject.Repository.EmployeeRepository;
import wafaa.springbootProject.model.Employee;
@Service

public class EmployeeService {
@Autowired
	
	private EmployeeRepository repo;
	
	public List<Employee> listAll(){
		return repo.findAll();
	}
	
	
	public void save(Employee employee) {
		repo.save(employee);
	}
	
	public Employee get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	


}
