package com.codecool.battlehip;

public class Board {

    /*
    Ez az osztály fogja tartalmazni a játéktáblát, valamint azon metódusokat,
    amelyekkel hozzáadhatjuk a hajókat a táblához, ellenőrizhetjük a találatokat és a játék végét is.
     */

    private final int size;

    private Square[][] ocean;

    // has a Square[][] ocean field. This contains the squares that the board consists of.

    // has an isPlacementOk() method that verifies if placement of ship is possible.


    // konstruktor
    public Board(int size) {
        this.size = size;
        this.ocean = new Square[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.ocean[row][col] = new Square();
            }
        }
    }




    //getter
    public int getSize() {
        return size;
    }

    public Square getSquate(int row, int col) {
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









}
