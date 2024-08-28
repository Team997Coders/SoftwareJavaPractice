//6

public class TempConverter {

    public static String convertCelsiusAndKelvin(double input, boolean isCelsius) {
        double output = 0;
        String outputUnit = "a";

        if (isCelsius) {
            output = input + 273;
            outputUnit = "Kelvin"; 
        } else if (isCelsius == false) {
            output = input - 273;
            outputUnit = "degrees Celsius";
        }

        return Double.toString(output) + " " + outputUnit;


    }

    public static void main(String args[]) {
        Double degreesCelsius = 23.0;
        Double kelvin = 486.0;

        System.out.println(convertCelsiusAndKelvin(degreesCelsius, true));
        System.out.println(convertCelsiusAndKelvin(kelvin, false));
        
    }
    
}
