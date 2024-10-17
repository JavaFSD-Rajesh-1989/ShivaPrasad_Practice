package pattern;
import java.util.Scanner;

class OverAgeException extends Exception{
	
}
class UnderAgeException extends Exception{
	
}


class License12 {
	int age;
	
	void inputAge() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age man");
		age=scan.nextInt();
		}
	void verify() throws Exception {
		if(age<18) {
			System.out.println("Wrong age, Reenter man!!");
			UnderAgeException uae=new UnderAgeException();
			throw uae;
		}
		else if(age>64) {
			System.out.println("wrong age,Reenter it");
			OverAgeException oae=new OverAgeException();
			throw oae;
		}
		else if(age>=18 && age<=64) {
			System.out.println("Congrats License permitted");
		}
	}
}



class LicenseOff{
	void start() {
		License12 l=new License12();
		try {
			l.inputAge();
			l.verify();
		}
		catch(Exception e) {
			try {
				l.inputAge();
				l.verify();
			}
			catch(Exception f) {
				try {
				l.inputAge();
				l.verify();
				}
				catch(UnderAgeException g) {
					System.out.println("Too young...Hold your sugar man and be patient");
				}
				catch(OverAgeException h) {
					System.out.println("too old man cant give license");
				} 
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}

public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LicenseOff lo=new LicenseOff();
		lo.start();

	}

}
