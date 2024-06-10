package ObserverDesignPattern;

interface Subject {
	void Subscribe(Observer ob);
	void Unsubscribe(Observer ob);
	
	void NewVideoUploaded(String title);
	
	
	

}
