package program;

import entitites.Board;
import entitites.Game;
import entitites.Player;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game();
		Player player = game.getPlayer();
		Board board = game.getBoard();
		
		if(board != null) {
			board.printBoard(player);
		}else { System.out.println("Tabuleiro nao iniciado corretamente"); }
		
		player.rightAnswer();
		board.printBoard(player);
		player.rightAnswer();
		board.printBoard(player);
		player.rightAnswer();
		board.printBoard(player);
		
	}
}
