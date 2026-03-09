package problem2;

public class Pawn extends Piece {

    private boolean isWhite;

    public Pawn(Position pos, boolean isWhite){
        super(pos);
        this.isWhite = isWhite;
    }

    @Override
    public boolean isLegalMove(Position newPos){
        int dir = isWhite ? 1 : -1;
        return position.getCol() == newPos.getCol() && newPos.getRow() - position.getRow() == dir;
    }
}