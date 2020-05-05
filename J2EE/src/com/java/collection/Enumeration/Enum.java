//Enum in Java is a data type which contains a fixed set of constants.

package com.java.collection.Enumeration;


enum Weeks { SUNDAY, MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY } // you can define the enum inside the class or out side the class 

public class Enum {  
	                                       
	 	 
	public static void main(String[] args)
	{  
	                                          //traversing the enum  
	for (Weeks w : Weeks.values())  
		

	System.out.println(w);  
	
	//values() method returns an array containing all the values of the enum.
	System.out.println("Value of WEDNESDAY is: "+Weeks.valueOf("WEDNESDAY"));  
	
	
	// ordinal() method returns the index of the enum value.
	
	System.out.println("Index of SUNDAY is: "+Weeks.valueOf("SUNDAY").ordinal());  
	
	System.out.println("Index of TUESDAY is: "+Weeks.valueOf("TUESDAY").ordinal());  
	}
	}  


	
