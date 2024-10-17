package pattern;

public class AllPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=5;
		int n=5;
		for (int i = 1; i<=m;i++)
		{
			for (int j=1;j<=n;j++)
			{
				
				System.out.print("ABCDE" +" ");
			}
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(count<=9)
				{
					System.out.print("0");
				}
				
				System.out.print(count+" ");
				count++;
				
			}
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i*j<=9)
				{
					System.out.print("0");
				}
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<2;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int k=1;k<=4;k++)
		{
			for(int l=1;l<=5;l++)
			{
				System.out.print(k+l);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		char ch='A';
		for(int i=1;i<5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==5||i==j)
				{
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
												
			}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==5||i==j)
				{
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==5||i==j)
				{
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
		
		int dup=5;
		for(int i=1;i<=dup;i++)
		{
			for(int k=1;k<=dup-i;k++)
			{
				System.out.print(i+k-1);
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				if(i==1||j==1||j==i)
				{
					System.out.print(i+j-1 + " ");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(5-i);
			}
			System.out.println();
		}
		
		
		int countt=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(countt + " ");
				countt++;
			}System.out.println();
			}
			
	
		
		
		char chh = 'A';
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(chh);
				chh++;
			}
			System.out.println();
			
				
		}
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(" ");
			}
			int m88=1;
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print(m88++);
			}
			System.out.println();
		}
		
		
		
		char sek='A';
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print(sek);
			}
			System.out.println();
			sek++;
			 
		}
		
		
		
		
		
		
		
		
		for(char i='A';i<='E';i++)
		{
			
			
			
			
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println(); 
			
		}
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(char i='A';i<='E';i++)
		{
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(" ");
			}
			
			for(char j='B';j<=i;j++)
			{
				System.out.print(j);
				
				
			}
			System.out.println();
			
		}
		
		for(char i='A';i<='E';i++)
		{
			
		}
		
		int m14=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(m14);
			}
			System.out.println();
			m14--;
		
		}
		
		

		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(" ");
			}
			int sekkk=(2*i)-1;
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print(sekkk--);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		int sh=4;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(sh);
			}
			
			
			
			for(int a=1;a<=4-i;a++)
			{
				System.out.print(sh);
			}
			System.out.println();
			sh--;
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		int sh1=7;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(sh1);
			}
			
			
			
			for(int a=2;a<=5-i;a++)
			{
				System.out.print(sh1);
			}
			System.out.println();
			sh1--;
			sh1--;
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int sh2=5;
		for(int i=1;i<=4;i++)
		{
			
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(j);
			}
			
			
			
			for(int a=1;a<=4-i;a++)
			{
				System.out.print(sh2);
				sh2++;
				
			}
			System.out.println();
			sh2--;
		}
		
		int sh33=5;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=6-i;k++) {
				System.out.print(sh33);
			}
			System.out.println();
			sh33--;
		}
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
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
		System.out.println();
		System.out.println();
		
		int r=5;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=r+1-i;a++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int i=1;i<=7;i++)
		{
			
			for(int j=1;j<=2;j++)
			{
				System.out.print(i);
			}
			System.out.println();
			
			
					
		}
		
		for(char i='D';i>='A';i--)
		{
			for(char j='D';j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
		
		for(int i=1;i<=3;i++)
		{
			char mn='D';
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(mn+" ");
				mn--;
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(char i='A';i<='D';i++)
		{
			for(char k='A';k<='E'-i;k++)
			{
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			char sg='A';
			for(int k=1;k<=i;k++)
			{
				if(i==1)
				{
					System.out.print(" ");
				}
				System.out.print(sg);
				sg++;
				
			}
			System.out.println();
			
			
			
		}
		
		for(char i='A';i<='E';i++)
		{
			for(char k='A';k<=i;k++)
			{
				System.out.print(" ");
			}
			for(char j='A';j<='F'-i;j++)
			{
				System.out.print(i+j-1 + " ");
			}
			System.out.println();
		}
		
		
		
		char sg1='A';
		for(int i=1;i<=5;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(i+j-1+" ");
				
			}
			System.out.println();
			
		}
		char sw='A';
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(sw+" ");
			}
			System.out.println();
			sw++;
		}
		char se='D';
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(se+" ");
			}
			System.out.println();
			se--;
		}
		
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i) {
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(char i='A';i<='F';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==1||i==7||j==1||j==7)
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
	}
	
	

}
