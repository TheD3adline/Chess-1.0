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
                    if((yEnd == (yStart - 1)) && (Board.getFieldStatus(yEnd, xEnd).isVacant())) {
                        firstMove = false;
                        return true;
                    } else if((yEnd == (yStart - 2)) && ((Board.getFieldStatus(yEnd + 1, xEnd).isVacant()) && (Board.getFieldStatus(yEnd, xEnd).isVacant()))) {
                        firstMove = false;
                        return true;
                    } else {
                        System.out.println("Invalid turn, the path is blocked!");
                        return false;
                    }
                } else if(((xEnd == (xStart - 1)) || (xEnd == (xStart + 1))) && (yEnd == (yStart - 1))) {
                    if(!Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                        if(Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer() == 2) {
                            System.out.println("Performed a strike on the Red " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                            Board.getFieldStatus(yEnd, xEnd).removePiece();
                            firstMove = false;
                            return true;
                        } else {
                            System.out.println("Invalid turn, you can't strike your own piece!");
                            return false;
                        }
                    } else {
                        System.out.println("Invalid turn, move not legal!");
                        return false;
                    }
                }
            } else if(getPlayer() == 2) {
                if((xEnd == xStart) && ((yEnd == (yStart + 1)) || (yEnd == (yStart + 2)))) {
                    if((yEnd == (yStart + 1)) && (Board.getFieldStatus(yEnd, xEnd).isVacant())) {
                        firstMove = false;
                        return true;
                    } else if((yEnd == (yStart + 2)) && ((Board.getFieldStatus(yEnd - 1, xEnd).isVacant()) && (Board.getFieldStatus(yEnd, xEnd).isVacant()))) {
                        firstMove = false;
                        return true;
                    } else {
                        System.out.println("Invalid turn, the path is blocked!");
                        return false;
                    }
                } else if(((xEnd == (xStart - 1)) || (xEnd == (xStart + 1))) && (yEnd == (yStart + 1))) {
                    if(!Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                        if(Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer() == 1) {
                            System.out.println("Performed a strike on the Green " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                            Board.getFieldStatus(yEnd, xEnd).removePiece();
                            firstMove = false;
                            return true;
                        } else {
                            System.out.println("Invalid turn, you can't strike your own piece!");
                            return false;
                        }
                    } else {
                        System.out.println("Invalid turn, move not legal!");
                        return false;
                    }
                }
            }
        } else if(!firstMove) {
            if(getPlayer() == 1) {
                if((xEnd == xStart) && (yEnd == (yStart - 1))) {
                    if(Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                        return true;
                    } else {
                        System.out.println("Invalid turn, the path is blocked!");
                        return false;
                    }
                } else if(((xEnd == (xStart - 1)) || (xEnd == (xStart + 1))) && (yEnd == (yStart - 1))) {
                    if(!Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                        if(Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer() == 2) {
                            System.out.println("Performed a strike on the Red " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                            Board.getFieldStatus(yEnd, xEnd).removePiece();
                            return true;
                        } else {
                            System.out.println("Invalid turn, you can't strike your own piece!");
                            return false;
                        }
                    } else {
                        System.out.println("Invalid turn, move not legal!");
                        return false;
                    }
                }
            } else if(getPlayer() == 2) {
                if((xEnd == xStart) && (yEnd == (yStart + 1))) {
                    if(Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                        return true;
                    } else {
                        System.out.println("Invalid turn, the path is blocked!");
                        return false;
                    }
                } else if(((xEnd == (xStart - 1)) || (xEnd == (xStart + 1))) && (yEnd == (yStart + 1))) {
                    if(!Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                        if(Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer() == 2) {
                            System.out.println("Performed a strike on the Green " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                            Board.getFieldStatus(yEnd, xEnd).removePiece();
                            return true;
                        } else {
                            System.out.println("Invalid turn, you can't strike your own piece!");
                            return false;
                        }
                    } else {
                        System.out.println("Invalid turn, move not legal!");
                        return false;
                    }
                }
            }
        }
        System.out.println("Invalid turn, move not legal!");
        return false;
    }
}
