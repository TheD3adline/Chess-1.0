public class Knight extends Piece {

    private String symbol;

    public Knight(int belongsToPlayer) {
        super(belongsToPlayer);
        if(belongsToPlayer == 1) {
            this.symbol = "\u2658";
        } else if(belongsToPlayer == 2) {
            this.symbol = "\u265E";
        }
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
