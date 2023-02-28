package com.codecool.battlehip;

import java.util.ArrayList;
import java.util.List;

public class Player {

    /*

    private String name;
    private int score;
    private int numShips;
    private Board board;
    private List<Ship> ships;

    public Player(String name, int numShips) {
        this.name = name;
        this.score = 0;
        this.numShips = numShips;
        this.board = new Board();
        this.ships = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getNumShips() {
        return numShips;
    }

    public Board getBoard() {
        return board;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void incrementScore() {
        score++;
    }

    public void decrementNumShips() {
        numShips--;
    }

    public void placeShips() {
        // TODO: Implement ship placement logic
    }

    public void takeTurn(Player opponent, int row, int col) {
        boolean hit = opponent.getBoard().attack(row, col);
        if (hit) {
            System.out.println("Hit!");
            incrementScore();
            for (Ship ship : opponent.getShips()) {
                if (ship.contains(row, col)) {
                    ship.hit();
                    if (!ship.isAlive()) {
                        System.out.println("You sunk the " + ship.getName() + "!");
                        opponent.decrementNumShips();
                    }
                    break;
                }
            }
        } else {
            System.out.println("Miss!");
        }
    }

    public boolean isAlive() {
        return numShips > 0;
    }

     */



    /*
    Ez az osztály fogja reprezentálni a játékosokat.
    Minden játékosnak lesz egy táblája, amin elhelyezi a saját hajóit, és
    lesznek olyan metódusai, amelyekkel lövést lehet leadni a másik játékos tábláján.
     */

    // has a logic responsible for handling shots.

    // has a field of the List<Ship> type.

    //  has an isAlive method that checks whether the player
    //  lost all ships and returns true or false accordingly.




}
