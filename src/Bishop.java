public class Bishop extends Piece {

    private String symbol = "B";
    private String nameOfPiece = "Bishop";
    private String legend = "B...Bishop";

    public Bishop(int player) {
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
        if((yEnd <= (yStart - 1)) && (yEnd >= (yStart - 7)) && ((xEnd <= (xStart - 1)) && (xEnd >= (xStart - 7)))) {
            return true;
        } else if((yEnd <= (yStart + 1)) && (yEnd >= (yStart + 7)) && ((xEnd <= (xStart + 1)) && (xEnd >= (xStart + 7)))) {
            return true;
        } else if((yEnd <= (yStart - 1)) && (yEnd >= (yStart - 7)) && ((xEnd <= (xStart + 1)) && (xEnd >= (xStart + 7)))) {
            return true;
        } else if((yEnd <= (yStart + 1)) && (yEnd >= (yStart + 7)) && ((xEnd <= (xStart - 1)) && (xEnd >= (xStart - 7)))) {
            return true;
        }
        return false;
    }
}
