package Caro;

public class Board {
    private int size;
    private char[][] squares;

    public Board(int size) {
        this.size = size;
        this.squares = new char[size][size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                squares[row][col] = '-';
            }
        }
    }

    public void display() {
        System.out.print(" ");
        for (int col = 0; col < size; col++) {
            System.out.print(" " + (col + 1));
        }
        System.out.println();

        for (int row = 0; row < size; row++) {
            System.out.print(row + 1);
            for (int col = 0; col < size; col++) {
                System.out.print(" " + squares[row][col]);
            }
            System.out.println();
        }
    }

    public void setSquareValue(int row, int col, char value) {
        squares[row][col] = value;
    }

    public char getSquareValue(int row, int col) {
        return squares[row][col];
    }

    public boolean checkWin(Player player) {
        char symbol = player.getSymbol();

        // Check rows for a win
        for (int row = 0; row < size; row++) {
            boolean win = true;
            for (int col = 0; col < size; col++) {
                if (squares[row][col] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }

        // Check columns for a win
        for (int col = 0; col < size; col++) {
            boolean win = true;
            for (int row = 0; row < size; row++) {
                if (squares[row][col] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }

        // Check diagonals for a win
        boolean win = true;
        for (int i = 0; i < size; i++) {
            if (squares[i][i] != symbol) {
                win = false;
                break;
            }
        }
        if (win) {
            return true;
        }

        win = true;
        for (int i = 0; i < size; i++) {
            if (squares[i][size - i - 1] != symbol) {
                win = false;
                break;
            }
        }
        if (win) {
            return true;
        }

        return false;
    }

    public boolean isValidMove(Move move) {
        int row = move.getRow();
        int col = move.getCol();

        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false; // kiểm tra tọa độ ngoài bàn cờ
        }

        if (squares[row][col] != '-') {
            return false; // kiểm tra ô đã được đi hay chưa
        }

        return true; // nếu không có vấn đề gì, trả về true
    }

    public boolean isDraw() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (squares[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
