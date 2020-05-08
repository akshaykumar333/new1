package com.java.Multithreading;

public class Multi extends Thread 
{
public void run()          // The thread moves from New state to the Runnable state.
                    //When the thread gets execute, its target run() method will run.
{
System.out.println("thread is running");	
}


public static void main(String[] args) {
	
	Multi m1=new Multi(); // object created 
	
	
	
	m1.start();    // JVM calls the run method of this thread
  
//	m1.start();    //After starting a thread, it can never be started again
}


}
