package Bai4;

public class Card implements Comparable {
    public static String[] suits = {"bích", "chuồn", "rô", "cơ"};
    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private int suit;  // loại bài
    private int rank;  // thứ tự quân bài

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + ranks[rank] +
                ",suit=" + suits[suit] +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Card card2 = (Card) o;
        if (this.getRank() - card2.getRank() == 0) {
            return this.getSuit() - card2.getSuit();
        } else {
            return this.getRank() - card2.getRank();
        }
    }
}
