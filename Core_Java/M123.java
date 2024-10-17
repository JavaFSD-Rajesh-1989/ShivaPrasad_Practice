package pattern;
import java.util.Scanner;

public class M123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("enter n value :");
		int n=scan.nextInt();
		System.out.print("Enter m value :");
		int m=scan.nextInt();
		System.out.print("Enter o value :");
		int o=scan.nextInt();
	
		int[][][]a=new int[n][m][o];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print("Hi ");
				}
				System.out.println();
			}
			System.out.println();
		
		}

	}

}
