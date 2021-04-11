package com.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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

    public static String checkCondition(char[] game) {
        // String inProgress = checkInProgress(game);
        String winResult = checkWin(game);
        return winResult;
    }

    private static Boolean checkInProgress(char[] game) {
        for (int i = 0; i < game.length; i++){
            if(game[i] == '-'){
                return true;
            }
        }
        return false;
    }

    private static String checkWin(char[] game) {
        int attempt = 0;
        String result = null;
        if((game[0] == game[1]) && (game[0] == game[2])){
            if(game[0] == 'X'){
                attempt++;
                result = WinStatementX();
            } else if(game[0] == 'O'){
                attempt++;
                result = WinStatementO();
            }
        }
        if((game[3] == game[4]) && (game[3] == game[5])){
            if(game[3] == 'X'){
                attempt++;
                result = WinStatementX();
            } else if(game[3] == 'O'){
                attempt++;
                result = WinStatementO();
            }
        }
        if((game[6] == game[7]) && (game[6] == game[8])){
            if(game[6] == 'X'){
                attempt++;
                result = WinStatementX();
            } else if(game[6] == 'O'){
                attempt++;
                result = WinStatementO();
            }
        }
        if((game[0] == game[3]) && (game[0] == game[6])){
            if(game[0] == 'X'){
                attempt++;
                result = WinStatementX();
            } else if(game[0] == 'O'){
                attempt++;
                result = WinStatementO();
            }
        }
        if((game[1] == game[4]) && (game[1] == game[7])){
            if(game[1] == 'X'){
                attempt++;
                result = WinStatementX();
            } else if(game[1] == 'O'){
                attempt++;
                result = WinStatementO();
            }
        }
        if((game[2] == game[5]) && (game[2] == game[8])){
            if(game[2] == 'X'){
                attempt++;
                result = WinStatementX();
            } else if(game[2] == 'O'){
                attempt++;
                result = WinStatementO();
            }
        }
        if((game[0] == game[4]) && (game[0] == game[8])){
            if(game[0] == 'X'){
                attempt++;
                result = WinStatementX();
            } else if(game[0] == 'O'){
                attempt++;
                result = WinStatementO();
            }
        }
        if((game[2] == game[4]) && (game[2] == game[6])){
            if(game[2] == 'X'){
                attempt++;
                result = WinStatementX();
            } else if(game[2] == 'O'){
                attempt++;
                result = WinStatementO();
            }
        }

        if(attempt == 1){
            return result;
        } else if(attempt > 1){
            return "Invalid game board";
        } else if(checkInProgress(game)){
            return "Game still in progress!";
        } else{
            return "It’s a draw!";
        }
    }

    private static java.lang.String WinStatementX() {
        return "X wins!";
    }

    private static java.lang.String WinStatementO() {
        return "O wins!";
    }
}
