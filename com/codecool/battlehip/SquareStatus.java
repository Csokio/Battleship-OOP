package com.codecool.battlehip;

public enum SquareStatus {

    // represents possible square statuses (empty, ship, hit, missed).

    // unicode character that can be used for printing it out.
    // This unicode character is returned by a SquareStatus.GetCharacter() method.


    EMPTY('0'), SHIP('X'), HIT('H'), MISSED('M'), SUNK('S');

    private final char status;

    SquareStatus(char status) {
        this.status = status;
    }

    public char getStatus() {
        return status;
    }

}
