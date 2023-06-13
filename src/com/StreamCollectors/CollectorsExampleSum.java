package com.StreamCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1 {
	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class CollectorsExampleSum {
	public static void main(String[] args) {
		List<Product1> productsList = new ArrayList<Product1>();
		// Adding Products
		productsList.add(new Product1(1, "HP Laptop", 25000f));
		productsList.add(new Product1(2, "Dell Laptop", 30000f));
		productsList.add(new Product1(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product1(4, "Sony Laptop", 28000f));
		productsList.add(new Product1(5, "Apple Laptop", 90000f));
		Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.price)); // collecting as list
		System.out.println("Sum of prices: " + sumPrices);
		Integer sumId = productsList.stream().collect(Collectors.summingInt(x -> x.id));
		System.out.println("Sum of id's: " + sumId);
	}
}
