package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

//default constructor:
	public Student() {
		System.out.println("This is from default Constructor of Studentclass");
	}

//parameterized constructor:
	public Student(String stName, int stID, char sex, boolean isProgrammer, float grade) {
		System.out.println("This is parameterized constructor");
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

	}

}
