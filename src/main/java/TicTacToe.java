/**
 * Created by Guest on 1/4/18.
 */
public class TicTacToe {
    private boolean startGame = false;
    private int nothing;
    private char row1Col1;
    private char row1Col2;
    private char row1Col3;
    private char row2Col1;
    private char row2Col2;
    private char row2Col3;
    private char row3Col1;
    private char row3Col2;
    private char row3Col3;
    private int turn;

    public TicTacToe(String input) {
        this.turn = 0;
        if (input.equals("Start") && !this.startGame) {
            this.startGame = true;
        } else if (input.equals("Quit")) {
            this.startGame = false;
        } else if (input.equals("row1col1") && this.turn == 0) {
            this.row1Col1 = 'O';
        } else {
            this.nothing = 0;
        }
        this.row1Col1 = '_';
        this.row1Col2 = '_';
        this.row1Col3 = '_';
        this.row2Col1 = '_';
        this.row2Col2 = '_';
        this.row2Col3 = '_';
        this.row3Col1 = '_';
        this.row3Col2 = '_';
        this.row3Col3 = '_';
    }

    public boolean getStartGame() {
        return this.startGame;
    }

    public String getBoard() {
        return String.format("%c %c %c\n%c %c %c\n%c %c %c", this.row1Col1, this.row1Col2, this.row1Col3, this.row2Col1, this.row2Col2, this.row2Col3, this.row3Col1, this.row3Col2, this.row3Col3);
    }

    public void changeBoard(String newInput) {
        if (turn == 0) {
            if (newInput.equals("row1col1")) {
                this.row1Col1 = 'p';
            }
        } else if (turn == 1) {
            this.nothing = 0;
        } else {
            this.nothing = 0;
        }
    }


}
