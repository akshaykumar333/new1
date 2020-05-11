package com.java.collection.collections;

import java.util.Iterator;
import java.util.*;

public class SetSorted 
{
	public static void main(String[] args) 
	{
	TreeSet<String> l1=new TreeSet<String>();	

	 l1.add("mahindra");
	 l1.add("sigh");
	 l1.add("Dhoni");
	
	 l1.add("Dhoni");        //duplicates are not allowed
	
	 l1.add("virat");
	 l1.add("kholi");        //does not maintain insertion order
	
	// l1.add(null);
    // l1.add(null);        //not allows null value
	
	 System.out.println(l1); //out put shown in a group

//	for(String s1:l1)
	{
//		System.out.println(s1);   // output by using for each loop 
	}   
	
	l1.add("rohith");
	
	l1.add("sharma");
	
	System.out.println(l1); // does't maintains the insertion order display output in sorted order 
	
	
     l1.remove("virat");  // remove virat
	
	System.out.println(l1);
	
	TreeSet<String> l2=new 	TreeSet<String>();	

	
l2.addAll(l1);	//copied data from l1 to l2

	System.out.println(l2);  
	
	
	
	Iterator itr=l2.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}
}
