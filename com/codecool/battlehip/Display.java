package com.codecool.battlehip;

import com.codecool.battlehip.enums.SquareStatus;

public class Display {

    /*
    void printBoard(Board board) {
        Square[][] squares = board.getSquares();
        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < squares.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < squares[i].length; j++) {
                if (squares[i][j].getStatus() == SquareStatus.EMPTY) {
                    System.out.print("~ ");
                } else if (squares[i][j].getStatus() == SquareStatus.MISSED) {
                    System.out.print("o ");
                } else if (squares[i][j].getStatus() == SquareStatus.HIT) {
                    System.out.print("X ");
                } else if (squares[i][j].getStatus() == SquareStatus.SHIP) {
                    System.out.print("S ");
                }
            }
            System.out.println();
        }
    }

     */

    // print the game menu

    // prints the board during manual ship placement process

    // prints the gameplay.

    // prints the outcome of the game when it is over

    // No System.out.print() happens outside of the Display class


    //konstruktor
    public Display() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }


    // pritn current game state
    private void printGameState() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }


    //eredményt pirntel
    private void printEndResult() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }


}
