package Bai4;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + cards +
                '}';
    }

    public Deck() {
        cards = new ArrayList<Card>();
        for (int i = 0; i < Card.suits.length; i++) {
            for (int j = 0; j < Card.ranks.length; j++) {
                cards.add(new Card(i,j));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.printDeck();
    }
}
