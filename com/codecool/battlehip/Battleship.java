package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Battleship {

    private static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));

    public static void main(String[] args) {

        welcome();
        gameStart();



    }

    public static void gameStart() {
        int mokus = Input.getBoardLength();
        Board board = new Board(mokus);
        Board emptyBoard = new Board(10);
        BoardFactory factory = new BoardFactory();
        Scanner scanner = new Scanner(System.in);

        //int toki = 0;
        int count = 1;
        while(count < 4){
            int toki = Input.getShipLength();
            factory.manualPlacement(board, scanner, toki, true);
            count++;
        }
        //System.out.println(board);
    }



    public static void welcome() {
        System.out.println(Color.TEXT_PURPLE + MESSAGES.getString("welcome"));
        System.out.println(Color.TEXT_CYAN + MESSAGES.getString("battleship"));
    }


    // Display field  that are used throughout the program.

    // Input field  that are used throughout the program.

    // has a loop in which the program runs.

    //displays the main menu and allows the user to a start new game,

    // display high scores, and exit

}
