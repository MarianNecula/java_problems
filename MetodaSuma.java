import java.util.Scanner;

public class MetodaSuma {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti b: ");
        int b = scanner.nextInt();
        int c = suma(a, b);
        System.out.println("Suma este: " + c);
        scanner.close();
    }

    public static int suma(int x, int y) {
        return x + y;
    }
}
