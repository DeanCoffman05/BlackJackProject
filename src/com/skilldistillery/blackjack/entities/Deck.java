package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public List<Card> deckOfCards;

	public Deck() {
		deckOfCards = makeTheDeck();

	}

	public List<Card> makeTheDeck() {
		List<Card> deckOfCards = new ArrayList<>();
		// To make a deck of cards we need the suit and the rank combined to one card.
		for (Suit suit : Suit.values()) {
			for (Rank value : Rank.values()) {
				deckOfCards.add(new Card(suit, value));

			}
		}

		return deckOfCards;

	}

	public int checkDeckSize() {
		return deckOfCards.size();
	}

	public Card dealCard() {
		Card aCard = null;
		aCard = deckOfCards.remove(0);
		return aCard;
	}
	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}

}
