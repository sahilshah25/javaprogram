package AbstractFactoryDesignPattern;

public class WebDev implements Employee {

	@Override
	public int salary() {
		
		return 50000;
	}

	@Override
	public String name() {
		System.out.println("i am a WEBDEV");
		return "WEBDEV";
	}
	

}
