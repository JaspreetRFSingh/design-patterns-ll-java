package behavioral.strategy;

public class EmailShareStrategy implements ShareStrategy {

	@Override
	public void share() {
		System.out.println("Sharing via email!");
	}

}
