package com.FunctionalInterface;

@FunctionalInterface
interface sayable {
	void say(String msg);
	//void sayable(String name);
}

public class FunctionalExample implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalExample fie = new FunctionalExample();
		fie.say("Hello there");
	}
}
