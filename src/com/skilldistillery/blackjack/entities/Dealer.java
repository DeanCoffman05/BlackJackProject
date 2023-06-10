package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {

	private Deck deck;

	public Dealer() {
		deck = new Deck();

	}
	
public void dealerShuffle() {
	deck.shuffle();
}
	public Card dealCard() {
		Card card = deck.dealCard();
		return card;

	}

}
