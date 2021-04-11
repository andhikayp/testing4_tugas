package com.example;
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String inputTicTacToe = input.nextLine();
            input.close();

            int row = 9;
            // String inputTicTacToe = "XXXOOOXXO";
            char[] game = new char[row];
            for (int i = 0; i < row; i++){
                game[i] = inputTicTacToe.charAt(i);
            }
            String result = checkCondition(game);
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println("Invalid game board");
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
                    result = WinStatementX();
                } else if(game[idx[i][0]] == 'O'){
                    attempt++;
                    result = WinStatementO();
                }
            }
        }

        if(checkInvalidCountDiff(game)){
            return "Invalid game board";
        } else if(attempt == 1){
            return result;
        } else if(attempt > 1){
            return "Invalid game board";
        } else if(checkInProgress(game)){
            return "Game still in progress!";
        } else{
            return "It’s a draw!";
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

    private static java.lang.String WinStatementX() {
        return "X wins!";
    }

    private static java.lang.String WinStatementO() {
        return "O wins!";
    }
}