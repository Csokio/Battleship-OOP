package com.codecool.battlehip;

import com.codecool.battlehip.enums.ShipType;
import com.codecool.battlehip.enums.SquareStatus;
import java.util.ArrayList;
import java.util.List;

public class Ship {

    private final String name;
    private final int size;
    private List<Square> squares;

    private int hits;

    private int sunkShipCount;

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
        this.squares = new ArrayList<>();
    }
    public Ship(ShipType shipType) {
        this.name = shipType.toString();
        this.size = shipType.getSize();
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

    public void setSquares(List<Square> squares) {
        this.squares = squares;
    }

    public void addSquare(Square square) {
        squares.add(square);
        square.setHasShip(true);

    }

    public boolean isSunk() {
        for (Square square : squares) {
            if (square.getStatus() == SquareStatus.SHIP) {
                return false;
            }
        }
        return true;
    }



    public void addHit() {
        hits++;
    }



}


