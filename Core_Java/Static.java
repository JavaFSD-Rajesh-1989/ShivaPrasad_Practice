package pattern;
class Var{
	
	static int a,b;
	
	static
	{
		System.out.println("inside static block");
		a=10;
		b=01;
		System.out.println(a);
		System.out.println(b);
	}
	
	static void c1() {
		System.out.println("inside static method");
		
	}
	
	int x,y;
	
	{
		System.out.println("inside instance block");
	}
	
	void c2() {
		System.out.println("inside instance meyhod");
		a=11;
		b=111;
		System.out.println(a);
		System.out.println(b);
	}
	
}

public class Flowofexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Var.c1();
		
		Var v=new Var();
		v.c2();

	}

}
