import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;
        int temp = n;
        int divisor = 1;

        while (temp > 0) {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        if (square % divisor == n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}
