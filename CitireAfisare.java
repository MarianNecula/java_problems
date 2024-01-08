import java.util.Scanner;

public class CitireAfisare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti sirul de la tastatura:");
        String a = scanner.nextLine();
        System.out.println(a);
        scanner.close();
    }
}