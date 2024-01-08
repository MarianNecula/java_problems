import java.util.Scanner;

public class MinMax {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti x: ");
        int x = scanner.nextInt();
        System.out.println("Introduceti y: ");
        int y = scanner.nextInt();

        System.out.println("\nMaximul este: " + (x > y ? x : y));
        System.out.println("\nMinimul este: " + (x < y ? x : y));
        scanner.close();
    }
}
