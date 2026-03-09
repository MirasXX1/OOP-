package problem2;

public class Queen extends Piece {

    public Queen(Position pos){ super(pos); }

    @Override
    public boolean isLegalMove(Position newPos){
        return new Rook(position).isLegalMove(newPos) || new Bishop(position).isLegalMove(newPos);
    }
}