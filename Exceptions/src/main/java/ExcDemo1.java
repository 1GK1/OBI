import java.util.ArrayList;
import java.util.Scanner;


class ExcDemo1 {
        public static void main(String args[]) {
              Scanner scan = new Scanner(System.in);

                int number = 0;
                String prompt = "Enter a number: ";
                int min = 0;
                int max = 100;

                //Run once and loop until the input is within the specified range.
                do
                {
                    //Print users message.
                    System.out.printf("\n%s > ", prompt);

                    //Prevent string input crashing the program.
                    while (!scan.hasNextInt())
                    {
                        System.out.printf("Input doesn't match specifications. Try again.");
                        System.out.printf("\n%s > ", prompt);
                        scan.next();
                    }

                    //Set the number.
                    number = scan.nextInt();

                    //If the number is outside range print an error message.
                    if (number < min || number > max)
                        System.out.printf("Input doesn't match specifications. Try again.");

                } while (number < min || number > max);

            }
        }

