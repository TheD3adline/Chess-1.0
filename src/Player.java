public abstract class Player {

    private int playerNumber;
    private String playerColor;

    public Player(int playerNumber, String playerColor) {
        this.playerNumber = playerNumber;
        this.playerColor = playerColor;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }
}
