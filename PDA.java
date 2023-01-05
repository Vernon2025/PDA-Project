
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    int age;
    int LOWER_BOUND = 14;
    boolean shouldContinue = true;
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
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
            System.out.println("Type 0 to quit");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    System.out.println(age + " is too young!!");
                } else {
                    System.out.println("Oldest: " + (age/2 + 7));
                    System.out.println("Youngest: " + (age/2 - 7));
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
            if (age == 0) {
                shouldContinue = false;
                System.out.println("This program closed");
            }
        }
    }
    public void getYoungerAge(int age){
        System.out.println("Minimum Age: ");
    }
    public void getOlderAge(int age) {
        System.out.println("Maximum Age: " );
    }
    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
