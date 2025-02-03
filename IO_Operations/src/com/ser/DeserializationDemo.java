package com.ser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {

		
		try {
			FileInputStream  fis = new FileInputStream("EmpObj.ser");
			
			  ObjectInputStream ois = new ObjectInputStream(fis);
			
			  	Object obj = ois.readObject();
			  	
			  	Employee  emp =  (Employee) obj;
			  	
			  	System.out.println(emp);
			  
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
