package com.java.String;

public class String2      //by default it extends Object 
{
	String name;
	int id;

	
	
	public String2(String name, int id)
	{
		super();
		this.name = name;
		this.id = id;
	}


public String toString()
{
	return name+" "+id;
}


	public static void main(String[] args)
	{
	
		
String2 s1=new String2("akshay", 99);


System.out.println(s1);  //by default it call s1.toString

	}

}
