package com.codecool.battlehip;

import com.codecool.battlehip.enums.SquareStatus;
import java.util.ArrayList;
import java.util.List;

public class Ship {

    private final String name;
    private final int size;
    private final List<Square> squares;

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
        this.squares = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public List<Square> getSquares() {
        return squares;
    }

    public void addSquare(Square square) {
        squares.add(square);
    }

    public boolean isSunk() {
        for (Square square : squares) {
            if (square.getStatus() == SquareStatus.SHIP) {
                return false;
            }
        }
        return true;
    }


}


