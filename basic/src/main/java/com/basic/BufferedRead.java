package com.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("D:/perungudi/four.txt");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		String ip=br.readLine();
		
		FileOutputStream fw=new FileOutputStream(f1);
		
		for(int i=0;i<ip.length();i++) {
			fw.write(ip.charAt(i));
		}
		
		System.out.println("data copied");
		

	}

}
