package com.epam.model;

/**
 * Product.java - The below code contain product Model.
 * @author  Krishna Kumar Singh
 * @role Junior Software Engineer
 * @contact krishna_singh1@epam.com
 */

public class Product {
	private Integer productId;
	private Integer categoryId;
	private Integer subCategoryId;
	private String name;
	private Double price;
	private Integer stock;
	
	public Product () {       
	}
	
	public Product (Integer productId, Integer categoryId, Integer subCategoryId, String name, Double price, Integer stock) {
	    this.productId = productId;
	    this.categoryId = categoryId;
	    this.subCategoryId = subCategoryId;
	    this.name = name;
	    this.price = price;
	    this.stock = stock;
	}

	public String getName() {
	    return name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}
	
	public Double getPrice() {
	    return price;
	}
	
	public void setPrice(Double price) {
	    this.price = price;
	}
	
	public Integer getStock() {
	    return stock;
	}
	
	public void setStock(Integer stock) {
	    this.stock = stock;
	}
	
	public Integer getProductId() {
	    return productId;
	}
	
	public void setProductId(Integer productId) {
	    this.productId = productId;
	}   
	
	public Integer getSubCategoryId() {
	    return subCategoryId;
	}
	
	public void setSubCategoryId(Integer subCategoryId) {
	    this.subCategoryId = subCategoryId;
	}
	
	public Integer getCategoryId() {
	    return categoryId;
	}
	
	public void setCategoryId(Integer categoryId) {
	    this.categoryId = categoryId;
	}	
}
