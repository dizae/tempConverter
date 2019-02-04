/**
* A temperature converter that asks the user for a temperature in either Fahrenheit 
* or Celsius and converts it to its equivalent in the other.
* 
* @Diza
*/
import java.util.*;

public class TempConverter
{
    public static void main(String args[])
    {
        {
        int repeat = 1;
        double myTemperature;
        String myUnit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a temperature to convert: ");
        
        while (repeat == 1) { //repeats conversion for as long as user inputs new temperature values
        
        myTemperature = scan.nextDouble(); //sets the user's input as the temperature value
        System.out.println("Is this in Fahrenheit or Celsius? Please enter F or C.");
        Scanner scan2 = new Scanner(System.in);
        myUnit = scan2.nextLine(); //identifies whether the user inputted degrees Fahrenheit or Celsius
        if (myUnit.equals("F")) {
         double myConversion = convertFtoC(myTemperature); //calls method that performs operations converting Fahrenheit to Celsius
         System.out.println("Your temperature is " + Math.floor(myConversion) + "° in Celsius."); //prints converted temperature rounded up to nearest integer
        }
        else if (myUnit.equals("C")) {
         double myConversion = convertCtoF(myTemperature); //calls method that performs operations converting Celsius to Fahrenheit
         System.out.println("Your temperature is " + Math.floor(myConversion) + "° in Fahrenheit."); //prints converted temperature rounded up to nearest integer
        }
        System.out.println("Convert another temperature?"); //prompts user to continue
        }
    }
    }
    public static double convertFtoC(double value) { //method with Fahrenheit to Celsius conversion factor, returns conversion
        double conversion;
        conversion = (value - 32) * 5/9.0;
        return conversion;
    }
    public static double convertCtoF(double value) { //method with Celsius to Fahrenheit conversion factor, returns conversion
        double conversion;
        conversion = value * 9.0/5 + 32;
        return conversion;
    }
}