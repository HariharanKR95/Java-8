package com.FunctionalInterface;

//A functional interface can extends another interface only when it does not have any abstract method.
	interface sayable1{  
	   static void say(String msg) {
	}   // abstract method  
	}  
	@FunctionalInterface  
	interface FunctionalInterface3 extends sayable1{  
	    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
	    void doIt();  
	}  

