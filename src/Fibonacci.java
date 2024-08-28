//3

public class Fibonacci {

public static void main(String[] args) {
    int n = 10;

    int currentNumber = 0;
    int lastNumber = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print((currentNumber) + ", ");

            int oldCurrentNumber = currentNumber;
            currentNumber = lastNumber + currentNumber;
            lastNumber = oldCurrentNumber;
       }

    }
}
