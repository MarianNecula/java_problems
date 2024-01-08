import java.util.Scanner;

public class Aritmetica {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti b: ");
        int b = scanner.nextInt();
        scanner.nextLine(); // Consuming the newline left after reading integer

        System.out.println("Introduceti operatia dorita (+ - * /): ");
        char x = scanner.nextLine().charAt(0);
        switch(x) {
            case '+':
                System.out.println("a+b= " + (a + b));
                break;
            case '-':
                System.out.println("a-b= " + (a - b));
                break;
            case '/':
                System.out.printf("a/b=%.2f\n", a / (float)b);
                break;
            case '*':
                System.out.println("a*b= " + (a * b));
                break;
            default:
                System.out.println("Operatie necunoscuta");
        }
        scanner.close();
    }
}
