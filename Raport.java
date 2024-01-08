import java.util.Scanner;

public class Raport {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti n:");
        int n = scanner.nextInt();
        float e = (float)n / (n + 1);
        System.out.printf("Valoarea expresiei este: %.12f\n", e);
        scanner.close();
    }
}
