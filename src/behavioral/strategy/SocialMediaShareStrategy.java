package behavioral.strategy;

public class SocialMediaShareStrategy implements ShareStrategy{

	@Override
	public void share() {
		System.out.println("Sharing through Social Media!!");
	}

}
