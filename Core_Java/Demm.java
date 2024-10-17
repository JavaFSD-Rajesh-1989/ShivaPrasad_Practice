package pattern;
class Customer{
	private int cid;
	private String cname;
	private int cnum;
	
	public Customer() 
	{
		cid=1;
		cname="Arul";
		cnum=9868;
	}
	
	public Customer(String cname)
	{
		this();
		this.cname=cname;
		
	}
	
	public Customer(int cid,String cname,int cnum) {
		this(cid,cname);
		
	}
	
	public Customer(int cid,String cname) {
		this();
		this.cid=cid;
		this.cname=cname;
		
	}
	
	public int getcid() {
		return cid;
	}
	
	public String getcname() {
		return cname;
	}
	
	public int getcnum() {
		return cnum;
	}
	
}

public class Demm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c= new Customer(2,"Alex",6758);
		System.out.println(c.getcid());
		System.out.println(c.getcname());
		System.out.println(c.getcnum());
		

	}

}
