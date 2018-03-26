
public class Length {
	
	private double centimeters;
	private final double foot = 0.0328;
	
	Length(double centimeters){
		
		this.centimeters = centimeters;
		System.out.println("1 centimeters -> " + foot + "foot");
	}
	
	public double showLength(double centimeters){
		
		return centimeters * foot;
	}

}
