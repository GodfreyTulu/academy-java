package com.bptn.course.big_coding._05_week_excercises;

// Import necessary packages for working with Lists and ArrayLists
import java.util.ArrayList;   // To use ArrayList implementation of List
import java.util.List;        // To use List data structure

public class Product {
    
    // Create instance variables to hold product details
    int id;          // Product ID
    String name;     // Product name
    double price;    // Product price

    // Create a constructor to initialize the product's id, name, and price when creating a new Product object
    public Product(int id, String name, double price) {
        this.id = id;         // Assign the product's ID
        this.name = name;     // Assign the product's name
        this.price = price;   // Assign the product's price
    }
  
    // Create a static method "countProducts" to count how many products are below a certain price
    public static long countProducts(List<Product> productsList) {
        // Use Java Streams to filter products where the price is less than 30000 and count those products
        return productsList.stream()                         // Convert the list into a stream
                           .filter(product -> product.price < 30000) // Filter products with price < 30000
                           .count();                         // Count the filtered products
    }
    
    // Main method: this is where the program starts running
    public static void main(String[] args) {
        // Create a list to hold Product objects
        List<Product> productsList = new ArrayList<Product>();

        // Add some products to the list, each with a specific id, name, and price
        productsList.add(new Product(1, "HP Laptop", 25000));   // Add HP Laptop with price 25000
        productsList.add(new Product(2, "Dell Laptop", 30000)); // Add Dell Laptop with price 30000
        productsList.add(new Product(3, "Lenevo Laptop", 28000)); // Add Lenovo Laptop with price 28000
        productsList.add(new Product(4, "Sony Laptop", 28000)); // Add Sony Laptop with price 28000
        productsList.add(new Product(5, "Apple Laptop", 90000)); // Add Apple Laptop with price 90000

        // Call the "countProducts" method to count how many products have a price below 30000
        long count = countProducts(productsList);

        // Print out the number of products that are priced less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }
}
