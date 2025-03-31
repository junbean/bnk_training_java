package ex06;

public class Animal_test {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		Dog dog = new Dog();
		Animal ccc = new Cat();
		Animal animal = new Animal();
		
		//cat.cry();
		//tiger.cry();
		//dog.cry();

		Animal[] animals = new Animal[3];
		animals[0] = cat;
		animals[1] = dog;
		animals[2] = tiger;
		
		for(int i=0; i<3; i++) {
			animals[i].cry();
		}
	}
}
