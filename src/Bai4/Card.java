package Bai4;

public class Card {
    private String suit;  // loại bài
    private String rank;  // thứ tự quân bài

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public String toString() {
        return rank + " " + suit;
    }
}
