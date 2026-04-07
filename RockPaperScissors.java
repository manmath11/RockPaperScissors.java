import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userScore = 0;
        int computerScore = 0;

        System.out.println("🎮 Welcome to Rock Paper Scissors Game!");

        while (true) {

            System.out.println("\nEnter 1 for Rock, 2 for Paper, 3 for Scissors, 0 to Exit:");
            int user = sc.nextInt();

            if (user == 0) {
                System.out.println("Game Ended!");
                break;
            }

            if (user < 1 || user > 3) {
                System.out.println("Invalid input! Try again.");
                continue;
            }

            int computer = rand.nextInt(3) + 1;

            // Convert numbers to names
            String[] choices = {"", "Rock", "Paper", "Scissors"};

            System.out.println("You chose: " + choices[user]);
            System.out.println("Computer chose: " + choices[comp]);

            // Game logic
            if (user == comp) {
                System.out.println("🤝 It's a Draw!");
            }
            else if ((user == 1 && comp == 3) ||
                     (user == 2 && comp == 1) ||
                     (user == 3 && comp == 2)) {

                System.out.println("🎉 You Win!");
                userScore++;
            }
            else {
                System.out.println("💻 Computer Wins!");
                computerScore++;
            }

            // Score display
            System.out.println("📊 Score → You: " + userScore + " | Computer: " + compScore);
        }

        System.out.println("\nFinal Score:");
        System.out.println("You: " + userScore);
        System.out.println("Computer: " + computerScore);

        sc.close();
    }
}
