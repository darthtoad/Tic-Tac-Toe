/**
 * Created by Guest on 1/4/18.
 */
public class TicTacToe {
    private boolean startGame = false;
    private Object nothing;
    public TicTacToe(String input) {
        if (input.equals("Start")) {
            this.startGame = true;
        } else if (input.equals("Quit")) {
            this.startGame = false;
        } else {
            this.nothing = null;
        }
    }

    public boolean getStartGame() {
        return this.startGame;
    }
}
