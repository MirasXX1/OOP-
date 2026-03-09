package problem2;

public class Knight extends Piece {

    public Knight(Position pos){ super(pos); }

    @Override
    public boolean isLegalMove(Position newPos){
        int rowDiff = Math.abs(position.getRow() - newPos.getRow());
        int colDiff = Math.abs(position.getCol() - newPos.getCol());
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}