// Używa klauzulę throws
class ThrowsDemo {
    public static char prompt(String str) throws java.io.IOException {

        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String args[]) {
        char ch;

        try {
            ch = prompt("Wprowadź literę z klawiatury");
        }
        catch(java.io.IOException exc) {
            System.out.println("Wystąpił wyjątek wejścia/wyjścia");
            ch = 'X';
        }

        System.out.println("Nacisnąłeś " + ch);
    }
}
