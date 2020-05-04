//class which is declared with the abstract keyword is known as an abstract class in Java.
//It can have abstract and non-abstract methods (method with the body).

package com.java.OOPrgrm.Abstracion;

public abstract class Switch {
	int number;

	
	public void meth()          // concrete method
	{
		System.out.println("concrete method");
	}

	abstract void meth1();          // abstract method

}

class On extends Switch {
	
	
	void meth1() // compulsory to override the abstract method
	{
		System.out.println(" method switch On");
	}

}

class Off extends Switch {
	void meth1() {
		System.out.println(" method switch Off");
	}

}