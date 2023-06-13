package com.LambdaFunction;

//@FunctionalInterface // It is optional
interface Drawable {
	public void draw(int a ,int b);
	static void maqd() {
		
	}
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		int width = 10;

		// with lambda
		Drawable d2 = (x,y) -> {
			System.out.println(x+y);
		};
		d2.draw(3,5);
	}
}
