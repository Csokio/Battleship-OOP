package com.codecool.battlehip.enums;

public enum SquareStatus {


    EMPTY('0'), SHIP('X'), HIT('H'), MISSED('M'), SKUNK('S');   //just joke :)

    private final char status;

    SquareStatus(char status) {
        this.status = status;
    }

    public char getStatus() {
        return status;
    }


}
