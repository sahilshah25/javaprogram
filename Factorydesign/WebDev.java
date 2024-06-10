package Factorydesign;

public class WebDev implements Employee {

	@Override
	public int salary() {
		System.out.println("this is web developer");
		return 60000;
	}
	

}
