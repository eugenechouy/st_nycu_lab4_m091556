import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player1, player2;
        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");
        System.out.println("Enter Player1 choice (rock, paper, scissor):");
        player1 = sc.next();
        Game.validation(player1);
        System.out.println("Enter Player2 choice (rock, paper, scissor):");
        player2 = sc.next();
        Game.validation(player2);
        System.out.println(Game.play(player1, player2));
    }
}
