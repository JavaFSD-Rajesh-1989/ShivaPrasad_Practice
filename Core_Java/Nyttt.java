package pattern;
import java.util.Scanner;
public class Nyttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n=scan.nextInt();
		
		
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			char chRev=(char)(ch+i-1);
			if(i % 2 ==0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(chRev-- + " ");
					ch++;
				}
				System.out.println();
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch++ + " ");
				}
				System.out.println();
			}
		}
		
		
		System.out.println();
		System.out.println();

		char ch1='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch1++);
			}
			System.out.println();
			
		}
		
		
		System.out.println();
		System.out.println();

		
		for(int i=1;i<=n;i++)
		{
			char ch2='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch2++);
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			int count11=(i*(i+1))/2;
			
			for(int j=1;j<=i;j++)
			{
				if(count11<=9)
				{
					System.out.print("0");
				}
				System.out.print(count11--+" ");
				if(j<i)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		

	}

}
