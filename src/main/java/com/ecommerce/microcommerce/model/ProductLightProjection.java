package com.ecommerce.microcommerce.model;

import org.springframework.beans.factory.annotation.Value;

public interface ProductLightProjection {

    @Value("#{target.id}")
    int getId();

    @Value("#{target.nom}")
    String getNom();

    @Value("#{target.prix}")
    int getPrix();

    @Value("#{target.prix_achat}")
    int getPrixAchat();
}
