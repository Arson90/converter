public class Temperature extends Converter{
	private final double fahrenheit = 33.8;
	
	Temperature(){
		System.out.println(this);
	}

	@Override
	public double count(double value) {
		return (value * 1.8) + 32;
	}

	@Override
	public String toString() {
		return "Temperature{" +
				"1 degree celsius = " + this.fahrenheit + " fahrenheit" +
				'}';
	}
}
