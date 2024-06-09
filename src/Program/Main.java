package program;

import java.util.Scanner;

import entitites.Board;
import entitites.Game;
import entitites.Player;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Game game = new Game();
		Player player = game.getPlayer();
		Board board = game.getBoard();
		
		board.printBoard();
		player.rightAnswer();
		board.updatePlayerPosition(player);
		board.printBoard();
		player.rightAnswer();
		board.updatePlayerPosition(player);
		board.printBoard();
	}
}
