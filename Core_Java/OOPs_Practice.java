package pattern;


class EduIns{
	void Adstu() {
		System.out.println("Stu admits");
		}
	void Conxm() {
		System.out.println("cond xm");
	}
	
}

class School extends EduIns {

	void Adstu() {
		System.out.println("School Stu admits");
		}
	void Conxm() {
		System.out.println("School cond xm");
	}
	void Trip() {
		System.out.println("School trip");
	}
	

}

class College extends EduIns{
	void Adstu() {
		System.out.println("College School Stu admits");
		}
	void Conxm() {
		System.out.println("College School cond xm");
	}
	void Intern() {
		System.out.println("Completed intern");
	}
	
}

class Uni extends EduIns{
	void Adstu() {
		System.out.println("Uni Stu admits");
		}
	void Conxm() {
		System.out.println("Uni cond xm");
	}
	void research() {
		System.out.println("research done");
	}
	
}


class Result{
	static void res(EduIns ref) {
		ref.Adstu();
		ref.Conxm();
		
	}
}


public class Sch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EduIns e=new EduIns();
		School s = new School();
		College c = new College();
		Uni u = new Uni();
		
		
		Result.res(e);
		Result.res(s);
		Result.res(c);
		Result.res(u);
		
		
}
}
