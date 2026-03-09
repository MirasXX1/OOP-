package problem2;

public abstract class Piece {
    protected Position position;

    public Piece(Position pos){
        this.position = pos;
    }

    public Position getPosition(){ return position; }

    public void setPosition(Position pos){ this.position = pos; }

    public abstract boolean isLegalMove(Position newPos);
}