package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test 
    void app_shouldReturnHelloWorld_whenInvoked(){
        App ticTacToe = new App(); //arrange

        char[] game = {'X','X','O','O','X','X','O','X','X','0'};
        String result = ticTacToe.checkCondition(game); //act

        Assertions.assertEquals("yes", result); //assert
    }

    @Test 
    void app_shouldReturnInProgress_whenInvoked(){
        App ticTacToe = new App(); //arrange
        String expected = "Game still in progress!";

        char[] game = {'X','X','-','O','X','X','O','X','X','0'};
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
}
