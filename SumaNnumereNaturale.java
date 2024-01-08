import java.util.Scanner;

public class SumaNnumereNaturale {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti n:");
        int n = scanner.nextInt();
        int s = 0;

        for (int i = 1; i <= n; i++) {
            s += i;  // s = s + i;
        }

        System.out.println("Suma primelor " + n + " numere naturale este: " + s);
        scanner.close();
    }
}
