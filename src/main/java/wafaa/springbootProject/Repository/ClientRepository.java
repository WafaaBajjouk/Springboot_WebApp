package wafaa.springbootProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wafaa.springbootProject.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
