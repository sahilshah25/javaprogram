// creating Singleton class


//synchronized way
public class Car2 {
	private static Car2 car;
	
	private Car2() {
	
		
	}
	public static Car2 getcar2() {
		if(car==null) {
			synchronized(Car2.class) {
			if(car==null) {
				car=new Car2();
			}
			
			
		}
		
	}
		return car;

}
}

// eager way

public class Person {
	private static Person per=new Person();
	public static Person getperson() {
		return per;
	}

}



//lazy way
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