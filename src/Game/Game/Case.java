package Game;

import java.io.Serializable;

public class Case implements Serializable {
	
	private Cube cube;	
	private Animal animal;
	
	public Case(Cube cube) {
		this.cube = cube;
	}
	public Case(Animal animal) {
		this.animal = animal;
	}
	
	public Cube getCube() {
		return this.cube;
	}

	public Animal getAnimal(){
		return this.animal;
	}

	public void setCube(Cube cube) {
		this.cube = cube;
	}
}
