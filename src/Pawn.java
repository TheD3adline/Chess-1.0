public class Pawn extends Piece {

    private final char symbol = 'P';

    public Pawn(int playerNumber, String playerColor) {
        super(playerNumber, playerColor);
    }

    public char getSymbol() {
        return symbol;
    }
}
