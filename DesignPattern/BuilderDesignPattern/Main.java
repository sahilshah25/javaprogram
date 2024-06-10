package BuilderDesignPattern;

public class Main {
	public static void main(String[] args) {
	User user=	new User.UserBuilder().setEmailId("sahilshah84621@gmail.com").setUserName("sahil ahmad shah").setUserId("2022369268").built();
		System.out.println(user);
		
	}

}
