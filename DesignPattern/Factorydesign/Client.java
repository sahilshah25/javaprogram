package Factorydesign;




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
