package wafaa.springbootProject.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import wafaa.springbootProject.Repository.ProductRepository;
import wafaa.springbootProject.Service.ProductService;
import wafaa.springbootProject.model.Produit;

@RestController
public class productController {
	
	@Autowired
	
	private ProductService service;
	private ProductRepository repo;
	@GetMapping("/products")
	@CrossOrigin(origins = "http://localhost:4200/achat")
	public List<Produit> list(){
		return service.listAll();
	}
	
	@GetMapping("/product/{ref}")
	@CrossOrigin(origins = "http://localhost:4200/achat")

	public ResponseEntity <Produit> get(@PathVariable int ref) {
		try {
			Produit product = service.get(ref);
			return new ResponseEntity<Produit>(product , HttpStatus.OK);
			
		}catch (NoSuchElementException e){
			return new ResponseEntity<Produit>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/addproduct")
	@CrossOrigin(origins = "http://localhost:4200/achat")

	
	public void add(@RequestBody Produit product) {
		service.save(product);
	}

	
	@PutMapping("/updateproduct/{ref}")
	@CrossOrigin(origins = "http://localhost:4200/achat")

	
	public ResponseEntity<?> update(@RequestBody Produit product, @PathVariable int ref) {
		try {
			
			Produit existProduct = service.get(ref);
			
			service.save(product);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("/deleteproduct/{ref}")
	@CrossOrigin(origins = "http://localhost:4200/achat")

	public void delete(@PathVariable int ref) {
		
		service.delete(ref);
	}
	
//	public ResponseEntity<InputStreamResource> exportPDF(){
//		Optional<Produit> product
//		List<Produit> product= (List<Product>) repo.finfProductById(product.get().getRef());
//	}
//	
	
	
	
	
}
