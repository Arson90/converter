package com.company;

import java.util.Scanner;

public abstract class Converter {
    private static char signToChooseFrom = 'y';
    private static int numberToChooseFrom = 0;
    private static double valueToConvert = 0;
    private static double resultAfterConverting = 0;

    public abstract double count(double value);

    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
            System.out.println("# Converter                   #");
            System.out.println("* 1.Bar         -> Psi        *");
            System.out.println("# 2.Kilo        -> Pound      #");
            System.out.println("* 3.Centimeters -> Foot       *");
            System.out.println("# 4.Celsius     -> Fahrenheit #");
            System.out.println("* 5.Km/h        -> Mile       *");
            System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
            System.out.println("Choose the right number: ");
            numberToChooseFrom = scanner.nextInt();

            switch (numberToChooseFrom) {
                case 1: {
                    Pressure resultPressure = new Pressure();
                    System.out.println("Give a value which you want to convert from Bar to Psi: ");
                    valueToConvert = scanner.nextDouble();
                    resultAfterConverting = resultPressure.count(valueToConvert);
                    System.out.printf("%.2f bar -> %.2f psi\n", valueToConvert, resultAfterConverting);
                    break;
                }
                case 2: {
                    Weight resultWeight = new Weight();
                    System.out.println("Give a value which you want to convert from Kilo to Pound: ");
                    valueToConvert = scanner.nextDouble();
                    resultAfterConverting = resultWeight.count(valueToConvert);
                    System.out.printf("%.2f kilo -> %.2f pound\n", valueToConvert, resultAfterConverting);
                    break;
                }
                case 3: {
                    Length length = new Length();
                    System.out.println("Give a value which you want to convert from Centimeters to foot: ");
                    valueToConvert = scanner.nextDouble();
                    resultAfterConverting = length.count(valueToConvert);
                    System.out.printf("%.2f centimeters -> %.2f foot\n", valueToConvert, resultAfterConverting);
                    break;
                }
                case 4: {
                    Temperature temperatur = new Temperature();
                    System.out.println("Give a value which you want to convert from Celsius to Fahrenheit: ");
                    valueToConvert = scanner.nextDouble();
                    resultAfterConverting = temperatur.count(valueToConvert);
                    System.out.printf("%.2f celsius -> %.2f fahrenheit\n", valueToConvert, resultAfterConverting);
                    break;
                }
                case 5: {
                    Speed speed = new Speed();
                    System.out.println("Give a value which you want to convert from Kilometers to Miles: ");
                    valueToConvert = scanner.nextDouble();
                    resultAfterConverting = speed.count(valueToConvert);
                    System.out.printf("%.2f km/h -> %.2f miles\n", valueToConvert, resultAfterConverting);
                    break;
                }
                default: {
                    System.out.println("Out of range number, try again !");
                    break;
                }
            }

            System.out.println("Enter y to EXIT or n to CONTINUE and press enter.");
            signToChooseFrom = scanner.next().charAt(0);
            if (signToChooseFrom == 'y')
                System.out.println("SEE YOU AGAIN !");
        } while (signToChooseFrom != 'y');
    }
}

