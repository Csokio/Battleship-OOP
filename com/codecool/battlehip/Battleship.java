package com.codecool.battlehip;

import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import static com.codecool.battlehip.Game.*;
import static com.codecool.battlehip.Game.endGame;

public class Battleship {


    static final ResourceBundle MESSAGES = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));


    public static void main(String[] args) throws SQLException {

        welcome();
        gameStart();
        endGame();


    }
}

