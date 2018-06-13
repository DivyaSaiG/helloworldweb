package com.sai.helloworld;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.sai.helloworld.model.Employee;

public class DeserializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String path = "C:/Dev/employee.data";
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputstream = null;

		try {
			fileInputStream = new FileInputStream(path);
			objectInputstream = new ObjectInputStream(fileInputStream);
			Employee emp = (Employee) objectInputstream.readObject();
			System.out.println(emp.getLastname());

		} finally {
			if (fileInputStream != null) {
				fileInputStream.close();
			}
			if (objectInputstream != null) {
				objectInputstream.close();
			}
		}

	}

}
