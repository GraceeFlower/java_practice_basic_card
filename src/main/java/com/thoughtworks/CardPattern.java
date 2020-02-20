package com.thoughtworks;

public enum CardPattern {

    HEART("红桃"),
    DIAMOND("方片"),
    CLUB("梅花"),
    SPADE("黑桃");

    private final String pattern;

    CardPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
