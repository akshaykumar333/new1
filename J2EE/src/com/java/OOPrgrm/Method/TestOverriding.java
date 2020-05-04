package com.java.OOPrgrm.Method;

public class TestOverriding {

	public static void main(String[] args) 
	{                                   // by creating object we can  call the method 
		
		Overriding ref1=new Overriding();
		
		ref1.ride();
		
		
		Over2 ref2=new Over2();
		ref2.ride();
		
		Over1 ref=new Over1();   
		 ref.ride();

	}

}
