package ObserverDesignPattern;

public class Unsubscriber implements Observer {
	String name;
	public Unsubscriber(String name) {
		this.name=name;
	}

	@Override
	public void Notified(String tile) {
		
		
	}

	@Override
	public void removesubs(String remove) {
		System.out.println(name+"you unsbscribing this channel");
		
	}

}
