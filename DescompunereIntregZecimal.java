import java.util.Scanner;

public class DescompunereIntregZecimal {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti x:");
        double x = scanner.nextDouble();

        int y = (int) x;    // partea intreaga
        double z = x - y;   // partea zecimala

        System.out.println("x= " + x + "\t");
        System.out.println("[x]= " + y + "\t");
        System.out.println("{x}= " + z + "\t");

        System.out.println("e=" + (5 * x * y - 3 * z + 15));
        scanner.close();
    }
}
