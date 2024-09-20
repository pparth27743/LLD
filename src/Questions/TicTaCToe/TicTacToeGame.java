package Questions.TicTaCToe;

import Questions.TicTaCToe.Models.Board;
import Questions.TicTaCToe.Models.PieceType;
import Questions.TicTaCToe.Models.Player;
import Questions.TicTaCToe.Models.PlayingPiece;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {
    private Deque<Player> players;
    private Board gameBoard;
    private Player winner;

    public TicTacToeGame(int boardSize) {
        this.players = new ArrayDeque<>();
        this.gameBoard = new Board(boardSize);
    }

    public Deque<Player> getPlayers() {
        return players;
    }

    public Board getGameBoard() {
        return gameBoard;
    }

    public Player getWinner() {
        return winner;
    }

    public void initializeGame() {

        PlayingPiece pieceX = new PlayingPiece(PieceType.X);
        Player playerX = new Player(pieceX, "Player 1");
        players.add(playerX);

        PlayingPiece pieceO = new PlayingPiece(PieceType.O);
        Player playerO = new Player(pieceO, "PLayer 2");
        players.add(playerO);

    }

    public void startGame() {
        Scanner inputScanner = new Scanner(System.in);
        boolean gameOver = false;
        int availabelSlots = gameBoard.getSize() * gameBoard.getSize();

        while(!gameOver) {

            // player's turn
            // ask player for move
            // check if it's valid move
            // make move
            // check if its winner
            // decide gameOver or not
            // if not put back player

            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            System.out.print(playerTurn.getName() + ", Your turn. Make you move: ");
            String input = inputScanner.nextLine();
            String[] values = input.split(",");
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);

            if(!gameBoard.addPiece(row, col, playerTurn.getPiece())) {
                System.out.println("Incorrect Input, please try again");
                players.addFirst(playerTurn);
                continue;
            }
            availabelSlots--;
            if(isWinner(row, col, playerTurn)) {
                winner = playerTurn;
                gameOver = true;
                gameBoard.printBoard();
            }
            players.addLast(playerTurn);

            if(availabelSlots == 0) {
                gameOver = true;
            }
        }

    }

    private boolean isWinner(int row, int col, Player player) {
        boolean rowCheck = true;
        boolean colCheck = true;
        boolean diagCheck = true;
        boolean revDiagCheck = true;

        // Check row
        for(int i=0; i<gameBoard.getSize(); i++) {
            if(gameBoard.board[row][i] == null || !gameBoard.board[row][i].equals(player.getPiece())) {
                rowCheck = false;
                break;
            }
        }

        // Check col
        for(int i=0; i<gameBoard.getSize(); i++) {
            if(gameBoard.board[i][col] == null || !gameBoard.board[i][col].equals(player.getPiece())) {
                colCheck = false;
                break;
            }
        }

        // Check Diagonal
        for(int i=0,j=0; i<gameBoard.getSize(); i++,j++) {
            if(gameBoard.board[i][j] == null || !gameBoard.board[i][j].equals(player.getPiece())){
                diagCheck = false;
                break;
            }
        }

        // Check Reverse Diagonal
        for(int i=0,j=gameBoard.getSize()-1; i<gameBoard.getSize(); i++,j--) {
            if(gameBoard.board[i][j] == null || !gameBoard.board[i][j].equals(player.getPiece())){
                revDiagCheck = false;
                break;
            }
        }

        return rowCheck || colCheck || revDiagCheck || diagCheck;

    }


    public void showResults() {
        if(winner != null)
            System.out.println(winner.getName() + " won!!!");
        else
            System.out.println("Tie");
    }
}
