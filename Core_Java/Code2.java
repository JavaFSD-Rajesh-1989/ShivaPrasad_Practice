package pattern;

public class Cal3 {
	int a=50;
	int b=40;
//without input with output
	int add()
	{
		
		int c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		Cal3 a = new Cal3();
		int res = a.add();
		System.out.println(res);
		
		
	}
}
