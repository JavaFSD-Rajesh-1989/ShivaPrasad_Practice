package pattern;

public class Pat1 {
	void Pat(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pat1 a=new Pat1();
		int n=10;
		a.Pat(n);
		

	}

}
