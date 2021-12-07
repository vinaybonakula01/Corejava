package Inheritance.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalRunner {

	public static void main(String[] args) {
		List<Animal> dogimmutablelist = List.of(new Dog("chow chow","brown",35),new Dog("husky","blue",60),new Dog("germanshepad","black",45));
		List<Animal> dogimmutablelistAl =new ArrayList<>(dogimmutablelist);
		List<Animal> catimmutablelist = List.of(new Cat("persian","white",30),new Cat("mainecoon","red",16),new Cat("bengalcat","multicolour",12));
		List<Animal> catimmutablelistAl = new ArrayList<>(catimmutablelist);
		Collections.sort(dogimmutablelistAl);
        System.out.println(dogimmutablelistAl);
        Collections.sort(catimmutablelistAl);
        System.out.println(catimmutablelistAl);
	}

}
