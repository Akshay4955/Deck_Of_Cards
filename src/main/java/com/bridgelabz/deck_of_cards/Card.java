package com.bridgelabz.deck_of_cards;

public class Card {
    String suit;
    String rank;

    public Card (String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + " " + rank;
    }
}
