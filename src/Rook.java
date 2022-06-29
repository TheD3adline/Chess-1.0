public class Rook extends Piece {

    private String symbol = "R";
    private String nameOfPiece = "Rook";
    private String legend = "R...Rook";

    public Rook(int player) {
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
    public boolean turnIsValid(int yStart, int xStart, int yEnd, int xEnd) {
        return false;
    }
}
