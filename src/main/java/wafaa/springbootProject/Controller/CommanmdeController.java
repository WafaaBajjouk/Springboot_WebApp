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

import wafaa.springbootProject.Service.CommandeService;
import wafaa.springbootProject.model.Commande;

@RestController

public class CommanmdeController {
	
@Autowired
	
	private CommandeService service;
	@GetMapping("/commandes")
	@CrossOrigin(origins = "http://localhost:4200/commandes")
	public List<Commande> list(){
		return service.listAll();
	}
	
	@GetMapping("/commandes/{ref}")
	@CrossOrigin(origins = "http://localhost:4200/commande")

	public ResponseEntity <Commande> get(@PathVariable int ref) {
		try {
			Commande commande = service.get(ref);
			return new ResponseEntity<Commande>(commande , HttpStatus.OK);
			
		}catch (NoSuchElementException e){
			return new ResponseEntity<Commande>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/addcommande")
	@CrossOrigin(origins = "http://localhost:4200/commande")

	
	public void add(@RequestBody Commande commande) {
		service.save(commande);
	}

	
	@PutMapping("/updatecommande/{ref}")
	@CrossOrigin(origins = "http://localhost:4200/commande")

	
	public ResponseEntity<?> update(@RequestBody Commande commande, @PathVariable int ref) {
		try {
			
			Commande exist = service.get(ref);
			
			service.save(commande);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("/deletecommande/{ref}")
	@CrossOrigin(origins = "http://localhost:4200/commande")

	public void delete(@PathVariable int ref) {
		
		service.delete(ref);
	}
	
	
	

}
