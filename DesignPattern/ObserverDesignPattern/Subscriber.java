package ObserverDesignPattern;

public class Subscriber implements Observer {
	String name;
	Subscriber(String name){
		this.name=name;
	}

	@Override
	public void Notified(String title) {
		System.out.println(this.name +" new video uploaded : "+ title);		
	}

	@Override
	public void removesubs(String remove) {
				
	}


	

}
