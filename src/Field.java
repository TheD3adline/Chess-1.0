public class Field {

    private boolean vacant;
    private Piece piece;

    public Field() {
        this.vacant = false;
    }

    public Field(Piece piece) {
        this.vacant = true;
        this.piece = piece;
    }

    public char report() {
        return ' ';
    }
}
