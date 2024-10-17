package pattern;
import java.util.Scanner;
public class Pat {
	
	
	double area(int r)
	{
		double area=3.14*r*r;
		System.out.println(area);
		return area;
	}
		
	double Carea(int rad1,int hei)
	{
			double Cyarea = 2*3.14*rad1*(rad1+hei);
			return Cyarea;
	}
		
		
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pat a=new Pat();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Radius :");
		int r=scan.nextInt();
		System.out.print("Area of circle is :");
		a.area(r);
		
		
		System.out.print("Enter Radius of Cylinder :");
		int rad = scan.nextInt();
		System.out.print("Enter Height of cylinder :");
		int hei=scan.nextInt();
		double res1=a.Carea(rad,hei);;
		
		System.out.println("Area of Cylinder is :"+res1);
		
		
		
		

	}

}
