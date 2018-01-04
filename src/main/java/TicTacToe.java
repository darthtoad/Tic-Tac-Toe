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
    private int winner;

    public TicTacToe(String input) {
        this.turn = 0;
        this.winner = -1;
        if (input.equals("Start") && !this.startGame) {
            this.startGame = true;
        } else if (input.equals("Quit")) {
            this.startGame = false;
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

//    public char getRow1Col1() {
//        return row1Col1;
//    }
//
//    public char getRow1Col2() {
//        return row1Col2;
//    }
//
//    public char getRow1Col3() {
//        return row1Col3;
//    }
//
//    public char getRow2Col1() {
//        return row2Col1;
//    }
//
//    public char getRow2Col2() {
//        return row2Col2;
//    }
//
//    public char getRow2Col3() {
//        return row2Col3;
//    }
//
//    public char getRow3Col1() {
//        return row3Col1;
//    }
//
//    public char getRow3Col2() {
//        return row3Col2;
//    }
//
//    public char getRow3Col3() {
//        return row3Col3;
//    }

    public boolean getStartGame() {
        return this.startGame;
    }

    public int getTurn() {
        return this.turn;
    }

    public String getBoard() {
        return String.format("%c %c %c\n%c %c %c\n%c %c %c", this.row1Col1, this.row1Col2, this.row1Col3, this.row2Col1, this.row2Col2, this.row2Col3, this.row3Col1, this.row3Col2, this.row3Col3);
    }

    public int getWinner() {
        return this.winner;
    }

    public void changeBoard(String newInput) {
        if (this.turn == 0) {
            this.turn++;
            if (newInput.equals("row1Col1") && this.row1Col1 == '_') {
                this.row1Col1 = 'O';
            } else if (newInput.equals("row1Col2") && this.row1Col2 == '_') {
                this.row1Col2 = 'O';
            } else if (newInput.equals("row1Col3") && this.row1Col3 == '_'){
                this.row1Col3 = 'O';
            } else if (newInput.equals("row2Col1") && this.row2Col1 == '_') {
                this.row2Col1 = 'O';
            } else if (newInput.equals("row2Col2") && this.row2Col2 == '_') {
                this.row2Col2 = 'O';
            } else if (newInput.equals("row2Col3") && this.row2Col3 == '_') {
                this.row2Col3 = 'O';
            } else if (newInput.equals("row3Col1") && this.row3Col1 == '_') {
                this.row3Col1 = 'O';
            } else if (newInput.equals("row3Col2") && this.row3Col2 == '_') {
                this.row2Col2 = 'O';
            } else if (newInput.equals("row3Col3") && this.row3Col3 == '_') {
                this.row3Col3 = 'O';
            } else {
                this.turn--;
            }
        } else if (this.turn == 1) {
            this.turn--;
            if (newInput.equals("row1Col1") && this.row1Col1 == '_') {
                this.row1Col1 = 'X';
            } else if (newInput.equals("row1Col2") && this.row1Col2 == '_') {
                this.row1Col2 = 'X';
            } else if (newInput.equals("row1Col3") && this.row1Col3 == '_') {
                this.row1Col3 = 'X';
            } else if (newInput.equals("row2Col1") && this.row2Col1 == '_') {
                this.row2Col1 = 'X';
            } else if (newInput.equals("row2Col2") && this.row2Col2 == '_') {
                this.row2Col2 = 'X';
            } else if (newInput.equals("row2Col3") && this.row2Col3 == '_') {
                this.row2Col3 = 'X';
            } else if (newInput.equals("row3Col1") && this.row3Col1 == '_') {
                this.row3Col1 = 'X';
            } else if (newInput.equals("row3Col2") && this.row3Col2 == '_') {
                this.row3Col2 = 'X';
            } else if (newInput.equals("row3Col3") && this.row3Col3 == '_') {
                this.row3Col3 = 'X';
            } else {
                this.turn++;
            }
        } else {
            this.nothing = 0;
        }
        if (row1Col1 == 'O' && row1Col2 == 'O' && row1Col3 == 'O') {
            this.winner = 1;
        }
    }


}
