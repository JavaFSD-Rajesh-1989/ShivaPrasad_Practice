package com.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("D:/perungudi/one.txt");
		File f2=new File("D:/perungudi/two.txt");
		
		FileInputStream fr=new FileInputStream(f1);
		FileOutputStream fw=new FileOutputStream(f2);
		
		int c=0;
		
		while (!((c=fr.read())==-1)) {
			fw.write(c);
		}
		fr.close();
		fw.close();

	}

}
