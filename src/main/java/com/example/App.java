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
        return "yes";
    }
}
