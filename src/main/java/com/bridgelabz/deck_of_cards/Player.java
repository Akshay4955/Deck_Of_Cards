package com.bridgelabz.deck_of_cards;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> playerCards = new ArrayList<>();

    public void setPlayerCards(ArrayList<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public ArrayList<Card> getPlayerCards() {
        return playerCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerCards=" + playerCards +
                '}';
    }
}
