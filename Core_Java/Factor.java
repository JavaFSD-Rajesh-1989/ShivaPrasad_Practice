package pattern;
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=count;j++) {
				if(i%3==0||i%5==0||i%7==0) {
					System.out.println(i);
					count++;
			}
			
				
			}
		}

	}

}
