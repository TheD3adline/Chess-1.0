public class Player {

    private int playerNumber;
    private String playerColor;

    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        if(playerNumber == 1) {
            this.playerColor = "White";
        } else if(playerNumber == 2) {
            this.playerColor = "Black";
        }
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
