package com.epam.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.epam.model.Category;
import com.epam.model.Product;
import com.epam.model.SubCategory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

/**
 * DbConnect.java - The below code contain Database Connection Code. It reads all data from Database tables.
 * @author  Krishna Kumar Singh
 * @role Junior Software Engineer
 * @contact krishna_singh1@epam.com
 */

public class DbConnect implements DbConnectDao {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	private final List<Category> categoryList = new ArrayList<>();
	private final List<SubCategory> subCategoryList = new ArrayList<>();
	private final List<Product> productList = new ArrayList<>();
	
	public DbConnect() {
		if(categoryList.isEmpty() &&  subCategoryList.isEmpty() && productList.isEmpty()) {
			try (InputStream input = new FileInputStream("src/main/java/Database.properties")){
				Properties properties = new Properties();
				properties.load(input);
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(properties.getProperty("JDBC_CONNECTION_STRING"), properties.getProperty("DATABASE_USERNAME"), properties.getProperty("DATABASE_PASSWORD"));
				statement = connection.createStatement();
				initializeTableData();
				closeConnection();
			} catch (Exception exception) {
				System.out.println(exception);
			} 
		}
	}
	
	private void initializeTableData() {
		setCategories();
		setSubCategories();
		setProducts();
	}
	
	private void setCategories() {
		try {
			resultSet = statement.executeQuery("select category_id, category_name from category");
			while (resultSet.next()) {
				categoryList.add(new Category(resultSet.getInt("category_id"), resultSet.getString("category_name")));
			}
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
		} 
	}

	private void setSubCategories() {
		try {
			resultSet = statement.executeQuery("select subcategory_id, category_Id, subCategory_Name from SubCategory");
			while (resultSet.next()) 
				subCategoryList.add(new SubCategory(resultSet.getInt("subcategory_id"), resultSet.getInt("category_Id"), resultSet.getString("subCategory_Name")));			
		}catch(Exception exception) {
				System.out.println(exception.getMessage());
		} 
	}
	
	private void setProducts() {
		try {
			resultSet = statement.executeQuery("select product_id, category_Id, subCategory_Id, product_Name, product_Price, product_stock from Product");
			while (resultSet.next()) 
				productList.add(new Product(resultSet.getInt("product_id"), resultSet.getInt("category_Id"), resultSet.getInt("subCategory_Id"), resultSet.getString("product_Name"), resultSet.getDouble("product_Price"), resultSet.getInt("product_stock")));			
		}catch(Exception exception) {
				System.out.println(exception.getMessage());
		} 
	}
	
	public List<Category> getCategories() {
		return categoryList;
	}
	
	public List<SubCategory> getSubCategories() {
		return subCategoryList;
	}
	
	public List<Product> getProducts() {
		return productList;
	}
	
	private void closeConnection() throws SQLException {
		connection.close();
		statement.close();
		resultSet.close();
	}
}
