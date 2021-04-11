package com.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // String inputTicTacToe = input.nextLine();
        // input.close();

        int row = 8;
        String inputTicTacToe = "XXXOOOXXO";
        char[] game = new char[row];
        for (int i = 0; i < row; i++){
            game[i] = inputTicTacToe.charAt(i);
        }
        String result = checkCondition(game);
    }

    public static String checkCondition(char[] game) {
        for (int i = 0; i < game.length; i++){
            if(game[i] == '-'){
                return "Game still in progress!";
            }
        }
        if((game[0] == game[1]) && (game[0] == game[2])){
            if(game[0] == 'X'){
                return "X wins!";
            } else if(game[0] == 'O'){
                return "O wins!";
            }
        }
        if((game[3] == game[4]) && (game[3] == game[5])){
            if(game[3] == 'X'){
                return "X wins!";
            } else if(game[3] == 'O'){
                return "O wins!";
            }
        }
        if((game[6] == game[7]) && (game[6] == game[8])){
            if(game[6] == 'X'){
                return "X wins!";
            } else if(game[6] == 'O'){
                return "O wins!";
            }
        }
        if((game[0] == game[3]) && (game[0] == game[6])){
            if(game[0] == 'X'){
                return "X wins!";
            } else if(game[0] == 'O'){
                return "O wins!";
            }
        }
        if((game[1] == game[4]) && (game[1] == game[7])){
            if(game[1] == 'X'){
                return "X wins!";
            } else if(game[1] == 'O'){
                return "O wins!";
            }
        }
        if((game[2] == game[5]) && (game[2] == game[8])){
            if(game[2] == 'X'){
                return "X wins!";
            } else if(game[2] == 'O'){
                return "O wins!";
            }
        }
        if((game[0] == game[4]) && (game[0] == game[8])){
            if(game[0] == 'X'){
                return "X wins!";
            } else if(game[0] == 'O'){
                return "O wins!";
            }
        }
        if((game[2] == game[4]) && (game[2] == game[6])){
            if(game[2] == 'X'){
                return "X wins!";
            } else if(game[2] == 'O'){
                return "O wins!";
            }
        }
        else{
            return "It’s a draw!";
        }
        return "yes";
    }
}
