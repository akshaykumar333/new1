package com.java.collection.collections;

import java.util.*;

public class SetHash 
{
	public static void main(String[] args) 
	{
	 HashSet<String> l1=new HashSet<String>();	

	 l1.add("mahindra");
	 l1.add("sigh");
	l1.add("Dhoni");
	
//	 l1.add("Dhoni");        //duplicates are not allowed
	
	l1.add("virat");
	 l1.add("kholi");        //does not maintain insertion order
	
	 l1.add(null);
	 l1.add(null);    // allows one null value
	
	 System.out.println(l1); //out put shown in a group

//	for(String s1:l1)
	{
//		System.out.println(s1);   // output by using for each loop 
	}   
	
	l1.add("rohith");
	
	l1.add("sharma");
	
	System.out.println(l1); // does not maintains the insertion order 
	

	

    l1.remove("virat");  // remove virat
	
	System.out.println(l1);
	
	HashSet<String> l2=new 	HashSet<String>();	

	
l2.addAll(l1);	//copied data from l1 to l2
	
boolean a=l2.isEmpty();  //check whether object empty or not 

System.out.println(a);
	System.out.println(l2);  
	

	
	
	Iterator itr=l2.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}

}
