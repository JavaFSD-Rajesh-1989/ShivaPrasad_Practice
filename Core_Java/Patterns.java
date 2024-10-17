package pattern;
import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter n value");
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			char ch='A';
			for(int k=1;k<=i;k++)
			{
				
				if(i==n||i==k||k==1)
				{
					System.out.print(ch++ + " ");
				}
				else
				{
					System.out.print("  ");
					ch++;
				}
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n||i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||i==(n/2)+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==(n/2)+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+1;k++)
			{
				if(k==1||k==n-i+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		
				
			
			
		
		

	}

}
