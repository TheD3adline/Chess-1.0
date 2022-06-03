public class King extends Piece {

    private String symbol;

    public King(int belongsToPlayer) {
        super(belongsToPlayer);
        if(belongsToPlayer == 1) {
            this.symbol = "\u2655";
        } else if(belongsToPlayer == 2) {
            this.symbol = "\u265B";
        }
    }

    public String getSymbol() {
        return symbol;
    }
}
