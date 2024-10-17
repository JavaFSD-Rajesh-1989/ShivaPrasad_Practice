package pattern;
import java.util.Scanner;
public class All1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n Value");
		int n =scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
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
		System.out.println();
		
		
		int count = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(count<=9)
				{
					System.out.print("0");
				}
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i*j<=9)
				{
					System.out.print("0");
				}
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		
		int ch ='0';
		System.out.print(ch-- + --ch);
		
		System.out.println();
		
		boolean x=true;
		boolean y=false;
		System.out.print(x && y);
		
		
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+j-1 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==n||j==i)
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
		
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==n||j==1||j==i)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==n||i==j)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		for(int  i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}

		
		
		System.out.println();
		

		for(int  i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print(i+k-1+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				if(i==1||j==1||j==(n-i)+1)
				{
					System.out.print(i+j-1 + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
				
		}
		
		
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=n;i++)
		{
			int count1=1;
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j<i)
				{
					System.out.print(count1++ + " ");
				}
				else
				{
					System.out.print(count1-- + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			int count2=1;
		
			for(int j=1;j<=(2*i)-1;j++)
			{
				if(j<i)
				{
					System.out.print(count2++);
				}
				else
				{
					System.out.print(count2--);
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=1;i<=n;i++)
		{
			int count3=1;
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j<i)
				{
					System.out.print(count3++);
				}
				else
				{
					System.out.print(count3--);
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			
			{
				if(i%2==0)
				{
					System.out.print(i+1);
				}
				for(int j=1;j<=n;j++) {
				System.out.print(i);
				}
				if(i%2!=0)
				{
					System.out.print(i+1);
				}
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=n;i++)
		{
			int count4=i*(i+1)/2;
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(count4 <= 9)
				{
					System.out.print("0");
				}
				System.out.print(count4--+" ");
				if(j<i)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		char ch1='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch1);
			}
			System.out.println();
			ch1++;
		}
		
		
		for(int i=1;i<=n;i++)
		{
			char ch2='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch2++);
			}
			System.out.println();
		}
		
		char ch3='A';
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch3);
				ch3++;
			}
			System.out.println();
			
			
		}
		
		
		char ch5='A';
		for(int i=1;i<=n;i++)
		{
			if(i%2 == 0)
			{
				char chRev=(char)(ch5+ i - 1);
				for(int j=1;j<=i;j++)
				{
					System.out.print(chRev-- + " ");
					ch5++;
				}
				System.out.println();
					
			}
			else
			{
				for(int j=1;j<=i;j++) 
				{
					System.out.print(ch5 +" ");
					ch5++;
				}
				System.out.println();
				
			}
		}
		
		
	}
	

}
