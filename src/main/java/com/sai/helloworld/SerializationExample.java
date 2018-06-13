package com.sai.helloworld;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.sai.helloworld.model.Employee;

public class SerializationExample {
	
	public static void main(String args[]) throws IOException{
		
		Employee emp = new Employee(0, "Sai", "Chai", "Pichi department");
		FileOutputStream output=null;
		ObjectOutputStream object=null;
		try {
			output = new FileOutputStream("C:/Dev/employee.data");
			object = new ObjectOutputStream(output);
			
			object.writeObject(emp);
			object.flush();
			 
		} finally  {
			if(output!=null){
				output.close();
			}
			if(object!=null){
				object.close();
			}
	
		}
		
	}

}
