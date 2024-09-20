package Questions.TicTaCToe;

public class TicTacToeMain {

    public static void main(String args[]) {

        TicTacToeGame ticTacToeGame = new TicTacToeGame(3);
        ticTacToeGame.initializeGame();
        ticTacToeGame.startGame();
        ticTacToeGame.showResults();


    }
}
