package Questions.TicTaCToe.Models;

public class PlayingPiece {
    private PieceType type;

    public PlayingPiece(PieceType type) {
        this.type = type;
    }

    public PieceType getType() {
        return type;
    }
}
