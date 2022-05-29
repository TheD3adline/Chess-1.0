public class Board {

    private Field[][] fields;

    public Board() {
        fields = new Field[8][8];
        for(int y = 0; y < fields.length; y++) {
            for(int x = 0; x < fields[0].length; x++) {
                fields[y][x] = new Field();
            }
        }
    }

    public void draw() {
        for(int y = 0; y < fields.length; y++) {
            System.out.print("|");
            for(int x = 0; x < fields[0].length; x++) {
                System.out.print(fields[y][x].report() + "|");
            }
            System.out.println();
        }
    }
}
