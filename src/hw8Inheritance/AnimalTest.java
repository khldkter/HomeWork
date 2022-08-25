package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		System.out.println("******Animal Clas obj*********");
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("*********Mamal Clas obj**********");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		// Hierarchical inheritance with Animal class
		mammal.animalInfo();
		
		System.out.println("********Dog Clas obj**********");
		Dog dog = new Dog();
		dog.dogInfo();
		// multi-level inheritance with Mamal and Animal class
		dog.mammalInfo();
		dog.animalInfo();
		
		System.out.println("*******BullDog Class obj************");
		BullDog bulldog = new BullDog();
		bulldog.bullDogInfome();
		// multi-level inheritance with Dog, Mamal and Animal Class
		bulldog.dogInfo();
		bulldog.mammalInfo();
		bulldog.animalInfo();
		
		System.out.println("********* Reptile Class obj**********");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		// Hierarchical inheritance with Animal class
		reptile.animalInfo();
		
		System.out.println("*********Snake Class obj**********");
		Snake snake = new Snake();
		snake.snakeInfo();
		// Multi-level inheritance with Reptile, Animal class
		snake.reptileInfo();
		snake.animalInfo();
		
		System.out.println("*********Cobra Class obj**********");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		// multi-level inheritance with Snake, Reptile and Animal class
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		
		System.out.println("********Birds Class obj***********");
		Birds bird = new Birds();
		bird.birdsInfo();
		// Hierarchical inheritance with Animal class
		bird.animalInfo();
		
		System.out.println("******Robin Class obj*************");
		Robin robin = new Robin();
		robin.robinInfo();
		// multi-level inheritance with Bird, Animal class
		robin.birdsInfo();
		robin.animalInfo();

	}

}
