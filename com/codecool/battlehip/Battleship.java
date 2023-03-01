package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;
import com.codecool.battlehip.enums.ShipType;
import com.sun.tools.javac.Main;

import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import static com.codecool.battlehip.Game.gameStart;
import static com.codecool.battlehip.Game.welcome;

public class Battleship {


    public static void main(String[] args) throws SQLException {

        welcome();
        gameStart();


    }
}
    /*public static void gameStart() throws SQLException {
        int mokus = Input.getBoardLength();
        Board board = new Board(mokus);

        Board emptyBoard = new Board(10);


        BoardFactory factory = new BoardFactory();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Player player1 = new Player("Dénes", board, board);



        //int toki = 0;
        int count = 1;
        while(count < 2){
            int toki = Input.getShipLength();
            factory.manualPlacement(board, scanner, toki, true);
            count++;
        }


        while(player1.getSunkShipCounter() != factory.shipCounter) {
            player1.makeAttack(scanner2);
            if (player1.getSunkShipCounter() == factory.shipCounter) {
                System.out.println("Game over");
            }
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

}*/
