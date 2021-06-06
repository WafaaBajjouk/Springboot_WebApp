package wafaa.springbootProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wafaa.springbootProject.Repository.ClientRepository;
import wafaa.springbootProject.model.Client;
@Service

public class ClientService {

@Autowired
	
	private ClientRepository repo;
	
	public List<Client> listAll(){
		return repo.findAll();
	}
	
	
	public void save(Client client) {
		repo.save(client);
	}
	
	public Client get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
