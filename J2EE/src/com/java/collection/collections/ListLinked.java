package com.java.collection.collections;

import java.util.*;

public class ListLinked {
	public static void main(String[] args) 
	{
	 LinkedList<String> l1=new LinkedList<String>();	

	 l1.add("mahindra");
	 l1.add("sigh");
	 l1.add("Dhoni");
	 l1.add("Dhoni");        //duplicates are allowed
	 l1.add("virat");
	 l1.add("kholi");
	 l1.add(null);          // allows null values
	System.out.println(l1); //out put shown in a group

//	for(String s1:l1)
	{
//		System.out.println(s1);   // output by using for each loop 
	}   
	
	l1.add("rohith");
	l1.add("sharma");
	
	System.out.println(l1); //maintains the insertion order 
	
	l1.remove(3);  // remove virat
	
	System.out.println(l1);
	
	LinkedList<String> l2=new LinkedList<String>();	

	
l2.addAll(l1);	//copied data from l1 to l2
	
	System.out.println(l2);  
	
	 System.out.println(l1.get(3)); // display 4th index data 
	 
	 System.out.println(l1.get(2));
	
	
	Iterator itr=l2.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}


}
