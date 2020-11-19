public class ExcDemo4 {
    public static void main(String args[]) {
        // Tablica numer jest większa niż denom
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < numer.length; i++) {
                try {
                    System.out.println(numer[i] + " / " +
                            denom[i] + " równa się " +
                            numer[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    // Przechwytuje wyjątek
                    System.out.println("Dzielenie przez 0");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            // Przechwytuje wyjątek
            System.out.println("Brak elementu tablicy");
            System.out.println("Błąd krytyczny - przerwanie programu");
        }
    }
}
