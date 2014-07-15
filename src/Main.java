import baseMaze.MazeGame;

public class Main {

    public static void main(String[] args) {
        factoryMethod();
    }

    private static void basicMaze() {
        MazeGame game = new MazeGame();
        game.createMaze();
    }

    private static void factoryMethod() {

    }
}
