package animals;

import interfaces.SpecificAction;

public class Aardwolf extends Hyena implements SpecificAction{
	public Aardwolf(String name) {
		super(name);

	}
	@Override
	public String doSpecificAction(String action) {
		 action = "Grrr you didn't think that I was a Hyena! Think again!!";
		return action;
		
	}

}
