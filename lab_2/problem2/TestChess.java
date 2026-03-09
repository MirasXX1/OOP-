package problem2;

//run
//javac problem2/*.java
//java problem2.TestChess


public class TestChess {
    public static void main(String[] args){
        Rook rook = new Rook(new Position(0,0));
        System.out.println("Rook move to (0,5): " + rook.isLegalMove(new Position(0,5)));
        System.out.println("Rook move to (5,5): " + rook.isLegalMove(new Position(5,5)));

        Bishop bishop = new Bishop(new Position(2,0));
        System.out.println("Bishop move to (5,3): " + bishop.isLegalMove(new Position(5,3)));

        Queen queen = new Queen(new Position(0,3));
        System.out.println("Queen move to (3,3): " + queen.isLegalMove(new Position(3,3)));
        System.out.println("Queen move to (3,6): " + queen.isLegalMove(new Position(3,6)));

        Knight knight = new Knight(new Position(1,0));
        System.out.println("Knight move to (2,2): " + knight.isLegalMove(new Position(2,2)));

        King king = new King(new Position(4,4));
        System.out.println("King move to (5,5): " + king.isLegalMove(new Position(5,5)));
        System.out.println("King move to (6,6): " + king.isLegalMove(new Position(6,6)));

        Pawn whitePawn = new Pawn(new Position(1,1), true);
        System.out.println("White Pawn move to (2,1): " + whitePawn.isLegalMove(new Position(2,1)));

        Pawn blackPawn = new Pawn(new Position(6,1), false);
        System.out.println("Black Pawn move to (5,1): " + blackPawn.isLegalMove(new Position(5,1)));
    }
}