package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;
import com.codecool.battlehip.enums.ShipType;

import java.util.Scanner;

import static com.codecool.battlehip.Battleship.MESSAGES;

public class Input {


    public static int getShipLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Color.TEXT_YELLOW + MESSAGES.getString("chooseShipType"));
        System.out.println(Color.TEXT_BLUE + MESSAGES.getString("typeOfShip"));
        String input = scanner.nextLine().toUpperCase();
        //TODO validation
        ShipType shipType = ShipType.valueOf(input);
        return shipType.getSize();
    }


    public static int getBoardLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Color.TEXT_BLUE + MESSAGES.getString("sizeOfTable"));
        int input = scanner.nextInt();

        return input;
    }

}
