import java.util.Scanner;

public class RemoveZeroDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String result = "";

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '0') {
                result = result + n.charAt(i);
            }
        }

        System.out.println("After removing zero = " + result);
    }
}
