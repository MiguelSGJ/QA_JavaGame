package program;

import java.util.Scanner;
import entitites.Board;
import entitites.Game;
import entitites.Player;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String playerName = sc.nextLine();
        Game game = new Game(playerName);
        Player player = game.getPlayer();
        Board board = game.getBoard();

        while (true) {
            board.printBoard();
            if (game.askQuestion()) {
                player.rightAnswer();
                board.updatePlayerPosition(player);
                if (player.getPosition() == board.getColumns() - 1) {
                    System.out.println("Parabéns, " + player.getNome() + "! Você venceu!");
                    break;
                }
            } else {
                System.out.println("Resposta errada! Tente novamente.");
            }
        }

        sc.close();
    }
}
