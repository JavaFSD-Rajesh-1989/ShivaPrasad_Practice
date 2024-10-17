package pattern;
class Heart{
	private int Weight;
	private int Bpm;
	public Heart(int weight, int bpm) {
		super();
		this.Weight = weight;
		this.Bpm = bpm;
	}
	public int getWeight() {
		return Weight;
	}
	public int getBpm() {
		return Bpm;
	}
	
}


class Brain{
	private int Weight;
	private String Color;
	public Brain(int weight, String color) {
		super();
		Weight = weight;
		Color = color;
	}
	public int getWeight() {
		return Weight;
	}
	public String getColor() {
		return Color;
	}
	
}

class Bike{
	private String Brand;
	private float Mileage;
	public Bike(String brand, float mileage) {
		super();
		Brand = brand;
		Mileage = mileage;
	}
	public String getBrand() {
		return Brand;
	}
	public float getMileage() {
		return Mileage;
	}
	
	
}

class Book{
	private String Name;
	private String Author;
	public Book(String name, String author) {
		super();
		Name = name;
		Author = author;
	}
	public String getName() {
		return Name;
	}
	public String getAuthor() {
		return Author;
	}
	
}


class Student{
	Heart h=new Heart(58,72);
	Brain b=new Brain(2,"Grey");
	
	public void hasA(Bike bi) {
		System.out.println(bi.getBrand());
		System.out.println(bi.getMileage());
		
	}
	
	public void hasA(Book bo) {
		System.out.println(bo.getAuthor());
		System.out.println(bo.getName());
	}
}
public class Poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		
		Bike b=new Bike("KTM",33.4f);
		Book bo=new Book("Forbs","BBC");
		s.hasA(b);
		s.hasA(bo);

		
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getBpm());
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getColor());
		
		
		
	
	}

}
