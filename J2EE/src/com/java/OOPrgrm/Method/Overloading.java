//f  methods having same name but different in parameters 
// in same or sub class it is known as Method Overloading.

package com.java.OOPrgrm.Method;

public class Overloading
{
 void load()
{
	System.out.println("main class logic 1  ");
}

String load(int a)   
{
	System.out.println("main class logic 2 "+" "+a);
	return null;
}

void load(int a, String name)
{
	System.out.println("main class logic 3"+" "+a+" "+name);
}

}

class Loading extends Overloading
{
	void load()   
	{
		System.out.println("sub class logic 4");
		
	}
	
	void load(String name)   
	{
		System.out.println("sub class logic 5");
	}


}







