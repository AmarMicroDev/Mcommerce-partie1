package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    Product findById(int id);

    List<Product> findByPrixGreaterThan(int prixLimit);

    List<Product> findByNomLike(String recherche);

    @Query(value = "SELECT id, nom, prix, prix_achat FROM Product p WHERE p.prix > :prixLimit", nativeQuery = true)
    List<Product>  chercherUnProduitCher(@Param("prixLimit") int prix);

    List<Product> findByOrderByNomAsc();
}
