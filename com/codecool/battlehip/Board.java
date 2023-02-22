package com.codecool.battlehip;

public class Board {

    /*
    Ez az osztály fogja tartalmazni a játéktáblát, valamint azon metódusokat,
    amelyekkel hozzáadhatjuk a hajókat a táblához, ellenőrizhetjük a találatokat és a játék végét is.
     */

    private int Boardsize;


    private Square[][] board;

    // has a Square[][] ocean field. This contains the squares that the board consists of.

    // has an isPlacementOk() method that verifies if placement of ship is possible.


    // konstruktor
    public Board(int BoardSize) {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }


    //getter
    public Square[][] getBoard() {
        return board;
    }



    public boolean isPlacementOk() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }









}
