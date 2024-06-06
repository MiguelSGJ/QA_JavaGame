package entitites;

public class Board {
	private char[][] board;
	
	public Board(int line, int column){
		board = new char[line][column];
		initBoard();
	}
	
	private void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == 0 || i == board.length - 1 || j == 0 || j == board[i].length - 1) {
                    board[i][j] = 'X'; 
                } else if (i == board.length / 2 && j == board[i].length - 2) {
                    board[i][j] = 'C'; 
                } else if (j == board.length && i == board.length / 2) {
                    board[i][j] = '-'; 
                } else {
                    board[i][j] = ' ';
                }
            }
        }
    }
	
	public void printBoard(Player player) {
        char firstCharacter = player.getName().charAt(0);
        int[] playerPosition = player.getPosition();
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == playerPosition[0] && j == playerPosition[1]) {
                    System.out.print(firstCharacter);
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }
	
}

