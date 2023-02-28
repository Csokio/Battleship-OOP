package com.codecool.battlehip;

import com.codecool.battlehip.enums.Color;
import com.codecool.battlehip.enums.ShipType;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Input {

    private static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));


    public static int getShipLength() {
        Scanner scanner = new Scanner(System.in);
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


    /*
     felelős összes bemenet begyűjtéséért.
     Minden különleges esetben külön metódust nyújt.
     Az Input osztály kezeli a bemenet validálását.
     */

        // is responsible for gathering all input

        // provides a seperate method for each case

        // handles input validation


