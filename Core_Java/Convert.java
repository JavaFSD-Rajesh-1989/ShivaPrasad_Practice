package pattern;
import java.util.Scanner;

public class Convert {

	void celtofar(int Celsius)
	{
		int Far=(Celsius*9/5)+32;
		System.out.println(Far);
	}
	void fartocel(int Faren)
	{
		int Cel=(Faren-32)*5/9;
		System.out.println(Cel);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convert a=new Convert();
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("Enter Celsius value :");
		int Celsius=scan.nextInt();
		System.out.print("Farenheit value is :");
		a.celtofar(Celsius);
		
		
		System.out.print("Enter Farenheit value :");
		int Faren=scan.nextInt();
		System.out.print("Your celsius value is");
		a.fartocel(Faren);
		
		

	}

}
