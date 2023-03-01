package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;
import com.codecool.battlehip.enums.ShipType;

import java.util.*;

public class BoardFactory {

    //  has a @randomPlacement() method that handles random ship placement on board

    // has a @manualPlacement() method that handles manual ship placement on board

    private static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));


    public void randomPlacement() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int shipCounter = 0;

    public void setShipCounter(int shipCounter) {
        this.shipCounter = shipCounter;
    }

    int getShipCounter(){
        return shipCounter;
    }

    public void decreaseShipCounter() {
        shipCounter--;
    }


    public void manualPlacement(Board board, Scanner scanner, int size, boolean isHorizontal) {
        boolean isPlacementOk = false;
        while (!isPlacementOk) {
            System.out.println("Please enter the row and column of the ship's starting position: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            isPlacementOk = board.isPlacementOk(row, col, size, isHorizontal);

            if (board.isPlacementOk(row, col, size, isHorizontal)) {
                Ship ship = new Ship(ShipType.getBySize(size));

                if (isHorizontal) {
                    for (int i = 0; i < size; i++) {
                        Square square = board.getSquare(row, col + i);
                        ship.addSquare(square);
                        square.setShip(ship);
                    }
                } else {
                    for (int i = 0; i < size; i++) {
                        Square square = board.getSquare(row + i, col);
                        ship.addSquare(square);
                        square.setShip(ship);
                    }
                }

                board.addShip(ship);
                shipCounter++; // növeljük a hajók számát
                System.out.println("Hajó elhelyezve! Jelenleg " + shipCounter + " hajó van a játékban.");
                System.out.println(board);
            } else {
                System.out.println("Helytelen elhelyezési pozíció!");
            }
        }
    }



}











