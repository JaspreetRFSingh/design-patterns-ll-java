package behavioral.strategy;

public class WorkingExample {

	public static void main(String[] args) {
		PhoneCameraApp app = new CameraPlusApp();
		ShareStrategy shareOption = new SocialMediaShareStrategy();
		app.setShareStrategy(shareOption);
		app.take();
		app.edit();
		app.save();
		app.share();
	}

}
