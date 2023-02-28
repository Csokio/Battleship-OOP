package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class BoardFactory {

    //  has a @randomPlacement() method that handles random ship placement on board

    // has a @manualPlacement() method that handles manual ship placement on board

    private static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));


    public void randomPlacement() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }




    public void manualPlacement(Board board, Scanner scanner, int size, boolean isHorizontal) {
        System.out.println(Color.TEXT_BLUE + MESSAGES.getString("askForCoordinates"));
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        if (!board.isPlacementOk(row, col, size, isHorizontal)) {
            System.out.println(Color.TEXT_RED + MESSAGES.getString("invalidPlacement"));
            return;
        }

        if (isHorizontal) {
            for (int c = col; c < col + size; c++) {
                board.getSquare(row, c).setHasShip(true);
            }
        } else {
            for (int r = row; r < row + size; r++) {
                board.getSquare(r, col).setHasShip(true);
            }
        }

        System.out.println(board);
    }
}
