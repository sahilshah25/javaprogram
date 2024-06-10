package Factorydesign;

public class EmployeeFactory {
	public static Employee getemployee(String type) {
		if(type.trim().equalsIgnoreCase("WEBDEV")) {
			return new WebDev();
		}else if(type.trim().equalsIgnoreCase("ANDROIDDEV")) {
			return new AndroidDev();
		}else {
			return null;
		}
	}

}
