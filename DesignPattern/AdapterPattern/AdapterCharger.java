package AdapterPattern;

public class AdapterCharger implements AppleCharger {
   private AndroidCharger charger;
   
	public AdapterCharger(AndroidCharger charger) {
	
	this.charger = charger;
}

	@Override
	public void chargephone() {
		charger.ChargerAndroidphone();
		System.out.println("your phone is charging with adapter");
		
	}

}
