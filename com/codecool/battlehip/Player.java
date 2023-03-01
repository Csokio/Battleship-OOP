package com.codecool.battlehip;

import com.codecool.battlehip.enums.SquareStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private final String name;
    private Board ownBoard;
    private Board opponentBoard;

    public Player(String name, Board ownBoard, Board opponentBoard) {
        this.name = name;
        this.ownBoard = ownBoard;
        this.opponentBoard = opponentBoard;
    }
     public String getName() {
        return name;
    }

    public Board getOwnBoard() {
        return ownBoard;
    }

    public Board getOpponentBoard() {
        return opponentBoard;
    }

    public void attack(int row, int col) {
        Square square = opponentBoard.getSquare(row, col);
        square.takeAttack();
    }

    public void takeAttack(int row, int col) {
        Square square = opponentBoard.getSquare(row, col);
        if (square.getStatus() == SquareStatus.SHIP) {
            square.setStatus(SquareStatus.HIT);
            System.out.println(name + " hit opponent's ship at (" + row + "," + col + ")");
        } else {
            square.setStatus(SquareStatus.MISSED);
            System.out.println(name + " missed opponent's ship at (" + row + "," + col + ")");
        }
    }


    public void makeAttack(Scanner scanner) {
        System.out.println(name + ", enter the coordinates of your attack (row col): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        Square square = opponentBoard.getSquare(row, col);

        square.takeAttack();
        if (square.getStatus() == SquareStatus.HIT) {
            System.out.println(name + " hit opponent's ship at (" + row + "," + col + ")");
            if (square.checkSunk()) {
                System.out.println(name + " sunk opponent's ship!");
            }
        } else {
            square.setStatus(SquareStatus.MISSED);
            System.out.println(name + " missed opponent's ship at (" + row + "," + col + ")");
        }
        System.out.println(opponentBoard);
    }




    }
/*
        // TODO: Implement ship placement logic
    }

    public void takeTurn(Player opponent, int row, int col) {
        boolean hit = opponent.getBoard().attack(row, col);
        if (hit) {
            System.out.println("Hit!");
            incrementScore();
            for (Ship ship : opponent.getShips()) {
                if (ship.contains(row, col)) {
                    ship.hit();
                    if (!ship.isAlive()) {
                        System.out.println("You sunk the " + ship.getName() + "!");
                        opponent.decrementNumShips();
                    }
                    break;
                }
            }
        } else {
            System.out.println("Miss!");
        }







    /*
    Ez az osztály fogja reprezentálni a játékosokat.
    Minden játékosnak lesz egy táblája, amin elhelyezi a saját hajóit, és
    lesznek olyan metódusai, amelyekkel lövést lehet leadni a másik játékos tábláján.
     */

    // has a logic responsible for handling shots.

    // has a field of the List<Ship> type.

    //  has an isAlive method that checks whether the player
    //  lost all ships and returns true or false accordingly.



