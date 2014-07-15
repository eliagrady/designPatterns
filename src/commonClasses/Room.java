package commonClasses;

/**
 * Created by Elia on 15/07/2014.
 */
public class Room {
    private int _roomNumber;
    private static int _roomCount = 1;
    private MapSite _northSide;
    private MapSite _southSide;
    private MapSite _eastSide;
    private MapSite _westSide;

    public Room() {
        _roomNumber = _roomCount++;
        System.out.println("Creating room #"+ + _roomNumber);
    }

    public void setSide(Direction direction, MapSite site) {
        if( direction == Direction.North) {
            _northSide = site;
        }
        else if(direction == Direction.South) {
            _southSide = site;
        }
        else if(direction == Direction.East) {
            _eastSide = site;
        }
        else if(direction == Direction.West) {
            _westSide = site;
        }
        System.out.println("setting " + direction.toString() + " side of " +  this.toString() + " to " + site.toString());
    }

    MapSite getSide(Direction direction) {
        MapSite result = null;
        if(direction == Direction.North) {
            result = _northSide;
        } else if(direction == Direction.South) {
            result = _southSide;
        } else if(direction == Direction.East) {
            result = _southSide;
        } else if(direction == Direction.West) {
            result = _southSide;
        }
        return result;
    }

    public String toString() {
        return "Room #" + new Integer(_roomNumber).toString();
    }
}
