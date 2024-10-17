package pattern;

class Plane{
	int x=10;
	
	
}

class CargoPlane extends Plane{
	
}

class Parent extends Plane{
	int x=200;
	public Plane p()
	{
		System.out.println("Inside Parent");
		Plane p=new Plane();
		return p;
			
	}
}

class Child extends Parent{
	public CargoPlane cp() {
		System.out.println(x);
		System.out.println("Inside Child");
		CargoPlane cp=new CargoPlane();
		return cp;
	}
}

public class Plan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.cp();

	}

}
