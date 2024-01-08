public class OperatiiBiti {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a + " <sau pe biti> " + b + " este " + (a | b));
        System.out.println(a + " <si pe biti> " + b + " este " + (a & b));
        System.out.println(a + " <sau exclusiv pe biti> " + b + " este " + (a ^ b));
        System.out.println("5 <complementat pe biti> este " + ~a + " variabila fiind pe " + Integer.SIZE / Byte.SIZE + " octeti");
    }
}
