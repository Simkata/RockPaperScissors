import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerChoice = scanner.nextLine();

        if (playerChoice.equals("r") || playerChoice.equals("rock")) {
            playerChoice = ROCK;
        } else if (playerChoice.equals("p") || playerChoice.equals("paper")) {
            playerChoice = PAPER;
        } else if (playerChoice.equals("s") || playerChoice.equals("scissors")) {
            playerChoice = SCISSORS;
        } else {
            System.out.println("Invalid input. Try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        String computerChoice = "";
        if (computerRandomNumber == 0) {
            computerChoice = ROCK;
        } else if (computerRandomNumber == 1) {
            computerChoice = PAPER;
        } else if (computerRandomNumber == 2) {
            computerChoice = SCISSORS;
        }
        System.out.printf("The compute chose %s%n", computerChoice);

        if ((playerChoice.equals(ROCK) && computerChoice.equals(SCISSORS)) ||
                (playerChoice.equals(PAPER) && computerChoice.equals(ROCK)) ||
                (playerChoice.equals(SCISSORS) && computerChoice.equals(PAPER))){
            System.out.println("You win!");
        } else if ((playerChoice.equals(ROCK) && computerChoice.equals(PAPER)) ||
                (playerChoice.equals(PAPER) && computerChoice.equals(SCISSORS)) ||
                (playerChoice.equals(SCISSORS) && computerChoice.equals(ROCK))){
            System.out.println("You lose!");
        } else {
            System.out.println("Draw!");
        }

    }
}