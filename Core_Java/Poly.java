package pattern;
class Charger{
	//Aggregation
	private String brand;
	private float voltage;
	
	public Charger(String brand,float voltage) {
		this.brand=brand;
		this.voltage=voltage;
	}
	
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
}

class Os{
	//composition
	private String name;
	private float size;
	
	public Os(String name,float size)
	{
		this.name=name;
		this.size=size;
	}
	
	public String getName() {
		return name;
	}
	public float getSize() {
		return size;
	}
}

class Mobile{
	Os os=new Os("Vivo android",7.1f);//composition
	public void hasA(Charger ch) {	//Aggregation
		System.out.println(ch.getBrand());
		System.out.println(ch.getVoltage());
	}
}
public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charger c=new Charger("Samsung",9.8f);
		
		Mobile m=new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}

}
