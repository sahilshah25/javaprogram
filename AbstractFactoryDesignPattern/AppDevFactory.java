package AbstractFactoryDesignPattern;

public class AppDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee CreateEmployee() {
				return new AppDev();
	}

}
