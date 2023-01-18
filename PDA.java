/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class PDA {
    int age;
    int LOWER_BOUND = 14;
    static boolean shouldContinue = true;
    /**
     * Constructor for objects of class PDA
     */
    public PDA() {
        // We don't need to do anything in the constructor for
        // our program.
    }
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        while (shouldContinue) {
            System.out.println("How old are you?");
            System.out.println("Enter age as 0 to quit");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    System.out.println(age + " is too young!!");
                } else {
                    getYoungerAndOlderAge(age);
                }
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Please enter an integer");
            }
            if (age == 0) {
                shouldContinue = false;
            }
        }
    }
    public static void getYoungerAndOlderAge (int age) {
        System.out.println("The minimun age is " + ((age/2) + 7));
        System.out.println("The maximum age is " + ((age*2) - 7));
    }
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
