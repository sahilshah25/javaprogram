package Singleton;




public class Main {
	public static void main(String[] args) {
		Car car1=Car.getcar();
		System.out.println(car1.hashCode());
		Car car2=Car.getcar();
		System.out.println(car2.hashCode());
		
		Person per1=Person.getperson();
		System.out.println(per1.hashCode());
		Person per2=Person.getperson();
		System.out.println(per2.hashCode());
		
		
		
		Car2 carcar=Car2.getcar2();
		System.out.println(carcar.hashCode());
		Car2 carc=Car2.getcar2();
		System.out.println(carc.hashCode());
		
		
		
		
	}

}
