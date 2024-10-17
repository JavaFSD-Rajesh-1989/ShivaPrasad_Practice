package pattern;

public class Real {
	private int CId;
	private String CName;
	private int CNum;
	
	public GetSet(int CId,String CName,int CNum)
	{
		this.CId=CId;
		this.CName=CName;
		this.CNum=CNum;
	}
	
	public int GetCId()
	{
		return CId;
	}
	public String GetCName()
	{
		return CName;
	}
	public int GetCNum()
	{
		return CNum;
	}
public class GetSet{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSet g= new Real(1,"shiv",9390);
		System.out.println(g.GetCId());
		System.out.println(g.GetCName());
		System.out.println(g.GetCNum());
		
	
		
		

	}

}
}