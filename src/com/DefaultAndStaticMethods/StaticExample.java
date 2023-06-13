package com.DefaultAndStaticMethods;
//Static Methods inside Java 8 Interface
//You can also define static methods inside the interface.
//Static methods are used to define utility methods.
interface Sayable1 {
	// default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class StaticExample implements Sayable {
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		StaticExample dm = new StaticExample();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method
		Sayable1.sayLouder("Helloooo..."); // calling static method
	}
}
