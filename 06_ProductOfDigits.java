import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int product = 1;

        if (n == 0) product = 0;

        while (n > 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        System.out.println("Product = " + product);
    }
}
