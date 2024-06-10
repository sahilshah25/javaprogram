package AdapterPattern;

public class Iphone13 {
	private AppleCharger applecharger;
	public Iphone13(AppleCharger applecharger) {
		this.applecharger=applecharger;
	}
	
	
	public void chargeIphone() {
		applecharger.chargephone();
		
	}




}
