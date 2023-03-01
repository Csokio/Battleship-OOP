package com.codecool.battlehip.enums;

import com.codecool.battlehip.Ship;

public enum ShipType {

    CARRIER(5), BATTLESHIP(4), SUBMARINE(3), CRUISER(3), DESTROYER(2), DAVIDHASSELHOFF(1);

    private final int size;

    ShipType(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public static /*Ship[]*/ ShipType getBySize(int size) {
        for (ShipType shipType : ShipType.values()) {
            if (shipType.getSize() == size) {
                return shipType;
            }
        }
        return null; // Or throw an exception if size is not valid
    }

}
