public class Game {

    public static String play(String player1, String player2) {
        if( player1.equalsIgnoreCase(player2) )
            return "Draw!";
        if( (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors")) ||
            (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper")) ||
            (player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("rock"))
        )
            return "Player 1 win!";
        else
            return "Player 2 win!";

    }

    public static void validation(String choice) {
        if( !choice.equalsIgnoreCase("rock") &&
            !choice.equalsIgnoreCase("paper") &&
            !choice.equalsIgnoreCase("scissors") )
            throw new IllegalArgumentException("Bad Choice!");
    }
}
