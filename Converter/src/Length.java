public class Length extends Converter{
	private final double foot = 0.0328;

	Length (){
		System.out.println(this);
	}

	@Override
	public double count(double value) {
		return value * this.foot;
	}

	@Override
	public String toString() {
		return "Length{" +
				"1 centimeter = " + this.foot + "foot"  +
				'}';
	}
}
