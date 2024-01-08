import java.util.Scanner;

public class Putere2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti n:");
        int n = scanner.nextInt();
        int p = 1;
        p = (p << n);
        System.out.println("2^" + n + "=" + p);
        scanner.close();
    }
}
