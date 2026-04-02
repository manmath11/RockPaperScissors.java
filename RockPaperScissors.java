import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // User input
        System.out.println("Enter 1 for Rock, 2 for Paper, 3 for Scissors:");
        int user = sc.nextInt();

        // Computer choice
        int comp = rand.nextInt(3) + 1;

        System.out.println("Computer chose: " + comp);

        // Game logic
        if (user == comp) {
            System.out.println("Draw!");
        }
        else if ((user == 1 && comp == 3) ||
                (user == 2 && comp == 1) ||
                (user == 3 && comp == 2)) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}