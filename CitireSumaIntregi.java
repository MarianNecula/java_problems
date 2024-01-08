import java.util.Scanner;

public class CitireSumaIntregi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a=");
        int a = scanner.nextInt();
        System.out.println("Introduceti b=");
        int b = scanner.nextInt();
        System.out.println("Suma a+b=" + (a + b));
        scanner.close();
    }
}