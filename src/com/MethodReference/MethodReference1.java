package com.MethodReference;
//Reference to a Static Method
//You can refer to static method defined in the class. 
//Following is the syntax and example which describe the process of referring static method in Java.
interface Sayable {
	void say();
}

public class MethodReference1 {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = MethodReference1::saySomething;
		// Calling interface method
		sayable.say();
	}
}
