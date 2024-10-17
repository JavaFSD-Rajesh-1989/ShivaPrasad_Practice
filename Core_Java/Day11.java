package pattern;
import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        
	        
	        System.out.println("Enter no of rows");
	        int rows=scan.nextInt();
	        System.out.println("Enter no of columns:");
	        int col=scan.nextInt();
	        for(int i=1;i<=rows;i++)
	        {
	            for(int j=1;j<=col;j++)
	            {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter Name :");
	        String name=sc.nextLine();
	        System.out.print("Enter age:");
	        int age=sc.nextInt();
	        System.out.println("Name is : "+name);
	        System.out.println("Age is :"+age);

	}

}
