package com.george.module2.three;

import java.util.Comparator;

public class SuitComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return Integer.compare(getAssignedValue(o1.suit), getAssignedValue(o2.suit));
    }

    int getAssignedValue(Suit listE) {
        switch (listE) {
            case HEARTS:
                return 0;
            case SPADES:
                return 1;
            case DIAMONDS:
                return 2;
            case CLUBS:
                return 3;
            default:
                return Integer.MAX_VALUE;
        }
    }


}