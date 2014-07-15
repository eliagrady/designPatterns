package commonClasses;

/**
 * Created by Elia on 15/07/2014.
 */
public class Door extends MapSite {
    private static int _doorCount = 1;
    private int _doorNumber;
    private Room _room1;
    private Room _room2;

    public Door(Room r1, Room r2) {
        _doorNumber = _doorCount++;
        System.out.println("creating a Door #" + _doorNumber + " between " + r1 + " and " + r2);
        _room1 = r1;
        _room2 = r2;
    }

    public String toString() {
        return "Door #" + new Integer(_doorNumber).toString();
    }
}
