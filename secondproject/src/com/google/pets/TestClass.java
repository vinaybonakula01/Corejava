package com.google.pets;

public class TestClass {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name=" puppy";
		dog.colour=" blackcolour";
		dog.data=dog.colour+dog.name;
		System.out.println(dog.data+" is barking "+dog.bark());
		
		
		
		
		Cat cat=new Cat();
		cat.name="pussy";
		System.out.println(cat.name+" is responding"+cat.respond());
		
		
	
		
				
		

	}

}
