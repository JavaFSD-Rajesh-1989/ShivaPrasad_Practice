package pattern;
//Pass by reference
public class Pass {
	String name;
	int cost;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pass a = new Pass();
		a.name="Benz";
		a.cost=550000;
		
		Pass b;
		b=a;
		
		System.out.println(a.name);
		System.out.println(a.cost);
		
		System.out.println(b.name);
		System.out.println(b.cost);
		
		b.name="kia";
		b.cost=999999;
		
		System.out.println(a.name);
		System.out.println(a.cost);
		
		System.out.println(b.name);
		System.out.println(b.cost);
		
		//Type casting
		
		int a1=67;
		byte a2=(byte)a1;
		System.out.println(a1);
		System.out.println(a2);
		
		

		//pass by value
		
		
		int b1=23;
		int b2=b1;
		
		System.out.println(b1);
		System.out.println(b2);
		
		b2=55;
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		//Arrays
		
		int[][]a12=new int[2][5];
		a12[1][4]=55;
		a12[0][1]=45;
		System.out.println(a12[1][4]);
		System.out.println(a12[0][2]);
		System.out.println(a12);
		
		
		//wrapper class
		
		int aa=34;
		Integer ab;
		ab=aa;
		System.out.println(aa);
		System.out.println(ab);
		
		
		
		

	}

}
