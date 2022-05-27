package com.bl.petmanagement;

public class Main {
   
	public static void main(String[] args) {
		System.out.println("Welcome to Pet Shop");
		
		Dog dog = new Dog();
		Duck duck = new Duck();
		Cat cat = new Cat();
		Parrot parrot = new Parrot();
		Rabbit rabbit = new Rabbit();
		
		PetStorage petStorage = new PetStorage();
		petStorage.add(dog);
		petStorage.add(cat);
		petStorage.add(duck);
		petStorage.add(parrot);
		petStorage.add(rabbit);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(petStorage.getPetList());
	}
}