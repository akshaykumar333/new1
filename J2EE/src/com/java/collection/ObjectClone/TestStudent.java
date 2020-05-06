package com.java.collection.ObjectClone;

public class TestStudent
{

	public static void main(String[] args)
	{

		try {
			
			Student s = new Student("akshay", 33);

			Student s1 = (Student) s.clone();

			System.out.println(s.id + " " + s.name); //output of created of object

		System.out.println(s1.name + " " + s1.id);  //output of cloned object

		    }

		catch (CloneNotSupportedException e)
		{
			System.out.println(e);
		}

	}
}
