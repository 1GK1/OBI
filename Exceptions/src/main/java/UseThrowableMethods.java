// Używa metod klasy Throwable

class ExcTest1 {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Przed wygenerowaniem wyjątku");

        // Generuje wyjątek związany z przekroczeniem zakresu tablicy
        nums[7] = 10;
        System.out.println("ten komunikat nie zostanie wyświetlony");
    }
}

class UseThrowableMethods {
    public static void main(String args[]) {

        try {
            ExcTest1.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // Przechwytuje wyjątek
            System.out.println("Standardowy komunikat o błędzie: ");
            System.out.println(exc);
            System.out.println("\nStos wywołań: ");
            exc.printStackTrace();
        }
//        System.out.println("Za klauzulą catch");
    }
}
