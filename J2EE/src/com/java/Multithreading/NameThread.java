package com.java.Multithreading;

public class NameThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		NameThread t1 = new NameThread();

		NameThread t2 = new NameThread();

		t1.setName("akshay");

		t1.start();

		t2.start();

	}

}
