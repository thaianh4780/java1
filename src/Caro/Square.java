package Caro;

public class Square {
    private int row;
    private int col;
    private Player player;

    public Square(int row, int col) {
        this.row = row;
        this.col = col;
        this.player = null;
    }

    public boolean isEmpty() {
        return player == null;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
