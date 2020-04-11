package com.ecommerce.microcommerce.service;

public class CalculMargeService {
    public static int calculMarge(int prix, int prixAchat) {
        return prix-prixAchat;
    }
}
