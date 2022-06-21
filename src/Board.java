public class Board {

    private Field[][] fields;
    private String[] legends;

    public Board(Player green) {
        fields = new Field[8][8];
        for (int y = 0; y < fields.length; y++) {
            for (int x = 0; x < fields[0].length; x++) {
                fields[y][x] = new Field();
            }
        }
        legends = new String[6];
        for(int k = 7, l = 0; k < 13; k++, l++) {
            legends[l] = green.getPiece(k).getLegend();
        }
    }

    public void placePieces(Player green, Player red) {
        int i = 15, j = 0;
        for(int y = 0; y < 2; y++) {
            for(int x = 0; x < fields[0].length; x++) {
                fields[y][x].setPiece(red.getPiece(i));
                i--;
            }
        }
        for(int y = 6; y < fields.length; y++) {
            for(int x = 0; x < fields[0].length; x++) {
                fields[y][x].setPiece(green.getPiece(j));
                j++;
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
            if(y < 6) {
                System.out.println(" " + (8 - y) + "        " + legends[y]);
            } else {
                System.out.println(" " + (8 - y));
            }
        }
        System.out.println("   a  b  c  d  e  f  g  h ");
    }
}
