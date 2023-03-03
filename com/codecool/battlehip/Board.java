package com.codecool.battlehip;
import com.codecool.battlehip.enums.Color;
import com.codecool.battlehip.enums.ShipType;
import com.codecool.battlehip.enums.SquareStatus;

import java.sql.SQLException;
import java.util.Scanner;

import static com.codecool.battlehip.Battleship.MESSAGES;

public class Board {

    private final int size;

    private Square[][] ocean;

    //private int shipCounter = 0;


    // konstruktor
    public Board(int size) {
        this.size = size;
        this.ocean = new Square[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.ocean[row][col] = new Square(row, col);
            }
        }
    }


    //getter
    public int getSize() {
        return size;
    }

    public Square getSquare(int row, int col) {
        return ocean[row][col];
    }


    public boolean isPlacementOk(int row, int col, int size, boolean isHorizontal) {
        if (isHorizontal) {
            if (col + size > this.size) {
                return false;
            }
            for (int c = col; c < col + size; c++) {
                if (this.ocean[row][c].hasShip()) {
                    return false;
                }
            }
        } else {
            if (row + size > this.size) {
                return false;
            }
            for (int r = row; r < row + size; r++) {
                if (this.ocean[r][col].hasShip()) {
                    return false;
                }
            }
        }
        return true;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                sb.append(ocean[row][col].toString() + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public void addShip(Ship ship) {
        for (Square square : ship.getSquares()) {
            square.setStatus(SquareStatus.SHIP);
        }
    }
}

