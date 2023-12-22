package com.george.module2.two;

import java.util.Objects;

public class Card {
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


}
