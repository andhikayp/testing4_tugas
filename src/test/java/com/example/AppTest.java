package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test 
    void app_shouldReturnInProgress_whenInvoked(){
        App ticTacToe = new App(); //arrange
        String expected = "Invalid game board";

        char[] game = {'X','X','-','O','X','X','O','X','X'};
        String result = ticTacToe.checkCondition(game); //act

        Assertions.assertEquals(expected, result); //assert
    } 

    @Test 
    void app_shouldReturnHorizontalFirstTrueX_whenInvoked(){
        App ticTacToe = new App();
        String expected = "X wins!";

        char[] game = {'X','X','X','O','O','X','O','X','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    } 

    @Test 
    void app_shouldReturnHorizontalFirstTrue0_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'O','O','O','X','X','O','X','O','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    } 

    @Test 
    void app_shouldReturnHorizontalSecondTrueX_whenInvoked(){
        App ticTacToe = new App();
        String expected = "X wins!";

        char[] game = {'X','O','O','X','X','X','O','X','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    } 

    @Test 
    void app_shouldReturnHorizontalSecondTrue0_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'X','X','O','O','O','O','X','O','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnHorizontalThirdTrueX_whenInvoked(){
        App ticTacToe = new App();
        String expected = "X wins!";

        char[] game = {'O','X','O','x','O','O','X','X','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnHorizontalThirdTrue0_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'X','X','O','O','X','X','O','O','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnVerticalFirstTrueX_whenInvoked(){
        App ticTacToe = new App();
        String expected = "X wins!";

        char[] game = {'X','X','O','X','O','O','X','O','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnVerticalFirstTrueO_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'O','O','X','O','X','X','O','X','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnVerticalSecondTrueX_whenInvoked(){
        App ticTacToe = new App();
        String expected = "X wins!";

        char[] game = {'O','X','O','X','X','O','O','X','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnVerticalSecondTrueO_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'X','O','O','O','O','X','X','O','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnVerticalThirdTrueX_whenInvoked(){
        App ticTacToe = new App();
        String expected = "X wins!";

        char[] game = {'O','X','X','O','O','X','X','O','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnVerticalThirdTrueO_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'X','X','O','O','X','O','X','O','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnDiagonalRightTrueX_whenInvoked(){
        App ticTacToe = new App();
        String expected = "X wins!";

        char[] game = {'X','O','O','O','X','O','O','O','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnDiagonalRightTrueO_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'O','O','X','X','O','X','X','X','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnDiagonalLeftTrueX_whenInvoked(){
        App ticTacToe = new App();
        String expected = "X wins!";

        char[] game = {'O','O','X','O','X','O','X','X','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnDiagonalLeftTrueO_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'X','O','O','X','O','X','O','X','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnDrawTrueO_whenInvoked(){
        App ticTacToe = new App();
        String expected = "It’s a draw!";

        char[] game = {'O','X','O','X','O','X','X','O','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    @Test 
    void app_shouldReturnInvalidGameBoard_whenInvoked(){
        App ticTacToe = new App();
        String expected = "Invalid game board";

        char[] game = {'X','X','X','O','O','O','X','X','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    //one player win before all board full
    @Test 
    void app_shouldReturnWinsBoardNotFull1_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'-','O','X','-','O','X','-','O','-'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    //one player win before all board full
    @Test 
    void app_shouldReturnWinsBoardNotFull2_whenInvoked(){
        App ticTacToe = new App();
        String expected = "O wins!";

        char[] game = {'O','X','X','X','O','X','-','-','O'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }

    //invalid board when in progress
    @Test 
    void app_shouldReturnInvalidInProgress_whenInvoked(){
        App ticTacToe = new App();
        String expected = "Invalid game board";

        char[] game = {'-','O','X','-','O','X','-','O','X'};
        String result = ticTacToe.checkCondition(game);

        Assertions.assertEquals(expected, result);
    }
}
