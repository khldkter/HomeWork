package hw5Q3Constructor;

public class StudentTest {

	public static void main(String[] args) {
	Student obj1=new Student();				
	Student obj2=new Student("Khaleda Akter",287,'F',true,3.67898f);	
		
	System.out.println("stname: "+obj2.name+"\nStId: "+obj2.stID+"\nsex: "+obj2.sex+"progammer: "+obj2.progammer+"grade: "+obj2.grade  );	
		
		
		
	}

}
  