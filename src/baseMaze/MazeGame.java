package baseMaze;

import commonClasses.Door;
import commonClasses.Maze;
import commonClasses.Room;

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

        return aMaze;
    }
}
