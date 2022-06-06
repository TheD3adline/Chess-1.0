public class Pawn extends Piece {

    private String symbol;

    public Pawn(int belongsToPlayer) {
        super(belongsToPlayer);
        if(belongsToPlayer == 1) {
            this.symbol = "\u2659";
        } else if(belongsToPlayer == 2) {
            this.symbol = "\u265F";
        }
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
