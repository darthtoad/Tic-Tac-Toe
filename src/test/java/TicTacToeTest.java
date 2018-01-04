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
}