package com.java.Multithreading;

public class JoinThread extends Thread {
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

		SleepThread s3 = new SleepThread();

		System.out.println("first thread");

		s1.start(); // JVM calls the run method of this thread

		try {
			s1.join(); // it stop the current execution till completion of
						// join()
			System.out.println("join method executed");
		}

		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("second thread");

		s2.start(); // JVM calls the run method of this thread

		System.out.println("third thread");

		s3.start(); // JVM calls the run method of this thread

	}

}
