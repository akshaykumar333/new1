package com.java.OOPrgrm.Abstracion;

public class TestSwitch {

	public static void main(String[] args) {

		Switch s = new On(); // object of On class has created by using
								// reference of abstract class

		s.meth1(); // On class will be invoked by calling method

		s.meth(); // call concrete method of abstract class by object of sub
					// class


		Switch s1 = new Off(); // object of Off class has created by using
								// reference of abstract class

		s1.meth1(); // Off class will be invoked by calling method
	
		
		
	
		
	}

}
