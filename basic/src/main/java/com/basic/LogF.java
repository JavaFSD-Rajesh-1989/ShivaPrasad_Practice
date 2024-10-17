package com.basic;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class LogF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger("LogF");
		FileAppender f=new FileAppender(new SimpleLayout(),"./logS.txt");
		log.addAppender(f);
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name");
		String s=scan.next();
		log.info(s+" Accepted at "+LocalDateTime.now());
	}

}
