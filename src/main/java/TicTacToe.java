/**
 * Created by Guest on 1/4/18.
 */
public class TicTacToe {
    private boolean startGame = false;
    private Object nothing;
//    private char row1Col1;
//    private char row1Col2;
//    private char row1Col3;
//    private char row2Col1;
//    private char row2Col2;
//    private char row2Col3;
//    private char row3Col1;
//    private char row3Col2;
//    private char row3Col3;

    public TicTacToe(String input) {
        if (input.equals("Start") && !this.startGame) {
            this.startGame = true;
        } else if (input.equals("Quit")) {
            this.startGame = false;
        } else {
            this.nothing = null;
        }
//        this.row1Col1 = '_';
//        this.row1Col2 = '_';
//        this.row1Col3 = '_';
//        this.row2Col1 = '_';
//        this.row2Col2 = '_';
//        this.row2Col3 = '_';
//        this.row3Col1 = '_';
//        this.row3Col2 = '_';
//        this.row3Col3 = '_';
    }

    public boolean getStartGame() {
        return this.startGame;
    }


}
