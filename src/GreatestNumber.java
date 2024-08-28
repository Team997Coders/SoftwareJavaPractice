public class GreatestNumber {

    public static int highestNumber(int one, int two, int three) {
        int output = 0;
        if (one > two) {
            if (one > three) {
                output = one;
            } else {
                output = three;
            }
        } else if (two > one) {
            if (two > three) {
                output = two;
            } else {
                output = three;
            }

        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(highestNumber(1, 2, 3));
        System.out.println(highestNumber(1, 3, 2));
        System.out.println(highestNumber(3, 2, 1));
        System.out.println(highestNumber(3, 1, 2));
        System.out.println(highestNumber(2, 3, 1));
        System.out.println(highestNumber(2, 1, 3));
        

        

    }
}
