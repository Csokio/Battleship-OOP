package com.codecool.battlehip;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    /*
    Ez az osztály fogja tartalmazni a hajók tulajdonságait,
    például a hosszukat és a pozíciójukat a táblán.
     */

    // class has a List<Square> field.

    // it contains the squares where the ship is located


    List<Square> squares = new ArrayList<>();

    private int size;

    private boolean isVertical;


    //konstruktor
    public Ship(int size, boolean isVertical) {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }



    // getter
    public List<Square> getSquares() {
        return squares;
    }



    // elsüllyedt-e
    public boolean isSunk() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }




}
