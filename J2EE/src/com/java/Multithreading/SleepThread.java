package com.java.Multithreading;

public class SleepThread extends Thread {
	public void run() // one thread sleep for the specified time,
						// the thread shedular picks up another thread and so
						// on.
	{
		for (int i = 0; i <= 5; i++) {
			try {

				sleep(1000);

			}

			catch (InterruptedException e) {
				System.out.println(e);

			}
			System.out.println(i);

		}

	}

	public static void main(String[] args) {
		SleepThread s1 = new SleepThread();

		SleepThread s2 = new SleepThread();

		System.out.println("first thread");

		s1.start(); // JVM calls the run method of this thread

		System.out.println("second thread");

		s2.start(); // JVM calls the run method of this thread
	}

}
