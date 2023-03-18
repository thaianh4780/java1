package Bai4;

import java.util.Collections;

public class DeckSortByRank {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
//        Collections.sort(deck.getCards(), new DeckSortByRank());
        deck.printDeck();
    }

    public int compare(Card card1, Card card2) {
        int rank1 = getRankValue(card1.getRank());
        int rank2 = getRankValue(card2.getRank());
        if (rank1 < rank2) {
            return -1;
        } else if (rank1 > rank2) {
            return 1;
        } else {
            return card1.getSuit().compareTo(card2.getSuit());
        }
    }

    private int getRankValue(String rank) {
        switch (rank
        ) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 11;
            default:
                return 0;
        }
    }
}
