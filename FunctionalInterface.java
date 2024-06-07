public interface functint {
	void canfly(String val);
    default void getheight() {
    	
    }
    
    static void caneat() {
    	
    	
    }
    String toString();

}
public class eagle implements functint {
	@Override
	public void canfly(String val) {
		System.out.println("eagle is implemented");
		
	}
	@Override
	public void caneat() {
		
	}
	
	public static void main(String[] args) {
		eagle eagleobj=new eagle();
        eagleobj.canfly("vertical");
        functint
		
		System.out.println(eagleobj);
        
        
        
        
        
	}
	package intern;
@FunctionalInterface

public interface anonymous {
	void canfly(String val);

}

public class peacock {
	public static void main(String[] args) {
		anonymous birdobj=new anonymous() {
			
			@Override
			public void canfly(String val) {
				System.out.println("peacock bird is implemented");
				
			}
		};
		birdobj.canfly("verrical");
		
		
		
		
	}

}
	
	
	
	
	
	

}

