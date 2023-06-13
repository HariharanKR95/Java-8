package com.FunctionalInterface;

@FunctionalInterface
interface say1 {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class FunctionalInterface2 implements say1 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterface2 fie = new FunctionalInterface2();
		fie.say("Hello there");
	}
}
