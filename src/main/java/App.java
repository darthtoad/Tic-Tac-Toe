import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 1/4/18.
 */
public class App {
    public static void main(String[] args) {
        try {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            boolean newGame = true;
            while (newGame) {
                System.out.println("Would you like to play a game of tic-tac-toe? Enter \"Yes\" or \"No\"");
                String input = bufferedReader.readLine();
                if (input.equals("Yes")) {
                    TicTacToe newTicTacToe = new TicTacToe("Start");
                    boolean thisGame = true;
                    while (thisGame) {
                        int newTurn = newTicTacToe.getTurn();
                        System.out.println(newTicTacToe.getBoard());
                        System.out.println(String.format("Player 1 is O. Player 2 is X.\nYour input should be in the form of \"rowXColY\", where X is the row number and Y is the column number.\nPlayer %d, it's your turn", newTurn + 1));
                        String input0 = bufferedReader.readLine();
                        newTicTacToe.changeBoard(input0);
                        if (newTicTacToe.getWinner() == 1) {
                            System.out.println("Player 1 has won!");
                            thisGame = false;
                        }
                        if (newTicTacToe.getWinner() == 2) {
                            System.out.println("Player 2 has won!");
                            thisGame = false;
                        }
                        if (newTicTacToe.getWinner() == 0) {
                            System.out.println("You have tied!");
                            thisGame = false;
                        }
                    }
                } else if (input.equals("No")) {
                    System.out.println("Goodbye!");
                    newGame = false;
                } else {
                    System.out.println("Sorry, I didn't understand that input");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
