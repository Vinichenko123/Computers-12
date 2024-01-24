package com.george.module2.three;

public enum Suit {
    HEARTS(0),
    SPADES(1),
    DIAMONDS(2),
    CLUBS(3);

    public final int suitValue;

    Suit(int suitValue) {
        this.suitValue = suitValue;
    }
}
