public class Pawn extends Piece {

    private String symbol = "P";
    private String nameOfPiece = "Pawn";
    private String legend = "P...Pawn";
    private boolean firstMove = true;

    public Pawn(int player) {
        super(player);
    }

    @Override
    public String getSymbol() {
        if(getPlayer() == 1) {
            return getANSI_GREEN() + this.symbol + getANSI_RESET();
        } else if(getPlayer() == 2) {
            return getANSI_RED() + this.symbol + getANSI_RESET();
        } else {
            return null;
        }
    }

    @Override
    public String getLegend() {
        return legend;
    }

    @Override
    public String getNameOfPiece() {
        return nameOfPiece;
    }

    @Override
    public boolean moveIsValid(int yStart, int xStart, int yEnd, int xEnd) {
        if(firstMove) {
            if(getPlayer() == 1) {
                if(xStart == xEnd) {
                    if((yEnd < yStart) && ((yStart - yEnd) <= 2)) {
                        return true;
                    }
                } else if((xStart > 0) && (xStart < 7)) {

                }
            }
        }
        return false;
    }
}
