package com.MethodReference;
//Reference to an Instance Method
//like static methods, you can refer instance methods also.
//In the following example, we are describing the process of referring the instance method.

//Syntax
//
//containingObject::instanceMethodName  

interface Sayable1 {
	void say();
}

public class MethodReferenceInstanceObject {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		MethodReferenceInstanceObject methodReference = new MethodReferenceInstanceObject(); // Creating object
		// Referring non-static method using reference
		Sayable sayable = methodReference::saySomething;
		// Calling interface method
		sayable.say();
		// Referring non-static method using anonymous object
		Sayable1 sayable2 = new MethodReferenceInstanceObject()::saySomething; // You can use anonymous object also
		// Calling interface method
		sayable2.say();
	}
}
