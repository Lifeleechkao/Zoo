package animals;

import interfaces.SpecificAction;

public class BrownHyena extends Hyena implements SpecificAction{
	public BrownHyena(String name) {
		super(name);

	}
	@Override
	public String doSpecificAction(String action) {
		 action = "I'm the rarest of them all grrr got some food?";
		return action;
		
	}

}
