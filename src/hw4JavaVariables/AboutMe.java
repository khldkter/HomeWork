package hw4JavaVariables;

import java.security.PublicKey;

public class AboutMe {
	// variables declared
	public String name;
	public byte age;
	public char sex;
	public boolean mouslim;
	public double GPA;
	public long savings;
	public short houseRent;
	public float height;
	public int phone;

	// Constructor declared
	public AboutMe() {
		System.out.println("This is all about us:");
	}

	// method implemented
	public void aboutMe() {
		System.out.println("My Name is: " + name + "\nMy age: " + age + "\nMysex :" + sex + "\nIam muslim: " + mouslim
				+ "\nMy GPA :" + GPA + "\nMysaving :" + savings + "\nMyhouserent " + houseRent + "\nMy height: "
				+ height + "\nMyphone: " + phone);

	}

}
