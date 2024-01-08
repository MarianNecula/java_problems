import java.util.Scanner;

public class CitireSumaIntregi2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti a:");
            int a = scanner.nextInt();
            System.out.println("Introduceti b:");
            int b = scanner.nextInt();
            int c = a + b;
            System.out.println("a+b=" + c);
            scanner.close();
        }
}

