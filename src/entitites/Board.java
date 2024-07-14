package entitites;

public class Board {
    private Player[][] board;

    public Board(int rows, int columns) {
        board = new Player[rows][columns];
    }

    public void initBoard(Player player) {
        board[0][player.getPosition()] = player;
    }

    public void printBoard() {
        for (Player[] row : board) {
            for (Player player : row) {
                if (player != null) {
                    System.out.print(player.getNome() + " ");
                } else {
                    System.out.print("|----| ");
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
                if (board[i][j] != null && board[i][j].getNome().equals(player.getNome())) {
                    board[i][j] = null;
                }
            }
        }
        board[0][player.getPosition()] = player;
    }

    public int getColumns() {
        return board[0].length;
    }
}
