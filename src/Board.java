public class Board {

    private Field[][] fields;

    public Board() {
        fields = new Field[8][8];
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        for(int y = 0; y < fields.length; y++) {
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
