public class Field {

    private boolean vacant;
    private Piece piece;
    private final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    private final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private final String ANSI_RESET = "\u001B[0m";

    public Field() {
        this.vacant = true;
        this.piece = null;
    }

    public String status(int y, int x) {
        if(piece != null) {
            if((y % 2) == 0) {
                if((x % 2) == 0) {
                    return ANSI_WHITE_BACKGROUND + " " + piece.getSymbol() + ANSI_WHITE_BACKGROUND + " " + ANSI_RESET;
                } else {
                    return ANSI_BLACK_BACKGROUND + " " + piece.getSymbol() + ANSI_BLACK_BACKGROUND + " " + ANSI_RESET;
                }
            } else {
                if((x % 2) == 1) {
                    return ANSI_WHITE_BACKGROUND + " " + piece.getSymbol() + ANSI_WHITE_BACKGROUND + " " + ANSI_RESET;
                } else {
                    return ANSI_BLACK_BACKGROUND + " " + piece.getSymbol() + ANSI_BLACK_BACKGROUND + " " + ANSI_RESET;
                }
            }
        } else {
            if((y % 2) == 0) {
                if((x % 2) == 0) {
                    return ANSI_WHITE_BACKGROUND + "   " + ANSI_RESET;
                } else {
                    return ANSI_BLACK_BACKGROUND + "   " + ANSI_RESET;
                }
            } else {
                if((x % 2) == 1) {
                    return ANSI_WHITE_BACKGROUND + "   " + ANSI_RESET;
                } else {
                    return ANSI_BLACK_BACKGROUND + "   " + ANSI_RESET;
                }
            }
        }
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        this.vacant = false;
    }

    public void removePiece() {
        this.piece = null;
        this.vacant = true;
    }
}
