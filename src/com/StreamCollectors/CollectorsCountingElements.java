package com.StreamCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductData {
	int id;
	String name;
	float price;

	public ProductData(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}

public class CollectorsCountingElements {

	public static void main(String[] args) {
		List<ProductData> productsList = new ArrayList<ProductData>();
		// Adding Products
		productsList.add(new ProductData(1, "HP Laptop", 25000f));
		productsList.add(new ProductData(2, "Dell Laptop", 30000f));
		productsList.add(new ProductData(3, "Lenevo Laptop", 28000f));
		productsList.add(new ProductData(4, "Sony Laptop", 28000f));
		productsList.add(new ProductData(5, "Apple Laptop", 90000f));
		Long noOfElements = productsList.stream().collect(Collectors.counting());
		System.out.println("Total elements : " + noOfElements);
	}
}
