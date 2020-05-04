package com.java.OOPrgrm.Constructor;

public class Constructor extends Object {
	String name;
	int id;

	Constructor() // default constructor
	{

		System.out.println("default constructor" + " " + id + " " + name);
	}

	Constructor(int a, String name) {
							// initialize the instance variable
		id = a;
		this.name = name; // variable shadowing we use this keyword

		System.out.println(id + " " + name);

	}

	Constructor(String name) {
		this(); 			// calling default constructor
		this.name = name;
	}

}
