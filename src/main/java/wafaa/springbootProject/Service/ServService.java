package wafaa.springbootProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafaa.springbootProject.Repository.ServiceRepository;
import wafaa.springbootProject.model.Serv;
@Service

public class ServService {
	
	@Autowired
	
	
	private ServiceRepository repo;
	
	public List<Serv> listAll(){
		return repo.findAll();
	}
	
	
	public void save(Serv serv) {
		repo.save(serv);
	}
	
	public Serv get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
