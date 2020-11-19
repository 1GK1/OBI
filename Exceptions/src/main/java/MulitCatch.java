// Używa klauzuli catch obsługującej różne typy wyjątków
// Wymaga JDK 7 lub nowszej wersji
class MultiCatch {
    public static void main(String args[]) {
        int a = 88, b = 0;
        int result;
        char chrs[] = {'A', 'B', 'C'};
        int[] array = null;

        for (int i = 0; i <= 2; i++) {
            try {
                if (i == 0)
                    result = a / b; // Generuje wyjątek ArithmeticException
                else if (i == 1) {
                    chrs[5] = 'X'; // Generuje wyjątek ArrayIndexOutOfBoundsException
                }
                else array[90] = 6;
                // Ta klauzula catch przechwytuje oba wyjątki.
            } catch (ArithmeticException |
                    ArrayIndexOutOfBoundsException | NullPointerException | ArrayStoreException e) {
                System.out.println("Przechwycony wyjątek: " + e);
            }
        }

        System.out.println("Za instrukcją catch");
    }
}
