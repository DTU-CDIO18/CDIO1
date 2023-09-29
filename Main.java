import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dicegame.");

        System.out.println("Enter name of Player 1.");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Enter name of Player 2.");
        Player player2 = new Player(scanner.nextLine());

        // scanner.close();
    
        GameManager gameManager = new GameManager(new Player[]{player1, player2});

        Die die1 = new Die();
        Die die2 = new Die();
        RaffleCup raffleCup = new RaffleCup(new Die[]{die1, die2});

        main:
        while (true) {
            Player activePlayer = gameManager.getActivePlayer();

            int[] dieRoll = raffleCup.roll();
            int dieRollSum = Arrays.stream(dieRoll).sum();

            activePlayer.addPoints(dieRollSum);

            System.out.printf("%s: %d points\nDie 1: %d\nDie 2: %d\n\n", activePlayer.getName(), activePlayer.getPoints(), dieRoll[0], dieRoll[1]);

            if (activePlayer.getPoints() >= 40 && dieRoll[0] == dieRoll[1] && !(dieRoll[0] == 1 && dieRoll[1] == 1)) {
                System.out.printf("%s won!\n", activePlayer.getName());
                System.exit(0);
            }

            if (dieRoll[0] == 1 && dieRoll[1] == 1) {
                activePlayer.setPoints(0);
            }

   
            input:
            while (true) {
                System.out.println("Press enter to continue, press q to exit");
                switch (scanner.nextLine()) {
                    case ""     -> {break input;}
                    case "q"    -> {break main;}
                    default     -> {continue;}
                }
            }

            gameManager.nextActivePlayer();
        }

        scanner.close();
    }

}