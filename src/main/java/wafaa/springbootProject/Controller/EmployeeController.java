package wafaa.springbootProject.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import wafaa.springbootProject.Service.EmployeeService;
import wafaa.springbootProject.model.Employee;
@RestController

public class EmployeeController {

	@Autowired
	
	private EmployeeService service;
	
	@GetMapping("/employees")
	@CrossOrigin(origins = "http://localhost:4200/rh")
	public List<Employee> list(){
		return service.listAll();
	}
	
	@GetMapping("/employee/{id}")
	@CrossOrigin(origins = "http://localhost:4200/rh")

	public ResponseEntity <Employee> get(@PathVariable int id) {
		try {
			Employee employee = service.get(id);
			return new ResponseEntity<Employee>(employee , HttpStatus.OK);
			
		}catch (NoSuchElementException e){
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/addemployee")
	@CrossOrigin(origins = "http://localhost:4200/rh")

	
	public void add(@RequestBody Employee employee) {
		service.save(employee);
	}

	
	@PutMapping("/updateemployee/{id}")
	@CrossOrigin(origins = "http://localhost:4200/rh")

	
	public ResponseEntity<?> update(@RequestBody Employee employee, @PathVariable int id) {
		try {
			
			Employee existEmployee = service.get(id);
			
			service.save(employee);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	@CrossOrigin(origins = "http://localhost:4200/rh")

	public void delete(@PathVariable int id) {
		
		service.delete(id);
	}
	
}
