package com.bridgelabz.deck_of_cards;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards {
    final private String[] SUIT = {"Clubs", "Diamonds", "Hearts", "Spades"};
    final private String[] RANK = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    final private Card[] DECK_OF_CARDS = new Card[52];

    public void getDeckOfCards() {
        int indexOfCard = 0;
        for (String i : SUIT) {
            for (String j : RANK) {
                Card card = new Card(i, j);
                DECK_OF_CARDS[indexOfCard] = card;
                indexOfCard++;
            }
        }
    }

    public void getShuffledDeck() {
        Random random = new Random();
        for (int i = 0; i < DECK_OF_CARDS.length; i++) {
            int remaining = random.nextInt(52 - i);
            Card temp = DECK_OF_CARDS[i];
            DECK_OF_CARDS[remaining] = DECK_OF_CARDS[i];
            DECK_OF_CARDS[i] = temp;
        }
    }

    public void distributeCards(int noOfPlayers) {
        int j = 0;
        for (int i = 0; i < noOfPlayers; i++) {
            ArrayList<Card> playerCards = new ArrayList<>();
            for (int k = 0; k < 10; k++) {
                playerCards.add(DECK_OF_CARDS[j]);
                j++;
            }
            Player player = new Player();
            player.setPlayerCards(playerCards);
            System.out.println(player.getPlayerCards().toString());
        }
    }
}