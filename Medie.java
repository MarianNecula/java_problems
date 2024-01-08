import java.util.Scanner;

public class Medie {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti b: ");
        int b = scanner.nextInt();
        float m = media(a, b);
        System.out.println("Media aritmetica este: " + m);
        scanner.close();
    }

    public static float media(int x, int y) {
        return (x + y) / 2.0f;
    }
}
