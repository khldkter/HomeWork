package hw9Encapsulation;

public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getSex() {
		return sex;
	}
	

}
