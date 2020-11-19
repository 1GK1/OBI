import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String prompt = "Enter a number: > ";
        int numberToGuess = random.nextInt(10);
        int userNumber = 0;

        System.out.println(numberToGuess);

        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Your input is not the number.");
                System.out.print(prompt);
            }
            userNumber = scanner.nextInt();
            if (userNumber > numberToGuess) {
                System.out.println("Your number is too big");
                scanner.nextLine();
            } else if (userNumber < numberToGuess) {
                System.out.println("Your number is too small");
                scanner.nextLine();
            }
        } while (numberToGuess != userNumber);

        System.out.println("Congrats. You have guessed the number");
    }
}