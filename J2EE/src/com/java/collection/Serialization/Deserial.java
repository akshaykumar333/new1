package com.java.collection.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] args) {
		
		try {
	FileInputStream	file=new FileInputStream("E:/jspider/java/Serial.txt");
	
	ObjectInputStream obj=new ObjectInputStream(file);
	
	Serialize  s=(Serialize)obj.readObject();
	
	
	System.out.println(s.name+" "+s.id);
		
		obj.close();
		}

	catch(Exception e)
	{
		System.out.println(e);
	
	}
	
	}

}
