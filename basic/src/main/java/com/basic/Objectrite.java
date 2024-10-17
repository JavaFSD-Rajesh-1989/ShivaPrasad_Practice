package com.basic;

import java.io.*;

public class Objectrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:/perungudi/fifth.txt");
		FileOutputStream fout=new FileOutputStream(f);
		
		Employee e=new Employee();
		e.setName("shiv");
		e.setGender("M");
		e.setAge(22);
		
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(e);
		
		oos.close();
		fout.close();
		
		System.out.println("write object success");

	}
	

}
