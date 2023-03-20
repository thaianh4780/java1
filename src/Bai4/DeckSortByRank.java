package Bai4;

import java.util.Collections;

public class DeckSortByRank {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Collections.sort(deck.getCards());
        deck.printDeck();
    }

    public int compare(Card card1, Card card2) {
        if (card1.getRank() - card2.getRank() == 0) {
            return card1.getSuit() - card2.getSuit();
        } else {
            return card1.getRank() - card2.getRank();
        }

    }
}
