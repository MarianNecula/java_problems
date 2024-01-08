import java.util.Scanner;

public class ApartineInterval {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti x:");
        float x = scanner.nextFloat();
        System.out.println("Introduceti a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti b: ");
        int b = scanner.nextInt();

        if (x >= a && x < b) {
            System.out.printf("\nX se afla in intervalul [%d %d)\n", a, b);
        } else {
            System.out.printf("\nX nu se afla in intervalul [%d %d)\n", a, b);
        }
        scanner.close();
    }
}
