// Powtórnie generuje wyjątek
class Rethrow {
    public static void genException() {
        // Tablica numer jest większa niż denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 1 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i=0; i<numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " równa się " +
                        numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                // Przechwytuje wyjątek
                System.out.println("Nie wolno dzielić przez zero!");
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // Przechwytuje wyjątek
                System.out.println("Brak odpowiedniego elementu tablicy");
                throw exc; // Powtórnie generuje wyjątek
            }
        }
    }
}

class RethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            // Ponownie przechwytuje wyjątek
            System.out.println("Błąd krytyczny ------ " +
                    "program został zakończony");
        }
        catch (ArithmeticException exc) {
            // Przechwytuje wyjątek
            System.out.println("Nie wolno dzielić przez zero!");
        }
    }
}

