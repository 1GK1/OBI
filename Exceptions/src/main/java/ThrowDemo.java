public class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Przed instrukcją throw");
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc) {
            // Przechwytuje wyjątek
            System.out.println("Wyjątek przechwycony");
            exc.fillInStackTrace();
        }
        System.out.println("Za blokiem try/catch");
    }
}
