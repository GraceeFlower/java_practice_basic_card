package com.thoughtworks;

import java.util.HashSet;
import java.util.Random;

public class CardMachine {

    private Card cardFormat;

    public CardMachine(Card cardFormat) {
        this.cardFormat = cardFormat;
    }

    public Card getCardFormat() {
        return cardFormat;
    }

    public void setCardFormat(Card cardFormat) {
        this.cardFormat = cardFormat;
    }

    public HashSet<String> drawCard(int numOfCard) {
        HashSet<String> cardMap = new HashSet<>();
        Random r = new Random();
        while (numOfCard != cardMap.size()) {
            CardPattern[] pattern = cardFormat.getPattern();
            String[] figure = cardFormat.getFigure();
            cardMap.add(pattern[r.nextInt(pattern.length)].getPattern()
                + figure[r.nextInt(figure.length)]);
        }
        return cardMap;
    }
}
