public abstract class Piece extends Player {

    private String ANSI_COLOR;
    private final String ANSI_RESET = "\u001B[0m";

    public Piece(int playerNumber, String playerColor) {
        super(playerNumber, playerColor);
        if(playerNumber == 1) {
            this.ANSI_COLOR = "\u001B[32m";
        } else if(playerNumber == 2) {
            this.ANSI_COLOR = "\u001B[31m";
        }
    }

    public String getANSI_COLOR() {
        return ANSI_COLOR;
    }

    public void setANSI_COLOR(String ANSI_COLOR) {
        this.ANSI_COLOR = ANSI_COLOR;
    }

    public String getANSI_RESET() {
        return ANSI_RESET;
    }
}
