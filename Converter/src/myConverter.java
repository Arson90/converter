import java.util.Scanner;

public class myConverter {

	public static void main(String[] args) {
		
		int numberSwitch = 0;
		double giveNumber = 0;
		double result = 0;
		
		Scanner newNumber = new Scanner(System.in);
		
		int change = 1;
		while(change >= 1){
			
			System.out.println("*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
			System.out.println("# Converter                   #");
			System.out.println("* 1.Bar         -> Psi        *");
			System.out.println("# 2.Kilo        -> Pound      #");
			System.out.println("* 3.Centimeters -> Foot       *");
			System.out.println("# 4.Celsius     -> Fahrenheit #");
			System.out.println("* 5.Km/h        -> Mile       *");
			System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
			
			numberSwitch = newNumber.nextInt(); 								//takes a number
			
			switch(numberSwitch){
			case 1:
				Pressure resultPressure = new Pressure(1);						//constructor with a default number
				System.out.println("Give number who want to convert from Bar to Psi: ");
				giveNumber = newNumber.nextDouble();							//takes a number
				result = resultPressure.showPressure(giveNumber);				//call methods "showPressure", return result and save to variable		
				System.out.println(giveNumber + " Bar -> " + result + " Psi");	//displays result
				break;
			case 2:
				Weight resultWeight = new Weight(1);
				System.out.println("Give number who want to convert from kilo to pound: ");
				giveNumber = newNumber.nextDouble();
				result = resultWeight.showWeight(giveNumber);
				System.out.println(giveNumber + " Kilo -> " + result + " Pound");
				break;
			case 3:
				Length resultLength = new Length(1);
				System.out.println("Give number who to convert from centimeters to foot: ");
				giveNumber = newNumber.nextDouble();
				result = resultLength.showLength(giveNumber);
				System.out.println(giveNumber + " Centimeters -> " + result + " Fooot");
				break;
			case 4:
				Temperature resultTemperatur = new Temperature(1);
				System.out.println("Give number who want to convert from celsius to fahrenheit: ");
				giveNumber = newNumber.nextDouble();
				result = resultTemperatur.showTemperature(giveNumber);
				System.out.println(giveNumber + " Celsius -> " + result + " Fahrenheit");
				break;
			case 5:
				Speed resultSpeed = new Speed(1);
				System.out.println("Give number who want to convert from km/h to mile: ");
				giveNumber = newNumber.nextDouble();
				result = resultSpeed.showSpeed(giveNumber);
				System.out.println(giveNumber + " Km/h -> " + result + " Mile");
				break;
				default:
					System.out.println("Liczba z poza zakresu!!!");
			}
		System.out.println("0 - EXIT, Value > 0 - CONTINUE");
		change = newNumber.nextInt();
		if(change == 0)
			System.out.println("EXIT CONVERTER, SEE YOU AGAIN !");
		
		}
	}

}
