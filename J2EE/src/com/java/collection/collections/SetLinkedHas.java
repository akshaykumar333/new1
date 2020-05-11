package com.java.collection.collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class SetLinkedHas 
{
	public static void main(String[] args) 
	{
	LinkedHashSet<String> l1=new LinkedHashSet<String>();	

	 l1.add("mahindra");
	 l1.add("sigh");
	l1.add("Dhoni");
	
//	 l1.add("Dhoni");        //duplicates are not allowed
	
	l1.add("virat");
	 l1.add("kholi");        // maintain insertion order
	
	 l1.add(null);
	 l1.add(null);           // allows one null value
	
	 System.out.println(l1); //out put shown in a group

	l1.add("rohith");
	
	l1.add("sharma");
	
	System.out.println(l1); // maintains the insertion order 
	
	
     l1.remove("virat");  // remove virat
	
	System.out.println(l1);
	
	LinkedHashSet<String> l2=new 	LinkedHashSet<String>();	

	
l2.addAll(l1);	//copied data from l1 to l2

	System.out.println(l2);  
	
	
	
	Iterator itr=l2.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}

}
