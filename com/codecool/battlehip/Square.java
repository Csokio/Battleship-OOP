package com.codecool.battlehip;

import com.codecool.battlehip.enums.SquareStatus;

public class Square {
    private int x;
    private int y;
    private SquareStatus status;

    private boolean hasShip;

    public boolean hasShip(){
        return hasShip;
    }


    public void setHasShip(boolean hasShip) {
        this.hasShip = hasShip;
        if (hasShip) {
            this.status = SquareStatus.SHIP;
        } else {
            this.status = SquareStatus.EMPTY;
        }
    }




    public Square(int x, int y){
        this.x = x;
        this.y = y;
        this.status = SquareStatus.EMPTY;
    }
    // has a SquareStatus field

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public SquareStatus getStatus() {
        return status;
    }

    public void setStatus(SquareStatus status) {
        this.status = status;
    }


    // has method that returns a graphical representation of SquareStatus.

    public String getGraphicalRepresentation() {
        switch (status) {
            case EMPTY:
                return "-";
            case SHIP:
                return "S";
            case HIT:
                return "X";
            case MISSED:
                return "O";
            default:
                return "";
        }
    }
}

// contains X and Y fields.

    // has a SquareStatus field

    // has method that returns a graphical representation of SquareStatus.


