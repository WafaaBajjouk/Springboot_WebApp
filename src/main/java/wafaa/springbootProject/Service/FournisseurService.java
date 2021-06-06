package wafaa.springbootProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafaa.springbootProject.Repository.FournisseurRepository;
import wafaa.springbootProject.model.fournisseur;

@Service

public class FournisseurService {
	@Autowired
	
	private FournisseurRepository repo;
	
	public List<fournisseur> listAll(){
		return repo.findAll();
	}
	
	
	public void save(fournisseur fourn) {
		repo.save(fourn);
	}
	
	public fournisseur get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
