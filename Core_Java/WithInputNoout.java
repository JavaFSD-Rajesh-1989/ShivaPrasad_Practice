package pattern;

public class WithInputNoout {
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		WithInputNoout a=new WithInputNoout();
		
		int x=50;
		int y=40;
		a.add(x,y);
		
	}

}
