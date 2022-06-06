public abstract class Piece {

    private int belongsToPlayer;
    private String belongsToColor;

    public Piece(int belongsToPlayer) {
        this.belongsToPlayer = belongsToPlayer;
        if(belongsToPlayer == 1) {
            this.belongsToColor = "White";
        } else if(belongsToPlayer == 2) {
            this.belongsToColor = "Black";
        }
    }

    public int getBelongsToPlayer() {
        return belongsToPlayer;
    }

    public void setBelongsToPlayer(int belongsToPlayer) {
        this.belongsToPlayer = belongsToPlayer;
    }

    public String getBelongsToColor() {
        return belongsToColor;
    }

    public void setBelongsToColor(String belongsToColor) {
        this.belongsToColor = belongsToColor;
    }

    public abstract String getSymbol();
    /*
                        "\u2654 " + // white king
                        "\u2655 " + // white queen
                        "\u2656 " + // white rook
                        "\u2657 " + // white bishop
                        "\u2658 " + // white knight
                        "\u2659 " + // white pawn

                        "\u265A " + // black king
                        "\u265B " + // black queen
                        "\u265C " + // black rook
                        "\u265D " + // black bishop
                        "\u265E " + // black knight
                        "\u265F " + // black pawn

    */
}