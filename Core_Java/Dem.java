package pattern;


class Test1{
	int x,y;
	int c=65;
	
	Test1(int x,int y){
		super();
		x=300;
		y=400;
	}
	
	Test1(){
		super();
		x=100;
		y=1000;
	}
	Test1(int c){
		
		this.c=78;
	}
	
	
	
}

class Test2 extends Test1 
{
	int a,b,c;
	
	
	Test2(){
		this(9,99);
		a=100;
		b=200;
	}
	Test2(int c){
		
		this.c=(super.c);
		
		
	}
	Test2(int a,int b){
		super(a,b);
		this.a=a;
		this.b=b;
	}
	
	
	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 t=new Test2();
		t.disp();
		
		

	}

}
