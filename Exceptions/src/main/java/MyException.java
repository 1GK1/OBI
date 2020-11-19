import java.util.Scanner;

// my program throws exception if the first number is not divisible by the number defined

class NonDivisibleByUserNumberException extends Exception {

    int dividend;
    int divisor;

    //
    NonDivisibleByUserNumberException(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public String toString() {
        return "The result of division - ERROR [" + dividend + " is not divisible by " + divisor + "]";
    }
}


class MyExceptionMain {
    public static void main(String[] args) {
        int[] dividends = {3, 5, 8, 14, 15, 24, 30, 36, 44, 55};
        int divisor = 1;

        // the number to check is defined here - variable divisor; Scanner is used
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your number -> ");

            // the while loop control if the user inputs integer, if not it prompts again
            while (!scanner.hasNextInt()) {
                System.out.println("It is not an integer!");
                scanner.nextLine();
                System.out.print("Enter your number -> ");
            }
            divisor = scanner.nextInt();

        System.out.printf("\nReceived integer: %d\n\n", divisor);

            for (int i = 0; i < dividends.length; i++) {
                try {
                    if (dividends[i] % divisor != 0) {
                        throw new
                                NonDivisibleByUserNumberException(dividends[i], divisor);
                    }

                    System.out.printf("%d is divisible by %d", dividends[i], divisor);
                    System.out.println();
                } catch (NonDivisibleByUserNumberException e) {
                    System.out.println(e);
                }
            }
        }
    }

