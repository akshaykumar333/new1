//If subclass (child class) has the same method as declared in the parent class,
//it is known as method overriding achieve runtime polymorphism

package com.java.OOPrgrm.Method;

class Overriding {
	void ride() {

		System.out.println("logic");
	}
}

class Over1 extends Overriding {

	void ride() {
		
		System.out.println("logic 1");
	}
}

class Over2 extends Overriding {

	void ride() {
		System.out.println("logic 2");
	}
}
