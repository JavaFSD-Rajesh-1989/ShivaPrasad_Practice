package pattern;

public class M3 {
	public static void main(String args[])
	{	
		int n = 5;
		for(int i = 0; i < n; i++)
		{
		for(int j = 0; j < n-i; j++)
		{
		System.out.print(j+1 + " ");
		}
		System.out.println();
		}

		int m=5;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m-i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			int count=1;
			for(int j=1;j<=(2*i)-1;j++)
			{
				
				if(j<i) {
					System.out.print(count++);
					
				}
				else {
				System.out.print(count--);
				}
			}
			System.out.println();
				
		}
		
		char chhhh='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(chhhh + " ");
				chhhh++;
			}
			System.out.println();
		}
				
		
		char m1='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(m1+" ");
			}
			System.out.println();
			m1++;
		}
		
		
		char m2='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1)
				{
					System.out.print(m2+" ");
				}
				else {
				System.out.print(m2);
				}
			}
			System.out.println();
			m2++;
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			char m3='A';
			for(int j=1;j<=5;j++)
			{
				
				System.out.print(m3 + " ");
				m3++;
			}
			System.out.println();
			
		}
		
		int nn=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(nn);
				
			}
			System.out.println();
			nn--;
		}
		
		

		
		for(int i=1;i<=5;i++)
		{
			int nnn=5;
			for(int j=1;j<=5;j++)
			{
				
				System.out.print(nnn);
				nnn--;
				
			}
			System.out.println();
			
		}
		
		char m11='E';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1)
				{
					System.out.print(m11 + " ");
				}
				else {
					System.out.print(m11);}
				}
			System.out.println();
			m11--;
		}	
		
		
		;
		for(int i=1;i<=5;i++)
		{
			char m12='E';
			for(int j=1;j<=5;j++)
			{
				System.out.print(m12+" ");
				m12--;
			}
			System.out.println();
				
		}
		
		
		
		
		
		char m13='A';
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print(m13+" ");
				}
				else
				{
					System.out.print(m13);
				}
				
			}
			System.out.println();
			m13++;
		}
		
		int nnn=5;
		for(int i=1;i<=nnn;i++)
		{
			for(int j=0;j<=nnn-i;j++)
			{
				System.out.print("1");
				
			}
			System.out.println();
		}
		
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||j==1||j==-i)
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
		
		
		
		char m4='E';
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(m4+" ");
				
			}
			System.out.println();
			m4--;
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		}
}
