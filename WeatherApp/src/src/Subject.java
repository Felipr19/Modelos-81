package src;

public interface Subject {

	public void removeObserver(DisplayElement display);
	
	public void notifyObserver();

	void registerObserver(DisplayElement display);
	
}
