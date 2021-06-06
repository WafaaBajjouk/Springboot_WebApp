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

import wafaa.springbootProject.Service.ClientService;
import wafaa.springbootProject.model.Client;
@RestController

public class ClientController {

	
@Autowired
	
	private ClientService service;
	
	@GetMapping("/clients")
	@CrossOrigin(origins = "http://localhost:4200/vente")
	public List<Client> list(){
		return service.listAll();
	}
	
	@GetMapping("/client/{id}")
	@CrossOrigin(origins = "http://localhost:4200/vente")

	public ResponseEntity <Client> get(@PathVariable int id) {
		try {
			Client client = service.get(id);
			return new ResponseEntity<Client>(client , HttpStatus.OK);
			
		}catch (NoSuchElementException e){
			return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/addclient")
	@CrossOrigin(origins = "http://localhost:4200/vente")

	
	public void add(@RequestBody Client client) {
		service.save(client);
	}

	
	@PutMapping("/updateclient/{id}")
	@CrossOrigin(origins = "http://localhost:4200/vente")

	
	public ResponseEntity<?> update(@RequestBody Client client, @PathVariable int id) {
		try {
			
			Client exist = service.get(id);
			
			service.save(client);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("/deleteclient/{id}")
	@CrossOrigin(origins = "http://localhost:4200/vente")

	public void delete(@PathVariable int id) {
		
		service.delete(id);
	}
	
}
