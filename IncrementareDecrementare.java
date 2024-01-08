public class IncrementareDecrementare {
    public static void main(String[] args) {
        int val = 1;

        System.out.println("Utilizarea operatorului in forma postfixata " + val++);
        System.out.println("Utilizarea dupa incrementare " + val);

        System.out.println("Utilizarea operatorului in forma prefixata " + ++val);
        System.out.println("Utilizarea dupa incrementare " + val);

        System.out.println("Utilizarea operatorului in forma postfixata " + val--);
        System.out.println("Utilizarea dupa decrementare " + val);

        System.out.println("Utilizarea operatorului in forma prefixata " + --val);
        System.out.println("Utilizarea dupa decrementare " + val);
    }
}
