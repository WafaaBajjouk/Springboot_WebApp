package wafaa.springbootProject.Service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafaa.springbootProject.Repository.ProductRepository;
import wafaa.springbootProject.model.Produit;
@Service
public class ProductService {
	
	@Autowired
	
	private ProductRepository repo;
	
	public List<Produit> listAll(){
		return repo.findAll();
	}
	
	
	public void save(Produit product) {
		repo.save(product);
	}
	
	public Produit get(int ref) {
		return repo.findById(ref).get();
	}
	
	public void delete(int ref) {
		repo.deleteById(ref);
	}
	
	public List<Produit> getProduitList() {

		List<Produit> list = repo.findAll();
		return list.stream().map(pro -> {
			Produit vo = new Produit();
			vo.setRef(pro.getRef());
			vo.setName(pro.getName());
			vo.setName(pro.getName());
			vo.setInfo(pro.getInfo());			
			vo.setPrice(pro.getPrice());
			return vo;
		}).collect(Collectors.toList());

	}

}
