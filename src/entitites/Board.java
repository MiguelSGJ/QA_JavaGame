package entitites;

public class Board {
    private Player[][] board;

    public Board(int rows, int columns) {
        board = new Player[rows][columns];
    }

    public void initBoard(Player player) {
        board[player.getPosition()][0] = player;
    }

    public void printBoard() {
        for (Player[] row : board) {
            for (Player player : row) {
                if (player != null) {
                    System.out.print(player.getName());
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    
    public void updatePlayerPosition(Player player) {
        if (player.getPosition() < 0 || player.getPosition() >= board[0].length) {
            return; 
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = null; 
            }
        }
        board[1][player.getPosition()] = player; 
    }
    
}

