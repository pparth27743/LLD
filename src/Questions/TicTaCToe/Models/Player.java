package Questions.TicTaCToe.Models;

public class Player {
    private String name;
    private PlayingPiece piece;

    public Player(PlayingPiece piece, String name) {
        this.piece = piece;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPiece() {
        return piece;
    }
}
