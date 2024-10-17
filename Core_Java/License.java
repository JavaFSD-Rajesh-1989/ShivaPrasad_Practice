package pattern;
import java.util.*;
public class License {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Age please");
		int age=scan.nextInt();
		System.out.println("Did you cleared the exam"+ "\n" 
		+"enter input in true or false format only");
		boolean test=scan.nextBoolean();
		
		if(age>=18 && test==true) {
			System.out.println("Cleared");
		}
		else if(age>=18 && test==false) {
			System.out.println("clear test first");
		}
		else {
			System.out.println("Disqualified");
		}

	}
}
