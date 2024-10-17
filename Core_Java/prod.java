package pattern;
import java.util.*;
public class prod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=scan.nextInt();
		int prod=1;
		while(n>0) {
			int num=n%10;
			prod=prod*num;
			n=n/10;
		}
		System.out.println(prod);
		
	}

}
