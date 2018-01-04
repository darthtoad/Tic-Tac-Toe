import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/4/18.
 */
public class TicTacToeTest {
    @Test
    public void TicTacToe_instantiatesCorrectly() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe("");
        assertEquals(true, testTicTacToe instanceof TicTacToe);
    }
    @Test
    public void TicTacToe_startGameOnStart_true() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe("Start");
        assertEquals(true, testTicTacToe.getStartGame());
    }

    @Test
    public void getBoard_displayEmptyBoard_lotsOfDashes() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe("Start");
        assertEquals("_ _ _\n_ _ _\n_ _ _", testTicTacToe.getBoard());
    }

    @Test
    public void getBoard_displayOonFirstTurn_OandDashes() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe("Start");
        assertEquals("O _ _\n_ _ _\n_ _ _", testTicTacToe.getBoard());
    }
}