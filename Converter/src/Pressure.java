
public class Pressure {
	
	private double bar;
	private final double psi = 14.5;
	
	Pressure(double bar){
		this.bar = bar;
		System.out.println("1 Bar -> " + psi + " Psi");
	}
	
	public double showPressure(double bar){
			
		return bar * psi;
	}
}
