package entitites;

public class Game {
	
	private Question[] questionAndAnswer;
	private Player player;
	private Board board;
	int[] initialPos = {2,1};
	
	public Game() {
		questionAndAnswer = new Question[10];
		questionAndAnswer[0] = new Question("Quem foi Ada Lovelace?", 'a');
		questionAndAnswer[1] = new Question("Quem foi Linus Torvald?", 'b');
		questionAndAnswer[2] = new Question("Quem foi Alan Turing?", 'c');

		player = new Player("Miguel", initialPos, false);
		board = new Board(5, 16);
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Board getBoard() {
		return board;
	}
	
}
