import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if (n.length() > 1 && n.charAt(0) != '0' && n.contains("0"))
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}
