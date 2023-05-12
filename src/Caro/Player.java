package Caro;

import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    private Scanner scanner;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public Move getMove(Board board) {
        while (true) {
            System.out.println(name + ", please enter your move (row,column):");
            String input = scanner.nextLine();
            String[] inputArr = input.split(",");
            if (inputArr.length != 2) {
                System.out.println("Invalid input. Please enter your move in the format row,column");
                continue;
            }
            try {
                int row = Integer.parseInt(inputArr[0].trim()) - 1;
                int col = Integer.parseInt(inputArr[1].trim()) - 1;
                Move move = new Move(this, row, col);
                if (board.isValidMove(move)) {
                    return move;
                } else {
                    System.out.println("Invalid move. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter your move in the format row,column");
            }
        }
    }
}
