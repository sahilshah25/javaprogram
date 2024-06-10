package AbstractFactoryDesignPattern;

public class WebDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee CreateEmployee() {
		// TODO Auto-generated method stub
		return new WebDev();
	}
	

}
