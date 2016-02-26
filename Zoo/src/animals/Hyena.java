package animals;

import biome.Plain;
import interfaces.Plains;

public class Hyena extends AllAnimals implements Plains{
	
	
	public Hyena(String name){
		super(name);
	}

	@Override
	public void stalkPLain(Plain p) {
		// TODO Auto-generated method stub
		
		System.out.println("Laughing in this " + p);
	}

	@Override
	protected String getSalutation() {
		// TODO Auto-generated method stub
		return "Nehahahahaa";
	}

}
