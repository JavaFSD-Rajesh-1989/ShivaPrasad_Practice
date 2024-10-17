package pattern;
import java.util.Scanner;

public class Calculator1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number :");
		int n=scan.nextInt();
		
		int sum=0;
		while(n>0)
		{
			int lastdig = n % 10;	//3		12%10=2	1
			n=n/10;			//123/10=12		12/10=1	
			sum=sum+lastdig;// 0+3			3+2
			
		}
		System.out.println(sum);
		
	}

}
