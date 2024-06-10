package Singleton;

public class Person {
	private static Person per=new Person();
	public static Person getperson() {
		return per;
	}

}
