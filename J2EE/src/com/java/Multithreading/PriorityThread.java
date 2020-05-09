package com.java.Multithreading;

public class PriorityThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		PriorityThread p1 = new PriorityThread();

		PriorityThread p2 = new PriorityThread();

		p2.setPriority(MAX_PRIORITY); // here p2 thread set with more priority

		p1.setName("FIRST THREAD");

		p2.setName("SECOND THREAD");

		p1.start();

		p2.start();

	}

}
