public class Weight extends Converter{
	private final double pound = 2.2;
	
	Weight(){
		System.out.println(this);
	}

	@Override
	public double count(double value) {
		return value + this.pound;
	}

	@Override
	public String toString() {
		return "Weight{" +
				"1 kilo = " + this.pound + " pound" +
				'}';
	}
}
