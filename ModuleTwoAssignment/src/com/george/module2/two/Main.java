package com.george.module2.two;

import java.util.*;

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


         ArrayList<Card> firstHand = new ArrayList<>();



         for(int j = 0; j<7; j++){
         firstHand.add(cardList.poll());
         }
         System.out.println(firstHand);


    }
}
