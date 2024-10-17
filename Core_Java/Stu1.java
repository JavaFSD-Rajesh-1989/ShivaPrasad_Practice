package pattern;
import java.util.Scanner;
public class Stu1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of students");
		int m=scan.nextInt();
		System.out.println("Enter how many values u want  to store");
		int n=scan.nextInt();
		
		int [][] a=new int[m][n];
		for(int i=0;i<a.length;i++)
		{
				System.out.print("enter student "+(i+1)+" age ");
				a[i][0]=scan.nextInt();
				System.out.print("Enter student"+(i+1)+"Phone number");
				a[i][1]=scan.nextInt();	
		}
			
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Student "+(i+1)+" age "+a[i][0]);
			System.out.println("Student "+(i+1)+" Phone number "+a[i][1]);
			
		}
		
				
	}

}
