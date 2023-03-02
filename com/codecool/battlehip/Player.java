package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;
import com.codecool.battlehip.enums.SquareStatus;

import java.util.Scanner;

import static com.codecool.battlehip.Battleship.MESSAGES;

public class Player {
    private final String name;
    private Board ownBoard;
    private Board opponentBoard;
    private int sunkShipCounter = 0;


    public int getSunkShipCounter() {
        return sunkShipCounter;
    }

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
            System.out.println(name + MESSAGES.getString("hitShip") + "(" + row + "," + col + ")\n");
        } else {
            square.setStatus(SquareStatus.MISSED);
            System.out.println(name + MESSAGES.getString("missedHit") + "(" + row + "," + col + ")\n");
        }
    }


    public void makeAttack(Scanner scanner) {
        System.out.println(Color.TEXT_BLUE + name + MESSAGES.getString("attackCoordinates"));
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        Square square = opponentBoard.getSquare(row, col);

        square.takeAttack();
        if (square.getStatus() == SquareStatus.HIT) {
            System.out.println(name + MESSAGES.getString("hitShip") + "(" + row + "," + col + ")\n");
            if (square.checkSunk()) {
                System.out.println(name + MESSAGES.getString("sunkShip"));
                sunkShipCounter++;
            }
        } else {
            square.setStatus(SquareStatus.MISSED);
            System.out.println(name + MESSAGES.getString("missedHit") + "(" + row + "," + col + ")\n");
        }
        System.out.println(opponentBoard);
    }


}



