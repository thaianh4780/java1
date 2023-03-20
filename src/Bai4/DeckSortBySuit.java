package Bai4;

import java.util.Collections;
import java.util.Comparator;

public class DeckSortBySuit implements Comparator<Card> {

    public static void main(String[] args) {
        DeckSortBySuit deckSortBySuit = new DeckSortBySuit();
        Deck deck = new Deck();
        deck.shuffle();
        Collections.sort(deck.getCards(),deckSortBySuit);
        deck.printDeck();
    }

    @Override
    public int compare(Card card1, Card card2) {
        if (card1.getSuit() - card2.getSuit() == 0) {
            return card1.getRank() - card2.getRank();
        } else {
            return card1.getSuit() - card2.getSuit();
        }

    }
}
