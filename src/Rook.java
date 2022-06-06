public class Rook extends Piece {

    private String symbol;

    public Rook(int belongsToPlayer) {
        super(belongsToPlayer);
        if(belongsToPlayer == 1) {
            this.symbol = "\u2656";
        } else if(belongsToPlayer == 2) {
            this.symbol = "\u265C";
        }
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
