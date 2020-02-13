package com.thoughtworks;

public class Card {
    private final String[] pattern = {"黑桃", "红桃", "梅花", "方片"};
    private final String[] figure = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public String[] getPattern() {
        return pattern;
    }

    public String[] getFigure() {
        return figure;
    }

}
