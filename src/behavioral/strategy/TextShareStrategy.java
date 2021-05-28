package behavioral.strategy;

public class TextShareStrategy implements ShareStrategy {
	@Override
	public void share() {
		System.out.println("Sharing via text!!");
	}
}
