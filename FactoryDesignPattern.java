package Factorydesign;

public interface Employee {
	
	public int salary();
	

}

public class AndroidDev implements Employee {

	
	public int salary() {
		System.out.println("this is Android developer");
				return 500000;
	}
	
	

}



public class WebDev implements Employee {

	@Override
	public int salary() {
		System.out.println("this is web developer");
		return 60000;
	}
	

}

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


public class Client {
public static void main(String[] args) {
	Employee empl=EmployeeFactory.getemployee("webdev");
	System.out.println(empl);
	int re= empl.salary();
	System.out.println(re);
	
	Employee empl2=EmployeeFactory.getemployee("androiddev");
	System.out.println(empl2);
	int re1=empl2.salary();
	System.out.println(re1);
	
}
}
