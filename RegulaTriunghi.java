import java.util.Scanner;

public class RegulaTriunghi {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati lungimile laturilor");
        System.out.print("a=");
        float a = scanner.nextFloat();
        System.out.print("b=");
        float b = scanner.nextFloat();
        System.out.print("c=");
        float c = scanner.nextFloat();

        if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
            System.out.printf("%4.2f, %4.2f si %4.2f formeaza un triunghi.\n", a, b, c);
        } else {
            System.out.printf("%4.2f, %4.2f si %4.2f nu formeaza un triunghi.\n", a, b, c);
        }
        scanner.close();
    }
}
