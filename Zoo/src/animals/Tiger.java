package animals;

import biome.Lake;
import interfaces.Swimmable;

public class Tiger extends AllAnimals implements Swimmable{

	public Tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim(Lake l) {
		// TODO Auto-generated method stub
		System.out.println("I'm swimming in this " + l);
	}

	@Override
	protected String getSalutation() {
		// TODO Auto-generated method stub
		return " Hello there I'm a ";
	}

}
