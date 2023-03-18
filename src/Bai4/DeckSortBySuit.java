package Bai4;

import java.util.Comparator;

public class DeckSortBySuit implements Comparator<Card> {
    private String[] suits = {"cơ", "rô", "chuồn", "bích"};

    public int compare(Card card1, Card card2) {
        int suit1 = 0, suit2 = 0;
        for (int i = 0; i < suits.length; i++) {
            if (card1.getSuit().equals(suits[i])) {
                suit1 = i;
            }
            if (card2.getSuit().equals(suits[i])) {
                suit2 = i;
            }
        }
        if (suit1 < suit2) {
            return -1;
        } else if (suit1 > suit2) {
            return 1;
        } else {
            return card1.getRank().compareTo(card2.getRank());
        }
    }
}
