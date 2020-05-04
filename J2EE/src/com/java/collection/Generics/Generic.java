// Generics force the java programmer to store a specific type of objects.
package com.java.collection.Generics;

import java.util.*;

public class Generic

{
	public static void main(String[] args) {

		ArrayList at = new ArrayList(); // you can add all type data
		at.add("in");
		at.add(1947);
		at.add("india");
		at.add("got");
		at.add("independence");

		ArrayList<Integer> lt = new ArrayList<Integer>(); // you can add only
															// (specific)
															// integer type data
															// by using generics
		lt.add(10);
		lt.add(20);
		lt.add(99);
		// lt.add("hello") //compiler error

		ArrayList<String> st = new ArrayList<String>();
		st.add("india");
		st.add("USA");
		st.add("UK");
		// st.add(1947); // compile time error

		System.out.println(lt.size()); // returns the number of elements in this
										// list.

		System.out.println(lt.get(1)); // returns the element at the specified
										// position in this list

		Iterator<Integer> itr = lt.iterator(); // access integer data in
												// sequence.

		while (itr.hasNext()) // returns true or false

		{
			System.out.println(itr.next()); // returns the next element in the
											// iteration
		}

		Iterator<String> str = st.iterator();

		while (str.hasNext())

		{

			System.out.println(str.next());
		}

		Iterator atr = at.iterator();

		while (atr.hasNext())

		{

			System.out.println(atr.next());
		}

	}

}
