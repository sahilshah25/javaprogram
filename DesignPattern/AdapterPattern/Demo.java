package AdapterPattern;

public class Demo {
	public static void main(String[] args) {
		System.out.println("program started");
		AndroidCharger ad=new Dkcharger();
		AppleCharger charge=new AdapterCharger(ad);
	    Iphone13 iphone13=new Iphone13(charge);
	    iphone13.chargeIphone();
	    
	    
	}

}
