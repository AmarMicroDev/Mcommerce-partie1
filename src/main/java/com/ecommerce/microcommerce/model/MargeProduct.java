package com.ecommerce.microcommerce.model;

public class MargeProduct {

	private Product produit;
	private int marge;
	
	public MargeProduct(){
		super();
	}
	
	public MargeProduct(Product produit, int marge){
		this.produit = produit;
		this.marge = marge;
	}

	public Product getProduit() {
		return produit;
	}

	public void setProduit(Product produit) {
		this.produit = produit;
	}

	public int getMarge() {
		return marge;
	}

	public void setMarge(int marge) {
		this.marge = marge;
	}
	
	
}
