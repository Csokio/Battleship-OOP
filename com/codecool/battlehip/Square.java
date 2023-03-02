package com.codecool.battlehip;

import com.codecool.battlehip.enums.SquareStatus;

import static com.codecool.battlehip.Battleship.MESSAGES;


public class Square {
    private int x;
    private int y;

    private boolean hit;

    private SquareStatus status;

    private boolean hasShip;

    private Ship ship;

    public boolean hasShip(){
        return hasShip;
    }

    public void setHasShip(boolean hasShip) {
        this.hasShip = hasShip;

    }

    //TODO mellőzött kódrészlet
    public boolean isHit() {
        if (hit) {
            return false;
        } else if (hasShip) {
            hit = true;
            ship.addHit();
            return true;
        } else {
            hit = true;
            return false;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(status.getStatus());
    }

    public Square(int x, int y){
        this.x = x;
        this.y = y;
        this.status = SquareStatus.EMPTY;
    }


    public SquareStatus getStatus() {
        return status;
    }

    public void setStatus(SquareStatus status) {
        this.status = status;
    }


    //TODO mellőztük a használatát
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


    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }



    public boolean checkSunk() {
        if (hasShip && ship != null && ship.isSunk()) {
            for (Square square : ship.getSquares()) {
                square.setStatus(SquareStatus.SKUNK);
            }
            System.out.println(ship.getName() + MESSAGES.getString("hasBeenSunk"));

            return true;
        }
        return false;
    }

    public void takeAttack() {
        if (status == SquareStatus.SHIP) {
            status = SquareStatus.HIT;
        } else {
            status = SquareStatus.MISSED;
        }
    }

}



