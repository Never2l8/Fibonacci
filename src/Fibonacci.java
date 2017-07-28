import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in the Fibonacci series: ");
        int seriesNumber = input.nextInt();
        int fib[] = new int[seriesNumber];
        System.out.println("The Fibonacci series of " + seriesNumber + " is:");
        for (int i = 0; i < seriesNumber; i++) {
            if (i < 2)
                fib[i] = 1;
            else fib[i] = fib[i - 1] + fib[i - 2];

            System.out.print(fib[i] + "\t");

        }


    }
}

