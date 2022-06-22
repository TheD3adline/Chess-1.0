public abstract class Piece {

    private int player;
    private String color;
    private final String ANSI_GREEN = "\u001B[32m";
    private final String ANSI_RED = "\u001B[31m";
    private final String ANSI_RESET = "\u001B[0m";

    public Piece(int player) {
        this.player = player;
        if(player == 1) {
            this.color = "Green";
        } else if(player == 2) {
            this.color = "Red";
        }
    }

    public abstract String getSymbol();
    public abstract String getLegend();
    public abstract String getNameOfPiece();

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getANSI_GREEN() {
        return ANSI_GREEN;
    }

    public String getANSI_RED() {
        return ANSI_RED;
    }

    public String getANSI_RESET() {
        return ANSI_RESET;
    }
}