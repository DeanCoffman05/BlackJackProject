package com.skilldistillery.blackjack.entities;

public class BlackjackHand extends Hand {

	@Override
	public int getHandValue() {
		int runningTotal = 0;
		for (Card card : hand) {
		runningTotal += card.getValue();
		}
		return runningTotal;
	}

}
