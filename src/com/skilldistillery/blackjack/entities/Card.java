package com.skilldistillery.blackjack.entities;

import java.util.Objects;

public class Card {
	private Suit suit; // Generate fields so you can build the constructor ("Card")
	private Rank rank;

	protected Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public int getValue() {
		return rank.getValue();
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Card)) {
			return false;
		}
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}

}
