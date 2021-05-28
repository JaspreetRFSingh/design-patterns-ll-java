package behavioral.strategy;

public abstract class PhoneCameraApp {
	
	ShareStrategy shareStrategy;
	
	public void setShareStrategy(ShareStrategy shareStrategy) {
		this.shareStrategy = shareStrategy;
	}
	
	public abstract void edit();
	
	public void share() {
		shareStrategy.share();
	}
	
	public void take() {
		System.out.println("Taking the pic!!");
	}
	
	public void save() {
		System.out.println("Saving the pic!!");
	}
	
}
