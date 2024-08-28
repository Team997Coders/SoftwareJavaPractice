//4

public class OverTwentyFive {

    public static boolean isOverTwentyFive(int num) {
        boolean isOverTwentyFive = false;
        if (num >= 25) {
            isOverTwentyFive = true;
        } else if (num < 25) {
            isOverTwentyFive = false;
        }

        return isOverTwentyFive;
    }

    public static void main(String args[]) {
        int a = 46;
        int b = -5;
        int c = 14;

        System.out.println(isOverTwentyFive(a));
        System.out.println(isOverTwentyFive(b));
        System.out.println(isOverTwentyFive(c));


    }
    
}
