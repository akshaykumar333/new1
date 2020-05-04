package com.java.OOPrgrm.Constructor;

public class TestConstructor {

	public static void main(String[] args)

	{

		new Constructor(); // call 0 parameterized/ default constructor

		Constructor ref1 = new Constructor(10, "abcd"); // calling the
														// constructor by
														// passing argument

		Constructor ref2 = new Constructor("akshay");   

		System.out.println(ref2.name);

	}

}
