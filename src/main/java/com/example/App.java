package com.example;
import java.util.Scanner;

public class App {
    static final String TEXT_INVALID = "Invalid game board";
    static final String TEXT_IN_PROGRESS = "Game still in progress!";
    static final String TEXT_DRAW = "It’s a draw!";
    static final String TEXT_X_WIN = "X wins!";
    static final String TEXT_O_WIN = "O wins!";
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String inputTicTacToe = input.nextLine();
            input.close();

            int row = 9;
            char[] game = new char[row];
            for (int i = 0; i < row; i++){
                game[i] = inputTicTacToe.charAt(i);
            }
            String result = checkCondition(game);
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println(TEXT_INVALID);
        }
        
    }

    public static String checkCondition(char[] game) {
        int attempt = 0;
        String result = null;
        int[][] idx = {
            {0,1,2}, 
            {3,4,5}, 
            {6,7,8}, 
            {0,3,6}, 
            {1,4,7}, 
            {2,5,8}, 
            {0,4,8}, 
            {2,4,6}, 
        };

        for (int i = 0; i < idx.length; i++){
            if((game[idx[i][0]] == game[idx[i][1]]) && (game[idx[i][0]] == game[idx[i][2]])){
                if(game[idx[i][0]] == 'X'){
                    attempt++;
                    result = TEXT_X_WIN;
                } else if(game[idx[i][0]] == 'O'){
                    attempt++;
                    result = TEXT_O_WIN;
                }
            }
        }

        if(checkInvalidCountDiff(game)){
            return TEXT_INVALID;
        } else if(attempt == 1){
            return result;
        } else if(attempt > 1){
            return TEXT_INVALID;
        } else if(checkInProgress(game)){
            return TEXT_IN_PROGRESS;
        } else{
            return TEXT_DRAW;
        }
    }

    private static boolean checkInvalidCountDiff(char[] game) {
        int countO = 0;
        int countX = 0;
        for (int i = 0; i < game.length; i++){
            if(game[i] == 'O'){
                countO++;
            } else if(game[i] == 'X'){
                countX++;
            }
        }
        int diffCount = Math.abs(countO - countX);
        return diffCount > 1 ? true : false;
    }
    
    private static boolean checkInProgress(char[] game) {
        for (int i = 0; i < game.length; i++){
            if(game[i] == '-'){
                return true;
            }
        }
        return false;
    }
}