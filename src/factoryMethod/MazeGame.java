package factoryMethod;

import commonClasses.Door;
import commonClasses.Maze;
import commonClasses.Room;
import commonClasses.Wall;

/**
 * Created by Elia on 15/07/2014.
 */
public class MazeGame {
    public Maze makeMaze() { return new Maze(); }
    public Room makeRoom() { return new Room(); }
    public Wall makeWall() { return new Wall(); }
    public Door makeDoor(Room r1, Room r2) { return new Door(r1, r2); }
}
