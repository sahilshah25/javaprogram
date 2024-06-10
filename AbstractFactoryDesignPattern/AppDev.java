package AbstractFactoryDesignPattern;

public class AppDev implements Employee{

	@Override
	public int salary() {
		/
		return 40000;
	}

	@Override
	public String name() {
		System.out.println("i am a APPDEV");
		return "Appdev";
	}
	
}
