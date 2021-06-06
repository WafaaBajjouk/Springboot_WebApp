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

import wafaa.springbootProject.Service.FournisseurService;
import wafaa.springbootProject.model.fournisseur;

@RestController

public class FournisseurController {

@Autowired
	
	private FournisseurService service;
	
	@GetMapping("/fournisseurs")
	@CrossOrigin(origins = "http://localhost:4200/fournisseur")
	public List<fournisseur> list(){
		return service.listAll();
	}
	
	@GetMapping("/fournisseur/{id}")
	@CrossOrigin(origins = "http://localhost:4200/fournisseur")

	public ResponseEntity <fournisseur> get(@PathVariable int id) {
		try {
			fournisseur fournisseur = service.get(id);
			return new ResponseEntity<fournisseur>(fournisseur , HttpStatus.OK);
			
		}catch (NoSuchElementException e){
			return new ResponseEntity<fournisseur>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/addfournisseur")
	@CrossOrigin(origins = "http://localhost:4200/fournisseur")

	
	public void add(@RequestBody fournisseur fourn) {
		service.save(fourn);
	}

	
	@PutMapping("/updatefournisseur/{id}")
	@CrossOrigin(origins = "http://localhost:4200/fournisseur")

	
	public ResponseEntity<?> update(@RequestBody fournisseur fourn, @PathVariable int id) {
		try {
			
			fournisseur exist = service.get(id);
			
			service.save(fourn);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("/deletefournisseur/{id}")
	@CrossOrigin(origins = "http://localhost:4200/fournisseur")

	public void delete(@PathVariable int id) {
		
		service.delete(id);
	}
	
}
