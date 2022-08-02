package hw5Q3Constructor;

public class StudentTest {

	public static void main(String[] args) {
	//default constructor initialized
	Student obj1=new Student();	
	//parameterized constructor initialized
	Student obj2=new Student("Khaleda Akter",287,'F',true,3.67898f);	
		
	System.out.println("Student name: "+obj2.stName+"\nStudent Id: "+obj2.stID+"\nStuden's sex: "+obj2.sex+"\nStudent is Progammer: "+obj2.isProgrammer+"\nStudent's grade: "+obj2.grade  );	
		
		
	}

}
  