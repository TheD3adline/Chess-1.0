public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        Player green = new Player("Green");
        Player red = new Player("Red");
        board.placePieces(green, red);
        board.draw();
    }
}