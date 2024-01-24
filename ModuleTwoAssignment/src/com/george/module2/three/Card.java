package com.george.module2.three;

import java.util.Objects;

public class Card implements Comparable<Card> {
    int cardNumber;
    Suit suit;
    Anarchy anarchy;




    public Card(int cardNumber, Suit suit ){
        this.cardNumber = cardNumber;
        this.suit = suit;
    }
    public Card(Anarchy anarchy, Suit suit){
        this.anarchy = anarchy;
        this.suit = suit;
    }

    @Override
    public int hashCode() {
        return suit.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card){
            Card other = (Card) obj;
            if (this.cardNumber == other.cardNumber && Objects.equals(this.suit, other.suit)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (cardNumber == 0){
            return anarchy + " of " +suit ;
        } else {
            return cardNumber + " of " + suit;
        }

    }


    @Override
    public int compareTo(Card o) {
        if (this.cardNumber > o.cardNumber){
            return 1;
        }
        else if (this.cardNumber < o.cardNumber){
            return -1;
        }
        return 0;
    }
}
