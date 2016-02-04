package animals;

import biome.Lake;
import interfaces.Swimmable;

public class PolarBears extends AllAnimals implements Swimmable{

	public PolarBears(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim(Lake l) {
		// TODO Auto-generated method stub
		System.out.println("I Like this " + l);
	}

	@Override
	protected String getSalutation() {
		// TODO Auto-generated method stub
		return "I'm a bear";
	}

}
