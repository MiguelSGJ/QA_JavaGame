package entitites;

public class Game {
	
	private Question[] questionAndAnswer;
	private Player player;
	private Board board;
	int initialPos = 1;
	
	public Game() {
		questionAndAnswer = new Question[10];
		questionAndAnswer[0] = new Question("Quem foi Ada Lovelace?", 'a');
		questionAndAnswer[1] = new Question("Quem foi Linus Torvald?", 'b');
		questionAndAnswer[2] = new Question("Quem foi Alan Turing?", 'c');
		
		Player jogador = new Player("Miguel");
		player = new Player( jogador, initialPos, false);
		board = new Board(3, 16);
		board.initBoard(player);
		
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Board getBoard() {
		return board;
	}
	
}
