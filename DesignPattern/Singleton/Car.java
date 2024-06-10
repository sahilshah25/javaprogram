package Singleton;

public class Car {
	private static Car car;
	private Car() {
		
	}
	public static Car getcar() {
		if(car==null) {
			car=new Car();
		}
		return car;
	}

}
