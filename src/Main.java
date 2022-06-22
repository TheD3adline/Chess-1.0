public class Main {
    public static void main(String[] args) {

        Player green = new Player("Green");
        Player red = new Player("Red");
        Board board = new Board(green);
        board.draw();
        board.placePieces(green, red);
        board.draw();
        board.turn(green);
        board.draw();
    }
}