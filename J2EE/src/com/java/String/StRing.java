package com.java.String;

public class StRing {

	public static void main(String[] args) 
	
	{
		
String s1="Hello Java";

String s2="Hello Java";  //It doesn't create a new instance   because this String already exist in the "String constant pool"
		

String s3=new String("HELLO");  // creates two objects and one reference variable , here HELLO placed in pool  &S3 refer to an object in a heap
		
		s3.concat("world");   // string immutable  (u can also concat by + operator  50+50+"hi"  )
		
	String	s5=s3.concat("world");  // if we explicitly assign it to the reference variable, it will refer to HELLOworld
		
		
char[] ch={'h','e','l','l','o'};	

String s4= new String(ch);  //convert char array to a String 


System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);




if(s3.equals("HELLO"))  // equal method which compare the argument value with original value  it returns boolean value
	{
		System.out.println("Its Equal");
	}
	
	
	
	if (s3.equalsIgnoreCase("hello"))   // ignore the case type
	{
	System.out.println("its Equal IgnoreCase");
	
	}
	
	
	
	
	
	if(s1==s2)    // compare by == operator
	{
		System.out.println("its equal");
	}
	

	
	
	
	
	
System.out.println(s2.toUpperCase());       //use for upper case


System.out.println(s5.toLowerCase());         //use for lower case




String s6="    INDIA";





System.out.println(s6);     

System.out.println(s6.trim());   // trim  use to delete space after and before the String






String s7=(" USA is the beatiful country  ");

System.out.println(s7);

String s8=s7.replace("USA", "INDIA");      // use to replace the String 

System.out.println(s8);



String[] s9= s8.split(" ");            // use to separate the String 

for(String f1:s9)
{
	System.out.println(f1);
}
	
	

	
}}
