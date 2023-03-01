package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;

import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import static com.codecool.battlehip.Input.MESSAGES;

public class Game {

    // has a loop in which players make moves - take turn

    // has a logic which determines the flow of round.

    // has a condition on which game ends

    // provides different game modes which use different round flows.

    private static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));


    public static void gameStart() throws SQLException {
        int mokus = Input.getBoardLength();
        Board boardDenes = new Board(mokus);

        int sari = Input.getBoardLength();
        Board boardGizi = new Board(sari);


        BoardFactory factory = new BoardFactory();
        BoardFactory factory2 = new BoardFactory();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Player player1 = new Player("Dénes", boardDenes, boardGizi);
        Player player2 = new Player("Gizella", boardGizi, boardDenes);


        //int toki = 0;
        int count = 1;
        while (count < 4) {
            int toki = Input.getShipLength();
            factory.manualPlacement(boardDenes, scanner, toki, true);
            count++;
        }

        int count2 = 1;
        while (count2 < 4) {
            int fokos = Input.getShipLength();
            factory2.manualPlacement(boardGizi, scanner, fokos, false);
            count2++;
        }


        while (player1.getSunkShipCounter() != factory.shipCounter && player2.getSunkShipCounter() != factory2.shipCounter) {
            player1.makeAttack(scanner2);
            if (player1.getSunkShipCounter() == factory.shipCounter) {
                System.out.println("Game over");}
            player2.makeAttack(scanner2);
            if (player2.getSunkShipCounter() == factory2.shipCounter) {
                System.out.println("Game over");
                }
            }
            //System.out.println(board);
        }


    public static void welcome() {
            System.out.println(Color.TEXT_PURPLE + MESSAGES.getString("welcome"));
            System.out.println(Color.TEXT_CYAN + MESSAGES.getString("battleship"));
        }



}
