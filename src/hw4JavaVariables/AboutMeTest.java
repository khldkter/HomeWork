package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// 1st obj created and constructor initialized
		AboutMe me = new AboutMe();
		// variable initialized
		me.name = "Khaleda Akter";
		me.age = 32;
		me.houseRent = 2700;
		me.mouslim = true;
		me.phone = 2828100;
		me.savings = 5098000;
		me.sex = 'F';
		me.GPA = 4.65;
		me.height = 4.9007800f;

		// method call/initialized
		me.aboutMe();

		System.out.println("\n****************************\n");

		// 2nd obj created and constructor initialized
		AboutMe friend = new AboutMe();

		// variable initialized
		friend.name = "Alex";
		friend.age = 33;
		friend.GPA = 3.89;
		friend.height = 5.99996899f;
		friend.houseRent = 4870;
		friend.mouslim = false;
		friend.phone = 453897866;
		friend.savings = 756430;
		friend.sex = 'M';

		// method call/initialized
		friend.aboutMe();

	}

}
