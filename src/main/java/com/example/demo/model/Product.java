package com.example.demo.model;

/**
 * Product — represents a product in the inventory.
 *
 * YOUR TASK (Part A):
 *   1. Add a no-arg constructor (required by Spring/Jackson for JSON deserialization)
 *   2. Add a constructor that takes all fields EXCEPT id:
 *      Product(String name, String category, double price, int quantity)
 *   3. Add getters and setters for ALL fields (including id)
 *   4. Override toString() to return a readable string like:
 *      "Product{id=1, name='Laptop', category='Electronics', price=999.99, quantity=10}"
 */
public class Product {

    private Long id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    // TODO: No-arg constructor


    // TODO: Constructor with (String name, String category, double price, int quantity)


    // TODO: Getters and setters for all 5 fields


    // TODO: Override toString()

}
