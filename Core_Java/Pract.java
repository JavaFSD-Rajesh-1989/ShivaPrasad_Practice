package pattern;

import java.util.Scanner;

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int n1=n%10;
		sum=sum+n1;
		n=n/10;
		System.out.println(sum);
	}

}
