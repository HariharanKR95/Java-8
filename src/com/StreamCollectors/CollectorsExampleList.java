package com.StreamCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class CollectorsExampleList {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		productsList.forEach((p->System.out.println(p)));
		 Map<Integer,String> productPriceMap =   
		            productsList.stream()  
		                        .collect(Collectors.toMap(p->p.id, p->p.name));  
	
		List<Float> productPriceList = productsList.stream().map(x -> x.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList);
	}
}
