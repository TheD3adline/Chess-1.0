public class Player {

    private String color;
    private Piece[] roster;

    public Player(String color) {
        this.color = color;
        if(this.color.equals("Green")) {
            roster = new Piece[16];
            for(int i = 0; i < 8; i++) {
                roster[i] = new Pawn(1);
            }
            roster[8] = new Rook(1);
            roster[9] = new Knight(1);
            roster[10] = new Bishop(1);
            roster[11] = new Queen(1);
            roster[12] = new King(1);
            roster[13] = new Bishop(1);
            roster[14] = new Knight(1);
            roster[15] = new Rook(1);
        } else if(this.color.equals("Red")) {
            roster = new Piece[16];
            for(int i = 0; i < 8; i++) {
                roster[i] = new Pawn(2);
            }
            roster[8] = new Rook(2);
            roster[9] = new Knight(2);
            roster[10] = new Bishop(2);
            roster[11] = new King(2);
            roster[12] = new Queen(2);
            roster[13] = new Bishop(2);
            roster[14] = new Knight(2);
            roster[15] = new Rook(2);
        }
    }

    public Piece getPiece(int i) {
        return this.roster[i];
    }
}
