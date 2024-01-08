import java.util.Scanner;

public class ConvertireBazaNumerica {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg zecimal: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti un numar intreg hexazecimal: ");
        scanner.nextLine(); // Consuming the newline left-over
        int b = Integer.parseInt(scanner.nextLine(), 16);
        
        System.out.println("\nNumarul zecimal:\tBaza 10: " + a + "\tBaza 8: " + Integer.toOctalString(a) + "\tBaza 16: " + Integer.toHexString(a).toUpperCase());
        System.out.println("Numarul hexazecimal:\tBaza 10: " + b + "\tBaza 8: " + Integer.toOctalString(b) + "\tBaza 16: " + Integer.toHexString(b).toUpperCase());
        scanner.close();
    }
}
