public class Board {

    private Field[][] fields;
    private String[] legend;

    public Board() {
        fields = new Field[8][8];
        Pawn[] redPawns = new Pawn[8];
        for(int i = 0; i < redPawns.length; i++) {
            redPawns[i] = new Pawn(2);
        }
        Rook redRook1 = new Rook(2);
        Rook redRook2 = new Rook(2);
        Knight redKnight1 = new Knight(2);
        Knight redKnight2 = new Knight(2);
        Bishop redBishop1 = new Bishop(2);
        Bishop redBishop2 = new Bishop(2);
        Queen redQueen = new Queen(2);
        King redKing = new King(2);
        Pawn[] greenPawns = new Pawn[8];
        for(int i = 0; i < greenPawns.length; i++) {
            greenPawns[i] = new Pawn(1);
        }
        Rook greenRook1 = new Rook(1);
        Rook greenRook2 = new Rook(1);
        Knight greenKnight1 = new Knight(1);
        Knight greenKnight2 = new Knight(1);
        Bishop greenBishop1 = new Bishop(1);
        Bishop greenBishop2 = new Bishop(1);
        Queen greenQueen = new Queen(1);
        King greenKing = new King(1);
        fields[0][0] = new Field(redRook1);
        fields[0][1] = new Field(redKnight1);
        fields[0][2] = new Field(redBishop1);
        fields[0][3] = new Field(redQueen);
        fields[0][4] = new Field(redKing);
        fields[0][5] = new Field(redBishop2);
        fields[0][6] = new Field(redKnight2);
        fields[0][7] = new Field(redRook2);
        for(int i = 0; i < fields[0].length; i++) {
            fields[1][i] = new Field(redPawns[i]);
        }
        for(int i = 0; i < fields[0].length; i++) {
            fields[6][i] = new Field(greenPawns[i]);
        }
        fields[7][0] = new Field(greenRook1);
        fields[7][1] = new Field(greenKnight1);
        fields[7][2] = new Field(greenBishop1);
        fields[7][3] = new Field(greenQueen);
        fields[7][4] = new Field(greenKing);
        fields[7][5] = new Field(greenBishop2);
        fields[7][6] = new Field(greenKnight2);
        fields[7][7] = new Field(greenRook2);
        for(int y = 2; y < 6; y++) {
            for(int x = 0; x < fields[0].length; x++) {
                fields[y][x] = new Field();
            }
        }
        legend = new String[8];
        legend[0] = "Legend:";
        legend[1] = "   ";
        legend[2] = "K...King";
        legend[3] = "Q...Queen";
        legend[4] = "B...Bishop";
        legend[5] = "N...Knight";
        legend[6] = "R...Rook";
        legend[7] = "P...Pawn";
    }

    public void draw() {
        System.out.println("   a  b  c  d  e  f  g  h ");
        for(int y = 0; y < fields.length; y++) {
            System.out.print((8 - y) + " ");
            for(int x = 0; x < fields[0].length; x++) {
                System.out.print(fields[y][x].status(y, x));
            }
            System.out.println(" " + (8 - y) + "      |" + legend[y]);
        }
        System.out.println("   a  b  c  d  e  f  g  h ");
    }
}
