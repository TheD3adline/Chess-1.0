public class King extends Piece {

    private String symbol = "K";
    private String nameOfPiece = "King";
    private String legend = "K...King";

    public King(int player) {
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
        if((yEnd == yStart) && ((xEnd == (xStart - 1)) || (xEnd == (xStart + 1)))) {
            if (Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                return true;
            } else if (this.getPlayer() != Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer()) {
                System.out.println("Performed a strike on the " + Board.getFieldStatus(yEnd, xEnd).getPiece().getColor() + " " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                Board.getFieldStatus(yEnd, xEnd).removePiece();
                return true;
            } else if (this.getPlayer() == Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer()) {
                System.out.println("Invalid turn, you can't strike your own piece!");
                return false;
            }
        } else if((xEnd == xStart) && ((yEnd == (yStart - 1)) || (yEnd == (yStart + 1)))) {
            if (Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                return true;
            } else if (this.getPlayer() != Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer()) {
                System.out.println("Performed a strike on the " + Board.getFieldStatus(yEnd, xEnd).getPiece().getColor() + " " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                Board.getFieldStatus(yEnd, xEnd).removePiece();
                return true;
            } else if (this.getPlayer() == Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer()) {
                System.out.println("Invalid turn, you can't strike your own piece!");
                return false;
            }
        } else if(((yEnd == (yStart - 1)) || (yEnd == (yStart + 1))) && ((xEnd == (xStart - 1)) || (xEnd == (xStart + 1)))) {
            if (Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                return true;
            } else if (this.getPlayer() != Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer()) {
                System.out.println("Performed a strike on the " + Board.getFieldStatus(yEnd, xEnd).getPiece().getColor() + " " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                Board.getFieldStatus(yEnd, xEnd).removePiece();
                return true;
            } else if (this.getPlayer() == Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer()) {
                System.out.println("Invalid turn, you can't strike your own piece!");
                return false;
            }
        } else {
            System.out.println("Invalid turn, move not legal!");
            return false;
        }
        return false;
    }
}
