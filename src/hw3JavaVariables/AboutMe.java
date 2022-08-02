package hw3JavaVariables;

public class AboutMe {
//	variable declared
	public int id;
//	variable initialized
	public String name = "Khaleda Akter";
	public int age = 30;
	public long phone = 9292828100l;
	public byte height = 127;
	public float acount = 2.35490899f;
	public double lone = 1.4678904325637899;
	public char sex = 'F';
	public boolean girl = true;
	public short apartment = 8743;

	public static void main(String[] args) {
		AboutMe me = new AboutMe();

		System.out.println(
				"Aboutme- \n" + "name: " + me.name + " age:" + me.age + " sex:" + me.sex + " height:" + me.height);

	}
}
