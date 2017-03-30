import java.util.Scanner;

/**
 * A class that reads the user's number
 * and prints it in reverse
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class Deliverable1 {
    /**
     * Asks for a number, initialized as a String
     * Gets length of user's number
     * Uses a for() loop to print the number in reverse
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Define & initialize Scanner object
        Scanner scnr = new Scanner(System.in);

        // Defines counting variables
        String userNum;
        int numLength;
        int i;

        // Prompts user to enter a number, then reads the input
        System.out.print("Please enter a number: ");
        userNum = scnr.next();

        // Initializes numLength to the length of the user's number
        numLength = userNum.length();

        // Begins to print out exit statement...
        System.out.print("Your number " + userNum + " in reverse is ");

           // Iterates through User's number in reverse, printing each digit.
           for (i = 0; i < numLength; ++i) {
              System.out.print(userNum.charAt(userNum.length() - i - 1));
           }

           System.out.println("");

        return;
    }
}
