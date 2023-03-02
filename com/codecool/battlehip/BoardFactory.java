package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;
import com.codecool.battlehip.enums.ShipType;

import static com.codecool.battlehip.Battleship.MESSAGES;

import java.util.*;

public class BoardFactory {

    public int shipCounter = 0;



    public void manualPlacement(Board board, Scanner scanner, int size, boolean isHorizontal) {
        boolean isPlacementOk = false;
        while (!isPlacementOk) {
            System.out.println(Color.TEXT_BLUE + MESSAGES.getString("askForCoordinates"));
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
                System.out.println(Color.TEXT_BLUE + MESSAGES.getString("placedShipNumber") + shipCounter + "\n");
                System.out.println(board);
            } else {
                System.out.println(Color.TEXT_BLUE + MESSAGES.getString("invalidPlacement"));
            }
        }
    }



}











