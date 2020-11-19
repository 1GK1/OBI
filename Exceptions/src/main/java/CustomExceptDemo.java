// Używa własnego wyjątku

// Tworzy klasę wyjątku
class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Wynik dzielenia " + n + " / " + d +
                " nie jest wartością całkowitą";
    }
}

class CustomExceptDemo {
    public static void main(String args[]) {


        // Tablica numer zawiera dwie nieparzyste wartości
        int numer[] = {0, 8, 15, 32, 64, 127, 256, 512};
        int denom[] = {2, 0, 6, 4, 0, 8};
        for (int i = 0; i < numer.length; i++) {
            try {
//                if ((numer[i] % 2) != 0)
                if (numer[i] % denom[i] != 0)
                    throw new
                            NonIntResultException(numer[i], denom[i]);

                System.out.println(numer[i] + " / " +
                        denom[i] + " równa się " +
                        numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // Przechwytuje wyjątek
                System.out.println("Nie wolno dzielić przez zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // Przechwytuje wyjątek
                System.out.println("Brak odpowiedniego elementu tablicy");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
