package animals;

import interfaces.SpecificAction;

public class BengalTiger extends Tiger implements SpecificAction{
	public BengalTiger(String name) {
		super(name);

	}
	@Override
	public String doSpecificAction(String action) {
		 action = "Roaaaaaaaaaaaaaaaaar I'm a bengal tiger";
		return action;
		
	}

}
