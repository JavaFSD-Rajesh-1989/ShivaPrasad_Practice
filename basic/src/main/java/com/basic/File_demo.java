package com.basic;

import java.io.File;
import java.io.IOException;

public class File_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:/perungudi/one.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("file created");
				
			}
			else {
				System.out.println("not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
