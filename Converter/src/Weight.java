
public class Weight {
	
	private double kilo;
	private final double pound = 2.2;
	
	Weight(double kilo){
		this.kilo = kilo;
		System.out.println("1 kilo -> " + pound + "pound");
	}
	
	public double showWeight(double kilo){
		
		return kilo * pound;
	}
}
