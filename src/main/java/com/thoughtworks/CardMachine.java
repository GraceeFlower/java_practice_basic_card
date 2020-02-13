package com.thoughtworks;

import java.util.Random;

public class CardMachine {
    private Card cardFormat;

    public CardMachine() {

    }

    public Card getCardFormat() {
        return cardFormat;
    }

    public void setCardFormat(Card cardFormat) {
        this.cardFormat = cardFormat;
    }

    public CardMachine(Card cardFormat) {
        this.cardFormat = cardFormat;
    }

    public String drawCard(Card cardFormat) {
        Random r = new Random();
        String[] pattern = cardFormat.getPattern();
        String[] figure = cardFormat.getFigure();
        return pattern[r.nextInt((pattern.length))]
            + pattern[r.nextInt(figure.length)];
    }
}
