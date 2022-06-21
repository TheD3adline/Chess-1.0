import java.util.Scanner;

public class Board {

    private Field[][] fields;
    private String[] legends;
    Scanner sc;

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
        sc = new Scanner(System.in);
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

    public void turn(Player player) {
        String input;
        int y, x;
        System.out.print(player.getColor() + ", enter field to select your piece for the turn (format examples: g5, a2, or e8): ");
        input = sc.next();
        if((input.charAt(0) == 'a') || (input.charAt(0) == 'b') || (input.charAt(0) == 'c') || (input.charAt(0) == 'd') || (input.charAt(0) == 'e') || (input.charAt(0) == 'f') || (input.charAt(0) == 'g') || (input.charAt(0) == 'h')) {
            if((input.charAt(1) == '1') || (input.charAt(1) == '2') || (input.charAt(1) == '3') || (input.charAt(1) == '4') || (input.charAt(1) == '5') || (input.charAt(1) == '6') || (input.charAt(1) == '7') || (input.charAt(1) == '8')) {

            }
        }
    }
}
