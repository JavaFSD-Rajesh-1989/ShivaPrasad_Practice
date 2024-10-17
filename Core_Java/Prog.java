package pattern;
import java.util.Scanner;

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of given num
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first string :");
	String s1=scan.nextLine();
	
	System.out.println("Enter second string :");
	String s2=scan.nextLine();
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1==s2);
	
	
	String s3=new String("java");
	System.out.println(s3);
	
	System.out.println();
	System.out.println(s2.equals(s3));
	
	
	String s4="JAVA";
	String s5="PYTHONHON";
	String s6=s4+s2;
	String s7=s1.concat(s2);
	System.out.println(s6);
	System.out.println(s7);
	System.out.println(s5.lastIndexOf('H'));
	String m="DHONINI";
	System.out.println(m.lastIndexOf("NI"));
	System.out.println(m.length());
	System.out.println(m.replace("NI","00"));
	System.out.println(m.split("ON",3));
		
		
		//prime
		

	}

}
