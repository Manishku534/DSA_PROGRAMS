import java.util.Scanner;

public class CountEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int count = 0;

        if (n == 0) count = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                count++;
            }

            n = n / 10;
        }

        System.out.println("Even digits = " + count);
    }
}
