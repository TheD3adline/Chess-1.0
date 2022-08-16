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
    public boolean moveIsValid(int yStart, int xStart, int yEnd, int xEnd) {
        if((xEnd == xStart) || (yEnd == yStart)) {
            if (Board.getFieldStatus(yEnd, xEnd).isVacant()) {
                if(xEnd == xStart) {
                    if(yEnd > yStart) {
                        for(int i = yEnd - yStart - 1; i >= 0; i--) {
                            if((Board.getFieldStatus(yEnd - i, xEnd).isVacant()) && (i <= 1)) {
                                return true;
                            } else if(!Board.getFieldStatus(yEnd - i, xEnd).isVacant()) {
                                System.out.println("Invalid turn, collision detected!");
                                return false;
                            }
                        }
                    } else if(yEnd < yStart) {
                        for(int i = yStart - yEnd - 1; i >= 0; i--) {
                            if((Board.getFieldStatus(yEnd + i, xEnd).isVacant()) && (i <= 1)) {
                                return true;
                            } else if(!Board.getFieldStatus(yEnd + i, xEnd).isVacant()) {
                                System.out.println("Invalid turn, collision detected!");
                                return false;
                            }
                        }
                    }
                } else if(yEnd == yStart) {
                    if(xEnd > xStart) {
                        for(int i = xEnd - xStart - 1; i >= 0; i--) {
                            if((Board.getFieldStatus(yEnd, xEnd - i).isVacant()) && (i <= 1)) {
                                return true;
                            } else if(!Board.getFieldStatus(yEnd, xEnd - i).isVacant()) {
                                System.out.println("Invalid turn, collision detected!");
                                return false;
                            }
                        }
                    } else if(xEnd < xStart) {
                        for(int i = xStart - xEnd - 1; i >= 0; i--) {
                            if((Board.getFieldStatus(yEnd, xEnd + i).isVacant()) && (i <= 1)) {
                                return true;
                            } else if(!Board.getFieldStatus(yEnd, xEnd + i).isVacant()) {
                                System.out.println("Invalid turn, collision detected!");
                                return false;
                            }
                        }
                    }
                }
            } else if (this.getPlayer() != Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer()) {
                if(xEnd == xStart) {
                    if(yEnd > yStart) {
                        for(int i = yEnd - yStart - 1; i >= 0; i--) {
                            if((Board.getFieldStatus(yEnd - i, xEnd).isVacant()) && (i <= 1)) {
                                System.out.println("Performed a strike on the " + Board.getFieldStatus(yEnd, xEnd).getPiece().getColor() + " " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                                Board.getFieldStatus(yEnd, xEnd).removePiece();
                                return true;
                            } else if(!Board.getFieldStatus(yEnd - i, xEnd).isVacant()) {
                                System.out.println("Invalid turn, collision detected!");
                                return false;
                            }
                        }
                    } else if(yEnd < yStart) {
                        for(int i = yStart - yEnd - 1; i >= 0; i--) {
                            if((Board.getFieldStatus(yEnd + i, xEnd).isVacant()) && (i <= 1)) {
                                System.out.println("Performed a strike on the " + Board.getFieldStatus(yEnd, xEnd).getPiece().getColor() + " " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                                Board.getFieldStatus(yEnd, xEnd).removePiece();
                                return true;
                            } else if(!Board.getFieldStatus(yEnd + i, xEnd).isVacant()) {
                                System.out.println("Invalid turn, collision detected!");
                                return false;
                            }
                        }
                    }
                } else if(yEnd == yStart) {
                    if(xEnd > xStart) {
                        for(int i = xEnd - xStart - 1; i >= 0; i--) {
                            if((Board.getFieldStatus(yEnd, xEnd - i).isVacant()) && (i <= 1)) {
                                System.out.println("Performed a strike on the " + Board.getFieldStatus(yEnd, xEnd).getPiece().getColor() + " " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                                Board.getFieldStatus(yEnd, xEnd).removePiece();
                                return true;
                            } else if(!Board.getFieldStatus(yEnd, xEnd - i).isVacant()) {
                                System.out.println("Invalid turn, collision detected!");
                                return false;
                            }
                        }
                    } else if(xEnd < xStart) {
                        for(int i = xStart - xEnd - 1; i >= 0; i--) {
                            if((Board.getFieldStatus(yEnd, xEnd + i).isVacant()) && (i <= 1)) {
                                System.out.println("Performed a strike on the " + Board.getFieldStatus(yEnd, xEnd).getPiece().getColor() + " " + Board.getFieldStatus(yEnd, xEnd).getPiece().getNameOfPiece() + "!");
                                Board.getFieldStatus(yEnd, xEnd).removePiece();
                                return true;
                            } else if(!Board.getFieldStatus(yEnd, xEnd + i).isVacant()) {
                                System.out.println("Invalid turn, collision detected!");
                                return false;
                            }
                        }
                    }
                }
            } else if (this.getPlayer() == Board.getFieldStatus(yEnd, xEnd).getPiece().getPlayer()) {
                System.out.println("Invalid turn, you can't strike your own piece!");
                return false;
            }
        }
        return false;
    }
}
