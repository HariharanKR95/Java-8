package com.LambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
	

	

	


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	int age;
}
	public class ComparatorExample {
		void say() {
			System.out.println("Hello");
		}

		public static void main(String[] args) {
			List<Person> people = new ArrayList<>();
			people.add(new Person("John", 25));
			people.add(new Person("Jane", 30));
			System.out.println(people);
			
			Collections.sort(people, (p1, p2) ->
			p1.getName().compareTo(p2.getName()));
			//System.out.println();
		}

	}
