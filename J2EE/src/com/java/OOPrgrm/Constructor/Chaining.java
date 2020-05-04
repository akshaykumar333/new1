package com.java.OOPrgrm.Constructor;

public class Chaining {
	String name;
	int id;

	Chaining() {
		System.out.println("default constructor" + " " + id + " " + name);

	}

	Chaining(int id, String name) {
		this(); // this() is used to call default constructor of same class
		this.id = id;
		this.name = name;
		System.out.println("first constructor" + id + " " + name);

	}

	Chaining(String name) {
		this(20, "ajay"); // this() is used to call its respected constructor by
							// passing arguments
		this.name = name;
		System.out.println("second constructor" + " " + name);

	}
}

class Two extends Chaining {
	String place;

	Two() {
		super("karnataka"); // super () used to call its default constructor of
							// base class
	}

	Two(String place) {
		this(); // this() is used to call default constructor of same class
		this.place = place;

		System.out.println("Subclass constructor" + " " + place);

	}
}
