package com.java.OOPrgrm.Method;

public class TestOverloading {

	public static void main(String[] args) {

		Loading ref = new Loading(); // calling methods of main Class by object
										// of sub class
		ref.load(11, "bharath");
		ref.load("india");
		ref.load(10);
		ref.load(); // here method overridden in sub class

		Overloading meth1 = new Overloading();
		meth1.load(); // when same name of method present in both sub class and
						// main class
						// you have create object of respected Class
	}

}