package wafaa.springbootProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafaa.springbootProject.Repository.CommandeRepository;
import wafaa.springbootProject.model.Commande;

@Service

public class CommandeService {
	
@Autowired
	
	private CommandeRepository repo;
	
	public List<Commande> listAll(){
		return repo.findAll();
	}
	
	
	public void save(Commande commande) {
		repo.save(commande);
	}
	
	public Commande get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int ref) {
		repo.deleteById(ref);
	}



}
