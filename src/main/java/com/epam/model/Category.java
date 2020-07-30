package com.epam.model;

/**
 * Category.java - The below code contain Category Model.
 * @author  Krishna Kumar Singh
 * @role Junior Software Engineer
 * @contact krishna_singh1@epam.com
 */

public class Category {
	private Integer categoryId;
	private String name;
	
	public Category () {       
	}
	
	public Category (Integer categoryId, String name) {
	    this.categoryId = categoryId;
	    this.name = name;
	}

	public String getName() {
	    return name;
	}
	
	public void setName(String name) {
	    this.name = name;
	}  
	
	public Integer getCategoryId() {
	    return categoryId;
	}
	
	public void setCategoryid(Integer categoryId) {
	    this.categoryId = categoryId;
	}
}
