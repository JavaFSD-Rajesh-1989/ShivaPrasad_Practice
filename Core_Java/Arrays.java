package pattern;
import java.util.Scanner;
public class Arr {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//one dimensional array
				System.out.print("Enter size :");
				int num=scan.nextInt();
				int[] Numofstu=new int[num];
						long[]a=new long[num];
						long[]c=new long[num];
						
						for(int i=0;i<a.length;i++)
						{
							System.out.print("Enter "+i+" Student age");
							a[i]=scan.nextInt();
							System.out.print("Enter "+i+" student phn num");
							c[i]=scan.nextLong();
						
						}
						
						for(int i=0;i<a.length;i++)
						{
							System.out.print(a[i]+" ");
							System.out.print(c[i]+" ");
						}
						

		int[][][]aa=new int[2][][];
		aa[0]=new int[3][];
		aa[1]=new int[2][];
		aa[0][0]=new int[3];
		aa[0][1]=new int[2];
		aa[0][2]=new int[2];
		aa[1][0]=new int[2];
		aa[1][1]=new int[2];
		for(int i=0;i<aa.length;i++)
		{
			for(int j=0;j<aa[i].length;j++)
			{
				for(int k=0;k<aa[i][j].length;k++)
				{
					System.out.print("Enter the age of school "+i+" class "+j+" student "+k);
					aa[i][j][k]=scan.nextInt();
				}
				
				
			}
		}
		for(int i=0;i<aa.length;i++)
		{
			for(int j=0;j<aa[i].length;j++)
			{
				for(int k=0;k<aa.length;k++)
				{
					System.out.print(aa[i][j][k]);
				}
				System.out.println();
				
				
			}
			System.out.println();
		}
		
		System.out.println();

		int[][][] a1=new int[2][2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					System.out.print("enter:");
					a1[i][j][k]=scan.nextInt();
				}
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					System.out.print(a1[i][j][k]);
					
				}
				
			}
		}
		
		
		
		        
		


		//two dimensional array
		
		int[][]b=new int[2][5];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("Enter age of class "+i+" of student "+j);
				b[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		

	}

}
