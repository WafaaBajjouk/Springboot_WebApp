package wafaa.springbootProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wafaa.springbootProject.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer>  {

}
