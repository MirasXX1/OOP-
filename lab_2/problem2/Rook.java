package problem2;

public class Rook extends Piece {

    public Rook(Position pos){ super(pos); }

    @Override
    public boolean isLegalMove(Position newPos){
        return position.getRow() == newPos.getRow() || position.getCol() == newPos.getCol();
    }
}