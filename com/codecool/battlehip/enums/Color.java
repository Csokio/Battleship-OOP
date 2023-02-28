package com.codecool.battlehip.enums;

public enum Color {


    TEXT_RED("\u001B[31m"),
    TEXT_GREEN("\u001B[32m"),
    TEXT_YELLOW("\u001B[33m"),
    TEXT_BLUE("\u001B[34m"),
    TEXT_PURPLE("\u001B[35m"),
    TEXT_CYAN("\u001B[36m"),
    TEXT_WHITE("\u001B[37m");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

}
