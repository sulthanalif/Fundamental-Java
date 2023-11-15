/**
 * CafeReservation
 */
import java.util.Scanner;
public class CafeReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Reservation Cafe");
        System.out.println("Please insert your Name?");
        String name = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("What is your gender?");
        String gender = input.next();
        // gender = gender.toLowerCase();

        System.out.println("How attractive are you? (1 to 10)");
        double attractiveness = input.nextDouble();

        System.out.println("How much money do you have?");
        double money = input.nextDouble();

        System.out.println("What day do you want to make a reservation?");
        String day = input.next();
        // day = day.toLowerCase();

        System.out.println("Hi " + name + ", Thank you for using our Application.");
        System.out.println("Following Results for your Reservation:");

        boolean isReservationAllowed = false;

        String note = " ";

        if (day.equals("Monday") && age >= 20 && age <= 30 && money >= 500) {
            isReservationAllowed = true;
        } else if (day.equals("Tuesday") && age >= 31 && age <= 50 && money >= 250) {
            isReservationAllowed = true;
        } else if (day.equals("Wednesday") && age >= 20 && age <= 35 && gender.equals("Female") && attractiveness >= 8 && money >= 300) {
            isReservationAllowed = true;
        } else if (day.equals("Thursday") && age >= 21 && age <= 30 && ((gender.equals("Female") && attractiveness >= 8 && money >= 300) || (gender.equals("Male") && money >= 1000))) {
            isReservationAllowed = true;
        } else if (day.equals("Friday") && ((gender.equals("Female") && age >= 31 && age <= 45 && money >= 1000) || (gender.equals("Male") && age >= 21 && age <= 25 && attractiveness >= 8))) {
            isReservationAllowed = true;
        } else if ((day.equals("Saturday") || day.equals("Sunday")) && age >= 18 && age <= 60 && money >= 100) {
            isReservationAllowed = true;
        }
  
        if (day.equals("Monday")){
            note = "Young Night";
        } else if (day.equals("Tuesday")){
            note = "Oldest Night";
        } else if (day.equals("Wednesday")){
            note = "Ladies Night";
        } else if (day.equals("Thursday")){
            note = "Party Night For Single";
        } else if (day.equals("Friday")){
            note = "Women Night";
        } else if ((day.equals("Saturday") || day.equals("Sunday"))){
            note = "Weekend Freedom";
        }

        if (isReservationAllowed) {
            System.out.println("You can make a reservation for " + day + "!");
        } else {
            System.out.println("Sorry, you can't make a reservation on " + day + "!!.");
            System.out.println("Because it is "+ note +".");
        }
    }
}