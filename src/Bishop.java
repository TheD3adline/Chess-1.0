public class Bishop extends Piece {

    private String symbol;

    public Bishop(int belongsToPlayer) {
        super(belongsToPlayer);
        if(belongsToPlayer == 1) {
            this.symbol = "\u2657";
        } else if(belongsToPlayer == 2) {
            this.symbol = "\u265D";
        }
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
