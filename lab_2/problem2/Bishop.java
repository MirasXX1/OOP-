package problem2;

public class Bishop extends Piece {

    public Bishop(Position pos){ super(pos); }

    @Override
    public boolean isLegalMove(Position newPos){
        return Math.abs(position.getRow() - newPos.getRow()) == Math.abs(position.getCol() - newPos.getCol());
    }
}