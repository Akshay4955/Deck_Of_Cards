package com.bridgelabz.deck_of_cards;


import java.util.Scanner;

public class DeckOfCardsMain {
    public static void main(String[] args) {
        System.out.println("Welcome to deck of cards game");
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.getDeckOfCards();
        deckOfCards.getShuffledDeck();
        System.out.println("Enter No of Players between 2 to 4");
        Scanner input = new Scanner(System.in);
        int noOfPlayers = input.nextInt();
        deckOfCards.distributeCards(noOfPlayers);
    }
}
