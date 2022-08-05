public class Main {
    public static void main(String[] args) {

        Player green = new Player("Green");
        Player red = new Player("Red");
        Board board = new Board(green);
        board.placePieces(green, red);
        while(true) {
            board.draw();
            board.turn(red);
            board.draw();
            board.turn(red);
        }
    }
}