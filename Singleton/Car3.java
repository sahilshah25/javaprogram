//USING ENUM


package Singleton;

public enum Car3 {
	INSTANCE;
	//private static Car3 car;
	
	//private Car3() {
	//	if(car!=null) {
	//		throw new RuntimeException("you are trying to brek singleton pattern");
	//	}
	//	
	//}
	//public static Car3 getcar2() {
	//	if(car==null) {
	//		synchronized(Car3.class) {
	//		if(car==null) {
	//			car=new Car3();
	//		}
	//		
	//		
	//	}
	//	
	//}
	//	return car;

//}
	public void test() {
		System.out.println("test method");
	}
}
