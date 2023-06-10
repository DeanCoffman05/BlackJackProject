package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> hand = new ArrayList<>();
	

	public abstract int getHandValue();

	public void addCard(Card card) {
		hand.add(card);

	}

	public void clear() {

	}

	@Override
	public String toString() {
		return hand.toString();
	}

}
