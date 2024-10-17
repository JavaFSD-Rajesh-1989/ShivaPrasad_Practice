package pattern;

public class M1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(j==1||i==5||i==j)
				{
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
