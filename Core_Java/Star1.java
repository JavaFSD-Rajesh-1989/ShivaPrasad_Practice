package pattern;
import java.util.Scanner;


public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan=new Scanner(System.in);
		System.out.print("Enter n value :");
		int n=scan.nextInt();
		
		
		char ch = 'A';
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				char chRev=(char)(ch+i-1);
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
					System.out.print(ch + " ");
					ch++;
				}
				System.out.println();
			}
			
		}
		
		
		
		for(int i=1;i<=n;i++)
		{
			int count=(i*(i+1))/2;
			for(int j=1;j<=i;j++)
			{
				if(count <=9)
				{
					System.out.print("0");
				}
				System.out.print(count--+" ");
				if(j<i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		int count1=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count1++ + " ");
			}
			System.out.println();
		}
		
	}

}
