package com.java.Multithreading;

public class GroupThread implements Runnable // Runnable interface
{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args)

{
		GroupThread g1 = new GroupThread();

		ThreadGroup tg1 = new ThreadGroup("GroupA"); // parent group name

		
		System.out.println("Parent Group name" + " " + tg1.getName());
		

		Thread t1 = new Thread(tg1, g1, "one"); // member of group A ----- One
												// is thread name

	
		Thread t2 = new Thread(tg1, g1, "two"); // member of group A ----- Two
												// is thread name

	
		Thread t3 = new Thread(tg1, g1, "three"); // member of group A ----- One
													// is thread name

		t1.start();

		t2.start();

		t3.start();

}

}
