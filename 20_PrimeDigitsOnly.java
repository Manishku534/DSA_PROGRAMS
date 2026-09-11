import java.util.Scanner;

public class PrimeDigitsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        boolean allPrime = true;

        for (int i = 0; i < n.length(); i++) {
            char digit = n.charAt(i);

            if (digit != '2' && digit != '3' && digit != '5' && digit != '7') {
                allPrime = false;
                break;
            }
        }

        if (allPrime)
            System.out.println("All digits are prime");
        else
            System.out.println("All digits are not prime");
    }
}
