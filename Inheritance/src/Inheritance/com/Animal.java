package Inheritance.com;

import java.util.Comparator;

public class Animal implements Comparable<Animal>{
	String breadname;
	String colour;
	int  lifespan;
	
	public String getbreadName() {
		return breadname;
	}
	public void setbreadName(String braedname) {
		this.breadname = breadname;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getLifespan() {
		return lifespan;
	}
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	} 
	
    public Animal(String breadname, String colour, int lifespan) {
		super();
		this.breadname = breadname;
		this.colour = colour;
		this.lifespan = lifespan;
	}
    
	class Animalcompartor implements Comparator<Animal>{

	@Override
	public int compare(Animal Animal1, Animal Animal2) {
			
	return (Animal1.getbreadName().compareTo(Animal2.getbreadName()));
	}
		
	}

	
	@Override
	public int compareTo(Animal that) {
		
		return Integer.compare(this.getLifespan(), that.getLifespan());
	}
	@Override
	public String toString() {
		return "Animal [breadname=" + breadname + ", colour=" + colour + ", lifespan=" + lifespan + "]";
	}
	

}
