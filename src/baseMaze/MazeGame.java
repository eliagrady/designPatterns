package baseMaze;

import commonClasses.*;

/**
 * Created by Elia on 15/07/2014.
 */
public class MazeGame {
    public Maze createMaze() {
        Maze aMaze = new Maze();
        Room r1 = new Room();
        Room r2 = new Room();
        Door theDoor = new Door(r1,r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.North, new Wall());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, new Wall());
        r1.setSide(Direction.West, new Wall());

        r2.setSide(Direction.North, new Wall());
        r2.setSide(Direction.East, new Wall());
        r2.setSide(Direction.South, new Wall());
        r2.setSide(Direction.West, theDoor);

        return aMaze;
    }
}
