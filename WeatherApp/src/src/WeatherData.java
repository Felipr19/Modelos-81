package src;

import java.util.List;

public class WeatherData implements Subject{

	private float temperature,humidity,pressure;
	private List<DisplayElement> observers; 
	

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	@Override
	public void registerObserver(DisplayElement display) {
		this.observers.add(display);
		System.out.println(display +" is a observer");
	}

	@Override
	public void removeObserver(DisplayElement display){
		
		
	}

	@Override
	public void notifyObserver() {

		
	}
	
	public void messurmentChanged() {
		
	}

	
	
}
