import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String name;
        int moneySpent;
        int total = 0;
        int totalDay = 6; // itungnya dari 0
        String[] nameDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Hey what is your name? ");
        name = input.nextLine();

        for (int day = 0; day <= totalDay; day++) {
            System.out.println("How much money did you spend at the club on " + nameDay[day] + ": $");
            moneySpent = input.nextInt();
            total += moneySpent;
        }

        input.close();

        double average = (double) total / totalDay;


        System.out.println("\nHi " + name);
        System.out.println("\nYour total expenditure at the club this week is: $" + total);
        System.out.println("With an Avarage daily expenditure of: $" + average);
    }
}
