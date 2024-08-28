//5

public class AbsoluteValue {

    public static double absoluteVal(double input) {
        double output = 0;
        if (input < 0) {
            output = -input;
        } else if (input >= 0) {
            output = input;
        }

        return output;
    }

    public static void main(String args[]) { 
        double a = -34.13;
        double b = 54.76;

        System.out.println(absoluteVal(a));
        System.out.println(absoluteVal(b));
    }
    
}
