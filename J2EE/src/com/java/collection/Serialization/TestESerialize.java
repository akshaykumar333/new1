package com.java.collection.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestESerialize 
{

	public static void main(String[] args)
	{
		try {
                                   // Creating the object
Serialize s1 = new Serialize("akshay",11);
   
                                  // Creating stream and writing the object

FileOutputStream fout = new FileOutputStream("E:/jspider/java/Serial.txt");  //Creates a file output stream to write to the file with the specified name

ObjectOutputStream out = new ObjectOutputStream(fout); //Creates an ObjectOutputStream that writes to the specified OutputStream

out.writeObject(s1);            //   Write the specified object to the ObjectOutputStream.

//out.flush();
                                 // closing the stream
out.close();

System.out.println("successfull");
} 

catch (Exception e) 
{
System.out.println(e);
}
}
}
