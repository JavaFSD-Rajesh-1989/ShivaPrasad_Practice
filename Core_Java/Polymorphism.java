package pattern;
import java.util.Scanner;
class Food{
	void Starters() {
		System.out.println("Starters are light food");
	}
	void Maincourse() {
		System.out.println("Main course are heavy");
	}
}


class Engagement extends Food{
	void Starters() {
		System.out.println("Engagement Starters are light food");
	}
	void Maincourse() {
		System.out.println("Engagement Main course are heavy");
	}
	void EndE() {
		System.out.println("Engagement ice cream");
	}
}

class Marriage extends Food{
	void Starters() {
		System.out.println("Marriage Starters are light food");
	}
	void Maincourse() {
		System.out.println("Marriage Main course are heavy");
	}
	void EndM() {
		System.out.println("Marriage ice cream");
	}

	
}

class Reception extends Food{
	void Starters() {
		System.out.println("Reception Starters are light food");
	}
	void Maincourse() {
		System.out.println("Reception Main course are heavy");
	}
	void EndR() {
		System.out.println("Reception ice cream");
	}
	
}

class Res{
	void Result(Food ref) {
		ref.Starters();
		ref.Maincourse();
	}
	
}

class Res1{
	static void Res(Food ref) {
		ref.Starters();
		ref.Maincourse();
	}
}


public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f=new Food();
		Engagement e=new Engagement();
		Marriage m=new Marriage();
		Reception r=new Reception();
		
		//call by using method
		Res re=new Res();
		Food ref;
		re.Result(f);
		
		re.Result(e);
		ref=e;
		((Engagement)ref).EndE();
		
		re.Result(m);
		ref=m;
		((Marriage)ref).EndM();
		
		re.Result(r);
		ref=r;
		((Reception)ref).EndR();
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//without calling method by using static
		Res1.Res(f);
		
		Res1.Res(e);
		ref=e;
		((Engagement)ref).EndE();
		
		Res1.Res(m);
		ref=m;
		((Marriage)ref).EndM();
		
		Res1.Res(r);
		ref=r;
		((Reception)ref).EndR();
		
	System.out.println();
	System.out.println();

	
	}

}