public class Speed extends Converter{
	private final double mile = 0.62;

	Speed(){
		System.out.println(this);
	}

	@Override
	public double count(double value) {
		return value * this.mile;
	}

	@Override
	public String toString() {
		return "Speed{" +
				"1 km/h = " + this.mile + " miles" +
				'}';
	}
}
