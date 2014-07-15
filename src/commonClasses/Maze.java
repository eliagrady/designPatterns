package commonClasses;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Elia on 15/07/2014.
 */
public class Maze {
    private Set _rooms = new HashSet();

    Maze() {
        System.out.println("Creating a Maze");
    }
    public void addRoom(Room r) {
        if(!_rooms.contains(r)) {
            _rooms.add(r);
        }
    }
}
