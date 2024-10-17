package pattern;
import java.util.Scanner;

class InvalidInputException extends Exception{
	
}


class Atm {
	int pin=9390;
	int p;
	
	void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pin");
		p=scan.nextInt();
		}
	
	void verify() throws Exception  {
		if(pin==p) {
			System.out.println("Collect money macha");
		}
		else {
			System.out.println("Invalid pin,Re-enter it");
			InvalidInputException iie=new InvalidInputException();
			throw iie;
			
		}
		
	}
}


class Bank{
	void start() {
		Atm a =new Atm();
		try {
		a.acceptInput();
		a.verify();
		}
		catch(Exception e) {
			try {
				a.acceptInput();
				a.verify();
			}
			catch(Exception f) {
				try {
					a.acceptInput();
					a.verify();
				}
				catch(Exception g) {
					System.out.println("card blocked u scammer");
				}
			}
		}
	}
}

public class AtmExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.start();

	}

}
