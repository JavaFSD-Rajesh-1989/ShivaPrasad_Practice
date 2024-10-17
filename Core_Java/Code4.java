package pattern;
import java.util.Scanner;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [][] a =new int[5][2];
		for(int i=0;i<a.length;i++)
		{
			
				System.out.println("Enter age person1 : ");
				a[i][0]=scan.nextInt();
				System.out.println("Enter age person2 : ");
				a[i][1]=scan.nextInt();
				
			}
		
		
		for(int i=0;i<a.length;i++)
		{
			
				System.out.println("age of person1 is " +a[i][0]);
				System.out.println("age of person2 is " +a[i][1]);
				
			
		}

	}

}
