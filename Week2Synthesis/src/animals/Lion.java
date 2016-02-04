package animals;

import biome.Plain;
import interfaces.Plains;

public class Lion extends AllAnimals implements Plains{

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void stalkPLain(Plain p) {
		// TODO Auto-generated method stub
		System.out.println("I'm the king of this " + p);
	}

	@Override
	protected String getSalutation() {
		// TODO Auto-generated method stub
		return "Roooaaaar";
	}

}
