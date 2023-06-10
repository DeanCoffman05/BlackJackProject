package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	protected List<Integer> counter = new ArrayList<>();
	protected Hand hand = new BlackjackHand();
	public void addCardToHand(Card card) {
		hand.addCard(card);
	}

	public void displayHand() {
		System.out.println(hand);

	}

	public int getHandValue() {
	return	hand.getHandValue();
		
	}
	

}

