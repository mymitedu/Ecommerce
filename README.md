# E-Commerce Application
-----------------------

## Description

Ecommerce, also known as electronic commerce or internet commerce, refers to the buying and selling of goods or services using the internet, and the transfer of money and data to execute these transactions. Ecommerce is often used to refer to the sale of physical products online, but it can also describe any kind of commercial transaction that is facilitated through the internet.

## Project Structure

###### Ecommerce -> pom.xml   <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp;  -> src/main/java  <br/>
###### &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp; &nbsp;       -> com.epam.dao <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> DbConnect.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> DbConnnectDao.java <br/>
###### &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp; &nbsp;       -> com.epam.model <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> Category.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> Product.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> SubCategory.java <br/>
###### &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp; &nbsp;       -> com.epam.view <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> Main.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> Index.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> CategoryView.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> SubCategoryView.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> ProductView.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> CartView.java <br/>
###### &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp; &nbsp;       -> com.epam.service <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> CartDao.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> CartService.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> CategoryDao.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> CategoryService.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> CheckoutDao.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> CheckoutService.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> ProductDao.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> ProductService.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> SubCategoryDao.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> SubCategoryService.java <br/>
###### &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp; &nbsp;       -> com.epam.exception <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp; &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp;             -> ProductDoesNotExistException.java <br/>
###### &emsp; &emsp; &emsp;&emsp; &nbsp;  -> src/main/resources  <br/>
###### &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp; &nbsp;       -> log4j2.properties <br/>
###### &emsp; &emsp; &emsp;&emsp;&emsp; &emsp; &emsp;&emsp; &nbsp;       -> Database.properties <br/>



## Some Project Screenshots:

### Welcome Screen

This is the initial screen of our E-Commerce Application.

<img src="Ecommerce/TempToDelete/Welcome.png"> <br/>

### Product Category

Categories are displayed when you press 1.

<img src="Ecommerce/TempToDelete/Product_Category.png"> <br/>

### Product SubCategory

You can select Category to display Sub Category.

<img src="Ecommerce/TempToDelete/Product_SubCategory.png"> <br/>

### Products

You can see products in a tabular formate.

<img src="Ecommerce/TempToDelete/Products.png"> <br/>

### Add To Cart

You can add products to your cart.

<img src="Ecommerce/TempToDelete/Add_To_Cart.png"> <br/>

### Display Cart

You can view cart.

<img src="TempToDelete/Display_Cart.png"> <br/>

### Wrong Input Exception

Warning for wrong user input.

<img src="Ecommerce/TempToDelete/Wrong_User_Input_Exception.png"> <br/>

### Remove from Cart Exception

If remove wrong product which is not in your cart then it will warn you.

<img src="Ecommerce/TempToDelete/Remove_from_Cart_Exception.png"> <br/>

### Display Cart Exeception

You cart is empty.

<img src="Ecommerce/TempToDelete/Dispaly_Cart_Exception.png"> <br/>

### Buy Now Exception

Without Selection, you cannot buy Anything.

<img src="Ecommerce/TempToDelete/Buy_Now_Exception.png"> <br/>

### For more information download it now.

Note: These screeshots not cover all features of our application. The functionality may be change in future.

**Created by:** <br/>
**Name: Krishna Kumar Singh** <br/>
**Email: krishnaai265@epam.com** <br/>
**Phone: +91-9368754996** 
