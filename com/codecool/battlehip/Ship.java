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




    //TODO
/*
    public Ship(ShipType type, boolean isHorizontal) {
        this.type = type;
        squares = new ArrayList<>();
        isSunk = false;
        for (int i = 0; i < type.getSize(); i++) {
            squares.add(new Square());
        }
        if (isHorizontal) {
            for (int i = 0; i < type.getSize(); i++) {
                squares.get(i).setX(i);
            }
        } else {
            for (int i = 0; i < type.getSize(); i++) {
                squares.get(i).setY(i);
            }
        }
    }
*/

}


