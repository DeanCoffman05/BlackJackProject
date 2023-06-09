package com.skilldistillery.blackjack.testing;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class TestTheDeck {

//	deck.shuffle();
	public static void main(String[] args) {
	Deck deckOfCards = new Deck();
		
		final int initialDeckSize = deckOfCards.checkDeckSize();
		
		for (int cardNumber = 0; cardNumber < initialDeckSize; cardNumber++) {
			Card card = deckOfCards.dealCard();
			
			System.out.println("cardNumber: " + cardNumber + " " + card + " " + deckOfCards.checkDeckSize());
		}
	
		

	}

}
