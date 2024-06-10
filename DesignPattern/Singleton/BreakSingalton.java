package Singleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingalton {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	//	USING RUNTIME REFLEX API
		
		
		
		//Car2 c1=Car2.getcar2();
		//System.out.println(c1.hashCode());
		
		//Constructor<Car2> cons=Car2.class.getDeclaredConstructor();
		//cons.setAccessible(true);
		//Car2 car=cons.newInstance();
		//System.out.println(car.hashCode());
		
		
		// USING ENUM 
		
		
		
		//Car3 c1=Car3.INSTANCE;
		//System.out.println(c1.hashCode());
		//c1.test();
		//Constructor<Car3> cons=Car3.class.getDeclaredConstructor();
		//cons.setAccessible(true);
		//Car3 car=cons.newInstance();
		//System.out.println(car.hashCode());
		
	}
	
}
