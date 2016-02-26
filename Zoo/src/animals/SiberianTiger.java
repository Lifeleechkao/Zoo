package animals;
import interfaces.SpecificAction;

public class SiberianTiger extends Tiger implements SpecificAction {
	public SiberianTiger(String name) {
		super(name);

	}
	@Override
	public String doSpecificAction(String action) {
		 action = "Roaaaar I'm a Siberian Tiger";
		return action;
		
	}

}
