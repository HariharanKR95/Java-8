package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product2{  
	    int id;  
	    String name;  
	    float price;  
	    public Product2(int id, String name, float price) {  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	  
	public class StreamListToSet {  
	    public static void main(String[] args) {  
	        List<Product2> productsList = new ArrayList<Product2>();  
	  
	        //Adding Products  
	        productsList.add(new Product2(1,"HP Laptop",25000f));  
	        productsList.add(new Product2(2,"Dell Laptop",30000f));  
	        productsList.add(new Product2(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product2(4,"Sony Laptop",28000f));  
	        productsList.add(new Product2(5,"Apple Laptop",90000f));  
	          
	        // Converting product List into Set  
	        Set<Float> productPriceList =   
	            productsList.stream()  
	            .filter(product->product.price < 30000)   // filter product on the base of price  
	            .map(product->product.price)  
	            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
	        System.out.println(productPriceList);  
	    }  
	}  

