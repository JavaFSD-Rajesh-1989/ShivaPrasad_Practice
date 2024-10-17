package com.basic;

import java.io.File;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:/perungudi");
		if(f.mkdir()) {
			System.out.println("file created");
		}
		else {
			System.out.println("file not created");
		}

	}

}
