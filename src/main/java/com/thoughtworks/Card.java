package com.thoughtworks;

public class Card {
    private final CardPattern[] pattern
        = {CardPattern.SPADE, CardPattern.CLUB, CardPattern.DIAMOND, CardPattern.HEART};
    private final String[] figure
        = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public CardPattern[] getPattern() {
        return pattern;
    }

    public String[] getFigure() {
        return figure;
    }

}
