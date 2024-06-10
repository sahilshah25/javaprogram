//USING RUNTIMEEXCEPTION
package Singleton;

public class Car2 {
	private static Car2 car;
	
	private Car2() {
		if(car!=null) {
			throw new RuntimeException("you are trying to brek singleton pattern");
		}
		
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
