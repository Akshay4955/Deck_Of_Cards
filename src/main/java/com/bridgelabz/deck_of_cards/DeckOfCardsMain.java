package com.bridgelabz.deck_of_cards;


public class DeckOfCardsMain {
    public static void main(String[] args) {
        System.out.println("Welcome to deck of cards game");
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.getDeckOfCards();
        deckOfCards.getShuffledDeck();
        deckOfCards.distributeCards();
    }
}
