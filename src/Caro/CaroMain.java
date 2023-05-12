package Caro;

import java.util.Scanner;

public class CaroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player 1's name:");
        String player1Name = scanner.nextLine().trim();

        System.out.println("Enter player 1's symbol (X or O):");
        char player1Symbol = scanner.nextLine().toUpperCase().charAt(0);

        Player player1 = new Player(player1Name, player1Symbol);

        System.out.println("Enter player 2's name:");
        String player2Name = scanner.nextLine().trim();

        char player2Symbol = (player1Symbol == 'X') ? 'O' : 'X';

        Player player2 = new Player(player2Name, player2Symbol);

        Game game = new Game(10 ,"Player 1","Player 2");

        game.play();
    }
}
