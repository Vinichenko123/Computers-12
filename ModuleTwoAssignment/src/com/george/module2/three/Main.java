package com.george.module2.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Card> cardList = new LinkedList<>();

        Anarchy anarchy = Anarchy.JACK;
        Suit suit = Suit.CLUBS;
        int cardValue = 0;

        for (int i = 0; i< 52; i++){

            if(cardValue < 13){
                cardValue ++;
            } else {
                cardValue = 1;
            }

            if (i<=12){
                suit = Suit.HEARTS;
            } else if (i > 12 && i <= 25) {
                suit = Suit.CLUBS;
            } else if (i >25 && i <= 38) {
                suit = Suit.DIAMONDS;
            } else if (i > 38 && i <= 51){
                suit = Suit.SPADES;
            }

            if (cardValue == 11){
                anarchy = Anarchy.JACK;
            } else if (cardValue == 12) {
                anarchy = Anarchy.QUEEN;
            } else if (cardValue == 13) {
                anarchy = Anarchy.KING;
            }


            if (cardValue <= 10){
                cardList.add(new Card(cardValue, suit));
            } else  {
                cardList.add(new Card(anarchy, suit));
            }


         }


        Collections.shuffle(cardList);

        System.out.println("Unsoreted*****************************"+cardList);

        System.out.println("**************************** SORTED BY NUMERIC VALUE BELOW ****************************");
        Collections.sort(cardList);
        for (Card card : cardList){
            System.out.println(card);
        }

        System.out.println("**************************** SORTED BY SUITS BELOW ****************************");
        SuitComparator c = new SuitComparator();
        Collections.sort(cardList, new SuitComparator());
        for (Card card : cardList){
            System.out.println(card);
        }






    }
}
