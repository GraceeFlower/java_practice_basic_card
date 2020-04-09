package com.thoughtworks;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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

    public Set<String> drawCard(int numOfCard) {
        Set<String> cardMap = new HashSet<>();
        Random r = new Random();
        CardPattern[] pattern;
        String[] figure;
        while (numOfCard != cardMap.size()) {
            pattern = cardFormat.getPattern();
            figure = cardFormat.getFigure();
            cardMap.add(pattern[r.nextInt(pattern.length)].getPattern()
                + figure[r.nextInt(figure.length)]);
        }
        return cardMap;
    }
}
