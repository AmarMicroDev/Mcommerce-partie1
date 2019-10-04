package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.model.ProductLightProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    Product findById(int id);

    List<Product> findByPrixGreaterThan(int prixLimit);

    List<Product> findByNomLike(String recherche);

    @Query("SELECT id, nom, prix FROM Product p WHERE p.prix > :prixLimit")
    List<Product> chercherUnProduitCher(@Param("prixLimit") int prix);

    @Query("SELECT p.prix - p.prixAchat FROM Product p")
    List<Integer> calculMargeProduit();

    @Query(value = "SELECT id, nom, prix, prix_achat FROM Product ORDER BY id ASC", nativeQuery = true)
    Stream<ProductLightProjection> findAllProductLightProjection();
}
