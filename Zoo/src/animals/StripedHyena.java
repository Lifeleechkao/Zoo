package animals;

import interfaces.SpecificAction;

public class StripedHyena extends Hyena implements SpecificAction{
	public StripedHyena(String name) {
		super(name);

	}
	@Override
	public String doSpecificAction(String action) {
		 action = "I'm the smallest out of us grrrrr";
		return action;
		
	}

}
