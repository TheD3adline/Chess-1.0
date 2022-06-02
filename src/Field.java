public class Field {

    private boolean vacant;
    private Piece piece;
    private final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    private final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    private final String ANSI_RESET = "\u001B[0m";

    public Field() {
        this.vacant = false;
        this.piece = null;
    }

    public Field(Piece piece) {
        this.vacant = true;
        this.piece = piece;
    }

    public String status(int y, int x) {
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
