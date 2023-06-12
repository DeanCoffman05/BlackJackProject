package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BJApp {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BJApp bj = new BJApp();
		bj.run();

	}

	public void run() {
		Dealer dealer = new Dealer();
		Player player = new Player();

		System.out.println("Welcome to Blackjack! \n");
		System.out.println("Please type 1 to play or 2 to quit.");

		if (sc.nextInt() == 1) {
			dealer.dealerShuffle();
			sc.nextLine();
			Card card = dealer.dealCard();
			player.addCardToHand(card);
			System.out.println("Player has:  ");
			player.displayHand();
			System.out.println("Value of: " + player.getHandValue());
			System.out.println();

			card = dealer.dealCard();
			dealer.addCardToHand(card);
			System.out.println("Dealer has:  ");
			System.out.println("Card Hidden");
			System.out.println();

			card = dealer.dealCard();
			player.addCardToHand(card);
			System.out.println("Player has:  ");
			player.displayHand();
			System.out.println("Total hand Value of: " + player.getHandValue());
			System.out.println();

			card = dealer.dealCard();
			dealer.addCardToHand(card);
			System.out.println("Dealer has:  ");
			System.out.println(card);
			System.out.println();

		} else {
			System.out.println("Goodbye!");
			System.exit(0);
		}
		if (player.getHandValue() == 21) {
			System.out.println("!BLACKJACK!");
			run();
		}
		while (player.getHandValue() < 21 || player.getHandValue() == 21) {
			System.out.println("Do you want to \"hit\" or \"stand\"?");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("hit")) {
				Card card = dealer.dealCard();
				player.addCardToHand(card);
				player.displayHand();
				System.out.println("Total hand Value of: " + player.getHandValue());
				System.out.println(" ");
				if (player.getHandValue() > 22) {
					System.out.println("___BUST!___");
					run();
				}

			} else if (choice.equalsIgnoreCase("stand")) {
				break;
			}
			else if (!choice.equalsIgnoreCase("hit") || !choice.equalsIgnoreCase("stand")) {
				System.out.println("Error: Not a choice, please choose hit or stand.");
			}

		}
		System.out.println("The Dealer has: ");
		dealer.displayHand();
		System.out.println("Total hand Value of: " + dealer.getHandValue());
		while (dealer.getHandValue() < 17) {
			if (dealer.getHandValue() == 21) {
				System.out.println("Dealer !BLACKJACK!");
			} else {
				System.out.println("Dealer Hits. \n");
				System.out.println(" ");
				Card card = dealer.dealCard();
				dealer.addCardToHand(card);
				dealer.displayHand();
				System.out.println("Total hand value of:  " + dealer.getHandValue());
				if (dealer.getHandValue() > 21) {
					System.out.println("___Dealer BUSTS!___ \n");
					run();
				} else {
					continue;
				}
			}
		}
		if (player.getHandValue() > dealer.getHandValue()) {
			System.out.println("PLAYER WINS THIS HAND!");
			run();
		} else if (player.getHandValue() < dealer.getHandValue()) {
			System.out.println("\n Dealer wins this hand. \n");
			run();
		} else {
			System.out.println("This hand is a draw.");
			run();
		}
	}
}
