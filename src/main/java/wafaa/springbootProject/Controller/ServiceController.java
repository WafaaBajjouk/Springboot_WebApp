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

import wafaa.springbootProject.Service.ServService;
import wafaa.springbootProject.model.Serv;
@RestController

public class ServiceController {
	@Autowired
	
	private ServService service;
	
	@GetMapping("/services")
	@CrossOrigin(origins = "http://localhost:4200/service")
	public List<Serv> list(){
		return service.listAll();
	}
	
	@GetMapping("/service/{id}")
	@CrossOrigin(origins = "http://localhost:4200/service")

	public ResponseEntity <Serv> get(@PathVariable int id) {
		try {
			Serv serv = service.get(id);
			return new ResponseEntity<Serv>(serv , HttpStatus.OK);
			
		}catch (NoSuchElementException e){
			return new ResponseEntity<Serv>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/addservice")
	@CrossOrigin(origins = "http://localhost:4200/service")

	
	public void add(@RequestBody Serv serv) {
		service.save(serv);
	}

	
	@PutMapping("/updateservice/{id}")
	@CrossOrigin(origins = "http://localhost:4200/service")

	
	public ResponseEntity<?> update(@RequestBody Serv serv, @PathVariable int id) {
		try {
			
			Serv exist = service.get(id);
			
			service.save(serv);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("/deleteservice/{id}")
	@CrossOrigin(origins = "http://localhost:4200/service")

	public void delete(@PathVariable int id) {
		
		service.delete(id);
	}
	

}
