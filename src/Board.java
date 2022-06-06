public class Board {

    private Field[][] fields;

    public Board() {
        fields = new Field[8][8];
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Pawn[] whitePawns = new Pawn[8];
        for(int i = 0; i < whitePawns.length; i++) {
            whitePawns[i] = new Pawn(1);
        }
        Rook whiteRook1 = new Rook(1);
        Rook whiteRook2 = new Rook(1);
        Knight whiteKnight1 = new Knight(1);
        Knight whiteKnight2 = new Knight(1);
        Bishop whiteBishop1 = new Bishop(1);
        Bishop whiteBishop2 = new Bishop(1);
        Queen whiteQueen = new Queen(1);
        King whiteKing = new King(1);
        Pawn[] blackPawns = new Pawn[8];
        for(int i = 0; i < blackPawns.length; i++) {
            blackPawns[i] = new Pawn(2);
        }
        Rook blackRook1 = new Rook(2);
        Rook blackRook2 = new Rook(2);
        Knight blackKnight1 = new Knight(2);
        Knight blackKnight2 = new Knight(2);
        Bishop blackBishop1 = new Bishop(2);
        Bishop blackBishop2 = new Bishop(2);
        Queen blackQueen = new Queen(2);
        King blackKing = new King(2);
        fields[0][0] = new Field(blackRook1);
        fields[0][1] = new Field(blackKnight1);
        fields[0][2] = new Field(blackBishop1);
        fields[0][3] = new Field(blackQueen);
        fields[0][4] = new Field(blackKing);
        fields[0][5] = new Field(blackBishop2);
        fields[0][6] = new Field(blackKnight2);
        fields[0][7] = new Field(blackRook2);
        for(int i = 0; i < fields[0].length; i++) {
            fields[1][i] = new Field(blackPawns[i]);
        }
        for(int i = 0; i < fields[0].length; i++) {
            fields[6][i] = new Field(whitePawns[i]);
        }
        fields[7][0] = new Field(whiteRook1);
        fields[7][1] = new Field(whiteKnight1);
        fields[7][2] = new Field(whiteBishop1);
        fields[7][3] = new Field(whiteQueen);
        fields[7][4] = new Field(whiteKing);
        fields[7][5] = new Field(whiteBishop2);
        fields[7][6] = new Field(whiteKnight2);
        fields[7][7] = new Field(whiteRook2);
        for(int y = 2; y < 6; y++) {
            for(int x = 0; x < fields[0].length; x++) {
                fields[y][x] = new Field();
            }
        }
    }

    public void draw() {
        System.out.println("   a  b  c  d  e  f  g  h ");
        for(int y = 0; y < fields.length; y++) {
            System.out.print((8 - y) + " ");
            for(int x = 0; x < fields[0].length; x++) {
                System.out.print(fields[y][x].status(y, x));
            }
            System.out.println(" " + (8 - y));
        }
        System.out.println("   a  b  c  d  e  f  g  h ");
    }
}
