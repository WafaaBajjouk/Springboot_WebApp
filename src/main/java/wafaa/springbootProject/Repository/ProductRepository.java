package wafaa.springbootProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wafaa.springbootProject.model.Produit;

public interface ProductRepository extends JpaRepository<Produit, Integer> {

}
