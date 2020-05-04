package com.java.OOPrgrm.Encapsulation;

import java.util.Scanner;

public class TestEncap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the Student name");

		String name = sc.next();

		System.out.println("enter the Student id");

		int id = sc.nextInt();

		sc.close();

		Encap a1 = new Encap();

		a1.setName(name);       // used to set the name from the user
		
		a1.setId(id);           // used to set the id from the user

		System.out.println("student id" + " " + a1.getId() + " " + " name"
			
				+ " " + a1.getName());  // used to get the output

	}

}
