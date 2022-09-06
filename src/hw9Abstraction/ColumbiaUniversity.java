package hw9Abstraction;
//importing MedicalScholl as it is in diff package
import hw8Inheritance.MedicalSchool;
//inherit the MedicalSchool interface by using extend keyword in concrete/regular classs
public class ColumbiaUniversity extends MedicalSchool{
//public abstract void chemistry ();
//can not create abstract method
	
//non abstract method	
public void nambiologye() {
System.out.println("this is from non abstract method");	

}	

//constructor 
public ColumbiaUniversity () {
	
}
//Override the abstract method of MedicalSchool
@Override
public void biochemistryLab() {
	// TODO Auto-generated method stub
	
}

@Override
public void hygiene() {
	// TODO Auto-generated method stub
	
}	
	
	
}
