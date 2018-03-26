
public class Speed {

	private double km;
	private final double mile = 0.62;
	
	Speed(double km){
		
		this.km = km;
		System.out.println("1 km/h -> " + mile + " mile");
	}
	
	public double showSpeed(double km){
		
		return km * mile;
	}
}
