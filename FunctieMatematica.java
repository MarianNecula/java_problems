import java.util.Scanner;

public class FunctieMatematica {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti x:");
        int x = scanner.nextInt();

        if (x == 0) {
            System.out.println("F(x)=2");
        } else if (x < 0) {
            System.out.println("F(x)=" + (3 * x * x + 7 * x - 10));
        } else {
            System.out.println("F(x)=" + (4 * x * x));
        }
        scanner.close();
    }
}
