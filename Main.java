import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dicegame.");
        System.out.println("Enter name of Player 1.");
        Player player1 = new Player(scanner.nextLine());

        // RQ 1. Find active player

        // RQ 2. Roll dice

        System.out.println("Enter name of Player 2.");
        Player player2 = new Player(scanner.nextLine());
        // RQ "Main" flow loop.
        while (true) {

            // RQ end game when points >=40 (or above).
            while (player1points || player2points >= 40) {

            }
        }
    }

}