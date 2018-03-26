
public class Temperature {
	
	private double celsius;
	private final double fahrenheit = 33.8;
	
	Temperature(double celsius){
		
		this.celsius = celsius;
		System.out.println("1 degree Celsius -> " + fahrenheit + " fahrenheit");
	}
	
	public double showTemperature(double celsius){
		
		return (celsius * 1.8) + 32;
	}

}
