package com.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjInput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		File f=new File("D:/perungudi/fifth.txt");
		FileInputStream fout=new FileInputStream(f);
		
		ObjectInputStream oin=new ObjectInputStream(fout);
		Employee e=(Employee) oin.readObject();
		System.out.println("name is "+e.getName());
		System.out.println("age is "+e.getAge());
		System.out.println("gender is "+e.getGender());
		
		
	}

}
