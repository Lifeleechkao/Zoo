package animals;

import interfaces.SpecificAction;

public class SpottedHyena extends Hyena implements SpecificAction{

	public SpottedHyena(String name) {
		super(name);

	}
	@Override
	public String doSpecificAction(String action) {
		 action = "Give me something to hunt or eat grrrrrr.";
		return action;
		
	}

}
