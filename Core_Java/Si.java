package pattern;
import java.util.Scanner;

class Bacc{
	private float p;
	private float t;
	static private float r;
	private float si;
	
	static {
		r=15.2f;
	}
	
	public Bacc()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter p value");
		p=scan.nextFloat();
		System.out.println("Enter t value");
		t=scan.nextFloat();
		
		si=(p*t*r)/100;
		
	}
	
	public float disp() {
		return si;
	}
	
	
}


public class Si {
	public static void main(String[] args) {
		Bacc b=new Bacc();
		
		System.out.println("Simple interest is: "+b.disp());
		
	}
	
	
	
}
