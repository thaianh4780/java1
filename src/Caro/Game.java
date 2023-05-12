package Caro;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(int size, String name1, String name2) {
        this.board = new Board(size);
        this.player1 = new Player(name1, 'X');
        this.player2 = new Player(name2, 'O');
        this.currentPlayer = player1;
    }

    public void play() {
        while (true) {
            board.display();
            Move move = currentPlayer.getMove(board);
            if (board.isValidMove(move)) {
                board.setSquareValue(move.getRow(), move.getCol(), currentPlayer.getSymbol());
                board.display();
                if (board.checkWin(currentPlayer)) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }
                if (board.isDraw()) {
                    System.out.println("It's a draw!");
                    break;
                }
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Invalid move, please try again.");
            }
        }
    }








}