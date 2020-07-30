package com.epam.model;

/**
 * SubCategory.java - The below code contain SubCategory Model.
 * @author  Krishna Kumar Singh
 * @role Junior Software Engineer
 * @contact krishna_singh1@epam.com
 */

public class SubCategory {
	private Integer subCategoryId;
	private Integer categoryId;
	private String name;
	
	public SubCategory () {       
	}
	
	public SubCategory (Integer subCategoryId, Integer categoryId, String name) {
	    this.subCategoryId = subCategoryId;
	    this.categoryId = categoryId;
	    this.name = name;
	}

	public String getName() {
	    return name;
	}
	
	public void setName(String name) {
	    this.name = name;
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
