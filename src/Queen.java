public class Queen extends Piece {

    private String symbol = "Q";
    private String nameOfPiece = "Queen";
    private String legend = "Q...Queen";

    public Queen(int player) {
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
        if((xEnd == xStart) || (yEnd == yStart)) {
            return true;
        } else {
            for(int i = 1; i <= 7; i++) {
                if((yEnd == (yStart - i)) && (xEnd == (xStart + i))) {
                    return true;
                } else if((yEnd == (yStart + i)) && (xEnd == (xStart - i))) {
                    return true;
                } else if((yEnd == (yStart - i)) && (xEnd == (xStart - i))) {
                    return true;
                } else if((yEnd == (yStart + i)) && (xEnd == (xStart + i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
