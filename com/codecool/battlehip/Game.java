package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;

import java.sql.SQLException;
import java.util.Scanner;

import static com.codecool.battlehip.Battleship.MESSAGES;

public class Game {



    public static void gameStart() throws SQLException {
        System.out.println(Color.TEXT_BLUE + "\nPlayer 1: Dénes");
        int mokus = Input.getBoardLength();
        Board boardDenes = new Board(mokus);

        System.out.println(Color.TEXT_BLUE + "\nPlayer 2: Gizella");
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
        System.out.println("\nPlayer 1: Dénes");
        while (count < 2) {
            int toki = Input.getShipLength();
            factory.manualPlacement(boardDenes, scanner, toki, true);
            count++;
        }

        int count2 = 1;
        System.out.println("\nPlayer 2: Gizella");
        while (count2 < 2) {
            int fokos = Input.getShipLength();
            factory2.manualPlacement(boardGizi, scanner, fokos, false);
            count2++;
        }


        while (player1.getSunkShipCounter() != factory.shipCounter && player2.getSunkShipCounter() != factory2.shipCounter) {
            player1.makeAttack(scanner2);
            if (player1.getSunkShipCounter() == factory.shipCounter) {
                System.out.println(Color.TEXT_PURPLE + MESSAGES.getString("winMessage1"));
                break;
            }
            player2.makeAttack(scanner2);
            if (player2.getSunkShipCounter() == factory2.shipCounter) {
                System.out.println(Color.TEXT_PURPLE + MESSAGES.getString("winMessage2"));
                break;
                }
            }
        }


    public static void welcome() {
            System.out.println(Color.TEXT_PURPLE + MESSAGES.getString("welcome"));
            System.out.println(Color.TEXT_CYAN + MESSAGES.getString("battleship"));
        }


    public static void endGame() {
        System.out.println(Color.TEXT_PURPLE + MESSAGES.getString("endGame"));
        System.out.println(Color.TEXT_PURPLE + MESSAGES.getString("endShip"));
    }



}
