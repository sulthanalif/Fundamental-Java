/**
 * ForgetfulMachine
 */
import java.util.Scanner;

public class ForgetfulMachine {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of Frince? ");
        keyboard.nextInt();

        System.out.println("What is 6 multiplied by 7? ");
        keyboard.next();

        System.out.println("Enter the number between 0.0 and 0.1? ");
        keyboard.nextDouble();
    }
}