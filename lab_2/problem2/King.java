package problem2;

public class King extends Piece {

    public King(Position pos){ super(pos); }

    @Override
    public boolean isLegalMove(Position newPos){
        int rowDiff = Math.abs(position.getRow() - newPos.getRow());
        int colDiff = Math.abs(position.getCol() - newPos.getCol());
        return rowDiff <= 1 && colDiff <= 1;
    }
}