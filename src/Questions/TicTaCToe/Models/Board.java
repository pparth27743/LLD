package Questions.TicTaCToe.Models;

public class Board {
    private int size;
    public PlayingPiece[][] board;


    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece piece) {
        if(!isValidMove(row, col))
            return false;
        board[row][col] = piece;
        return true;
    }

    private boolean isValidMove(int row, int col) {
        if(row<0 || row>= size || col<0 || col>= size)
            return false;

        if(board[row][col] != null)
            return false;

        return true;
    }

    public void printBoard() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(board[i][j] != null)
                    System.out.print(" " + board[i][j].getType().name() + " ");
                else
                    System.out.print("   ");

                if(j<size-1)
                    System.out.print("|");
            }
            System.out.println("");
        }
    }

    public int getSize() {
        return size;
    }

}
