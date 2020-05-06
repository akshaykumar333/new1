package com.java.collection.ObjectClone;

public class Student implements Cloneable  // 
{
	String name;
	int id;

	Student(String n, int i) 
	{
		name = n;
		id = i;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
