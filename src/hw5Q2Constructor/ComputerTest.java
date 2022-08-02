package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		// default constructor Initialized
		Computer obj1 = new Computer();

		Computer obj2 = new Computer("Apple", "MacBook Air", "MacOSMojave", "$800", 'A', false);
		Computer obj3 = new Computer("Hp", "envy", "windows", "$900", 'A', false);

		System.out.println("\n********************\n");
		
		System.out.println("My Brand: " + obj2.brand + "\nModel: " + obj2.model + "\nOperating system: " + obj2.OS
				+ "\nPrice:" + obj2.price + "\nGrade: " + obj2.grade + "\nMadeInUSA: " + obj2.madeInUSA);

		System.out.println("\n********************\n");
		
		System.out.println("My Brand: " + obj3.brand + "\nModel: " + obj3.model + "\nOperating system: " + obj3.OS
				+ "\nPrice:" + obj3.price + "\nGrade: " + obj3.grade + "\nMadeInUSA: " + obj3.madeInUSA);

		
		
	}
}
