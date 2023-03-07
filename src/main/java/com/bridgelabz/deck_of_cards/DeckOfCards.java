package com.bridgelabz.deck_of_cards;

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

    public void distributeCards() {
        int index = 0;
        for (int i = 0; i < 4; i++) {
            Card[] card = new Card[9];
            for (int j = 0; j < 9; j++) {
                card[j] = DECK_OF_CARDS[index];
                index++;
            }
            System.out.println("Cards for player " + (i + 1) );
            for (Card x: card) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}