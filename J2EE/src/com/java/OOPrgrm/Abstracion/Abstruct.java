package com.java.OOPrgrm.Abstracion;

public abstract class Abstruct // abstract class
{
	String name;
	int n;

	Abstruct() // before creating parameterized constructor you have to create a
				// default constructor
				// because parent class default constructor will be called by
				// default constructor of child class or you have to create
				// same parameterized constructor  in derived class
	{
		System.out.println("default constructor");
	}

	Abstruct(int n, String b) // parameterized constructor
	{
		this(); // call default constructor

		this.n = n; // initialize instance variable
		name = b;

		System.out.println("construcor" + " " + n + " " + b);

	}

}

class Extra extends Abstruct {
	int a;
	String c;

	Extra(int a, String c) // subclass constructor
	{
		super(a, c); // call parent class constructor along with arguments

		this.a = a; // initialize instance variables of child class
		this.c = c;
	}

}
