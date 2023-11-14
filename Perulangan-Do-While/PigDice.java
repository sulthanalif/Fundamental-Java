import java.util.Scanner;

public class PigDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;

        System.out.println("Pig Dice Game");
        System.out.println("ニニニニニニニニニニニニニニニニニ");
        System.out.println("This is a dice game. The first player to reach 50 points wins!");

        while (playerScore < 50 && computerScore < 50) {
            System.out.println("\nComputer's turn:");
            int computerTurnScore = takeComputerTurn();
            computerScore += computerTurnScore;
            System.out.println("Computer scored " + computerTurnScore + " points. Total: " + computerScore);

            if (computerScore >= 50) {
                System.out.println("Computer wins!");
                break;
            }

            System.out.println("\nPlayer's turn:");
            int playerTurnScore = takePlayerTurn(scanner);
            playerScore += playerTurnScore;
            System.out.println("Player scored " + playerTurnScore + " points. Total: " + playerScore);

            if (playerScore >= 50) {
                System.out.println("Player wins!");
                break;
            }
        }

        scanner.close();
    }

    private static int takeComputerTurn() {
        int turnScore = 0;
        while (true) {
            int diceRoll = rollDice();
            System.out.println("Computer rolled: " + diceRoll);

            if (diceRoll == 1) {
                System.out.println("Computer's turn ends. No points added.");
                return 0;
            } else {
                turnScore += diceRoll;
                if (turnScore >= 10) {
                    System.out.println("Computer ends turn. Total points: " + turnScore);
                    return turnScore;
                } else {
                    System.out.println("Computer continues rolling...");
                }
            }
        }
    }

    private static int takePlayerTurn(Scanner scanner) {
        int turnScore = 0;
        while (true) {
            System.out.print("Press 'r' to roll the dice, or 'h' to hold and end your turn: ");
            char choice = scanner.next().charAt(0);

            if (choice == 'r') {
                int diceRoll = rollDice();
                System.out.println("Player rolled: " + diceRoll);

                if (diceRoll == 1) {
                    System.out.println("Player's turn ends. No points added.");
                    return 0;
                } else {
                    turnScore += diceRoll;
                    System.out.println("Current turn score: " + turnScore);
                }
            } else if (choice == 'h') {
                System.out.println("Player ends turn. Total points: " + turnScore);
                return turnScore;
            } else {
                System.out.println("Invalid input. Please enter 'r' to roll or 'h' to hold.");
            }
        }
    }

    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
