package com.LambdaFunction;
@FunctionalInterface
interface Sayable {
	public String say(String name);
	//public String display();
}

public class LambdaExpressionSingleParameter {
	public static void main(String[] args) {

		// Lambda expression with single parameter.
		Sayable s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

		// You can omit function parentheses
		Sayable s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));
	}
}
