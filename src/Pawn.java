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
                if((xEnd == xStart) && ((yEnd == (yStart - 1)) || (yEnd == (yStart - 2)))) {
                    Board.getFieldStatus(yEnd, xEnd).isVacant(); // HOW TO PROCEED WITH COLLISION AND STRIKE CHECKS!!!
                    firstMove = false;
                    return true;
                } else if(((xEnd == (xStart - 1)) || (xEnd == (xStart + 1))) && (yEnd == (yStart - 1))) {
                    firstMove = false;
                    return true;
                }
            } else if(getPlayer() == 2) {
                if((xEnd == xStart) && ((yEnd == (yStart + 1)) || (yEnd == (yStart + 2)))) {
                    firstMove = false;
                    return true;
                } else if(((xEnd == (xStart - 1)) || (xEnd == (xStart + 1))) && (yEnd == (yStart + 1))) {
                    firstMove = false;
                    return true;
                }
            }
        } else if(!firstMove) {
            if(getPlayer() == 1) {
                if((xEnd == xStart) && (yEnd == (yStart - 1))) {
                    return true;
                } else if(((xEnd == (xStart - 1)) || (xEnd == (xStart + 1))) && (yEnd == (yStart - 1))) {
                    return true;
                }
            } else if(getPlayer() == 2) {
                if((xEnd == xStart) && (yEnd == (yStart + 1))) {
                    return true;
                } else if(((xEnd == (xStart - 1)) || (xEnd == (xStart + 1))) && (yEnd == (yStart + 1))) {
                    return true;
                }
            }
        }
        return false;
    }
}
