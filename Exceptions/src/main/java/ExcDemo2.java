    /* Wyjątek może zostać wygenerowany przez jedną metodę,
   a przechwycony przez inną */

    class ExcTest {
        // Generuje wyjątek
        static void genException() {
            try {
                int nums[] = new int[4];

                System.out.println("Przed wygenerowaniem wyjątku");

                // Generuje wyjątek związany z przekroczeniem zakresu tablicy
                nums[7] = 10;
                System.out.println("ten komunikat nie zostanie wyświetlony");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indeks tablicy spoza dopuszczalnego zakresu!!!!!");
            }
        }
    }

    class ExcDemo2 {
        public static void main(String args[]) {

            try {
                ExcTest.genException();
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // Przechwytuje wyjątek
                System.out.println("Indeks spoza zakresu!");
            }
            System.out.println("Za instrukcją catch");
        }
    }
