// wrapping up or binding the private data members along with 
//its public data handler method is  called encapsulation

package com.java.OOPrgrm.Encapsulation;

public class Encap
{
private String name;
private int id;         //data members must be private

public String getName()           // setter and getter must be public
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id = id;
}


	
	
	
}
