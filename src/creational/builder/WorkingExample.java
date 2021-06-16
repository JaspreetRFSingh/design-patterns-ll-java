package creational.builder;

public class WorkingExample {

	public static void main(String[] args) {
		User user1 = new User.UserBuilder("Jaspreet", "Singh").age(30).phone("3486981651").address("Fake address 1234")
				.build();

		System.out.println(user1);
		User user2 = new User.UserBuilder("Jaspreet", "Kaur").age(30).phone("89788668489")
				.build();

		System.out.println(user2);
	}

}
